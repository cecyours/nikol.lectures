var express = require('express')
var router = express.Router()



const Students = [
    {
        "id": 1,
        "name": "Aarav Sharma",
        "age": 18,
        "grade": "12th",
        "email": "aarav.sharma@example.com"
    },
    {
        "id": 2,
        "name": "Isha Patel",
        "age": 17,
        "grade": "11th",
        "email": "isha.patel@example.com"
    },
    {
        "id": 3,
        "name": "Rohan Mehta",
        "age": 19,
        "grade": "College 1st Year",
        "email": "rohan.mehta@example.com"
    },
    {
        "id": 4,
        "name": "Sara Khan",
        "age": 16,
        "grade": "10th",
        "email": "sara.khan@example.com"
    },
    {
        "id": 5,
        "name": "Vikram Singh",
        "age": 18,
        "grade": "12th",
        "email": "vikram.singh@example.com"
    },
    {
        "id": 6,
        "name": "Naina Verma",
        "age": 17,
        "grade": "11th",
        "email": "naina.verma@example.com"
    },
    {
        "id": 7,
        "name": "Dev Joshi",
        "age": 20,
        "grade": "College 2nd Year",
        "email": "dev.joshi@example.com"
    },
    {
        "id": 8,
        "name": "Priya Nair",
        "age": 15,
        "grade": "9th",
        "email": "priya.nair@example.com"
    },
    {
        "id": 9,
        "name": "Kabir Malhotra",
        "age": 18,
        "grade": "12th",
        "email": "kabir.malhotra@example.com"
    },
    {
        "id": 10,
        "name": "Maya Sen",
        "age": 17,
        "grade": "11th",
        "email": "maya.sen@example.com"
    },
    {
        "id": 11,
        "name": "Aditya Rao",
        "age": 19,
        "grade": "College 1st Year",
        "email": "aditya.rao@example.com"
    },
    {
        "id": 12,
        "name": "Sana Sheikh",
        "age": 16,
        "grade": "10th",
        "email": "sana.sheikh@example.com"
    },
    {
        "id": 13,
        "name": "Manav Kapoor",
        "age": 15,
        "grade": "9th",
        "email": "manav.kapoor@example.com"
    },
    {
        "id": 14,
        "name": "Diya Pandey",
        "age": 17,
        "grade": "11th",
        "email": "diya.pandey@example.com"
    },
    {
        "id": 15,
        "name": "Arjun Desai",
        "age": 18,
        "grade": "12th",
        "email": "arjun.desai@example.com"
    },
    {
        "id": 16,
        "name": "Riya Soni",
        "age": 20,
        "grade": "College 2nd Year",
        "email": "riya.soni@example.com"
    },
    {
        "id": 17,
        "name": "Kunal Bhat",
        "age": 16,
        "grade": "10th",
        "email": "kunal.bhat@example.com"
    },
    {
        "id": 18,
        "name": "Aisha Roy",
        "age": 15,
        "grade": "9th",
        "email": "aisha.roy@example.com"
    },
    {
        "id": 19,
        "name": "Harsh Trivedi",
        "age": 17,
        "grade": "11th",
        "email": "harsh.trivedi@example.com"
    },
    {
        "id": 20,
        "name": "Tanya Kulkarni",
        "age": 18,
        "grade": "12th",
        "email": "tanya.kulkarni@example.com"
    }
]



router.get('/', function (req, res) {
    res.json(Students)
})


router.get('/:id', function (req, res) {
    const { id } = req.params
    const filterd = Students.filter(t => t.id === Number(id))
    res.json(filterd)
})

module.exports = router