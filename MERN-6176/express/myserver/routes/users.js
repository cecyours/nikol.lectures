var express = require('express');
const { default: User } = require('../models/user');
var router = express.Router()


// router.get('/', function (req, res) {
//   res.json(todos)
// })



router.post('/', async function (req, res) {
  try {

    const userdata = await User.create()

  } catch (err) {
    console.log(err);
  }
})


// router.get('/:id', function (req, res) {
//   const { id } = req.params

//   const filterd = todos.filter(t => t.id === Number(id))

//   res.json(filterd)
// })

module.exports = router