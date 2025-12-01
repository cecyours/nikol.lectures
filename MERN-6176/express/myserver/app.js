var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var studentRouter = require('./routes/students')
var todoRouter = require('./routes/todos')
var mongoose = require('mongoose')


var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/todos', todoRouter)
app.use('/students', studentRouter)



// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

const STR = "mongodb+srv://rabariv832_db_user:mUVsEaxkYpFyJmcO@cluster0.h1cs1cz.mongodb.net/kuldb"

mongoose.connect(STR).then(() => console.log("Database coonect ho gaya✅")).catch((err) => console.log("Kuch to gadbad hain db connect me❌", err))

// error handler
app.use(function (err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;



// mongodb+srv://rabariv832_db_user:mUVsEaxkYpFyJmcO@cluster0.h1cs1cz.mongodb.net/?appName=Cluster0