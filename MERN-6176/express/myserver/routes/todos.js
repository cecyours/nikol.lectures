var express = require('express')
var router = express.Router()



const todos = [
    {
        "userId": 1,
        "id": 1,
        "title": "Finish JavaScript module",
        "completed": false
    },
    {
        "userId": 1,
        "id": 2,
        "title": "Read documentation on async/await",
        "completed": true
    },
    {
        "userId": 1,
        "id": 3,
        "title": "Implement login API",
        "completed": false
    },
    {
        "userId": 2,
        "id": 4,
        "title": "Design database schema",
        "completed": true
    },
    {
        "userId": 2,
        "id": 5,
        "title": "Fix UI responsiveness issues",
        "completed": false
    },
    {
        "userId": 2,
        "id": 6,
        "title": "Refactor utility functions",
        "completed": false
    },
    {
        "userId": 3,
        "id": 7,
        "title": "Write unit tests for components",
        "completed": true
    },
    {
        "userId": 3,
        "id": 8,
        "title": "Optimize API requests",
        "completed": false
    },
    {
        "userId": 3,
        "id": 9,
        "title": "Update project documentation",
        "completed": true
    },
    {
        "userId": 4,
        "id": 10,
        "title": "Set up CI/CD pipeline",
        "completed": false
    }
]


router.get('/', function (req, res) {
    res.json(todos)
})


router.get('/:id', function (req, res) {
    const { id } = req.params
    const filterd = todos.filter(t => t.id === Number(id))
    res.json(filterd)
})

module.exports = router