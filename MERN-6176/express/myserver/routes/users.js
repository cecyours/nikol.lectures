var express = require('express');
const { default: User } = require('../models/user');
var router = express.Router()


router.get('/', async function (req, res) {
  try {
    const userData = await User.find()
    res.status(200).json({ message: "user created successfully", user: userData })
  } catch (error) {
    console.log(error);
    res.status(500).json({ message: "failed to fetch user" })

  }
})



router.post('/', async function (req, res) {
  try {
    const data = req.body
    const userdata = await User.create(data)
    res.status(201).json({ message: "user created successfully", user: userdata })
  } catch (err) {
    console.log(err);
    res.status(500).json({ message: "failed to create user" })
  }
})


// router.get('/:id', function (req, res) {
//   const { id } = req.params

//   const filterd = todos.filter(t => t.id === Number(id))

//   res.json(filterd)
// })

module.exports = router