var express = require('express');
var router = express.Router();


// user json 

const user = [
  {
    "id": 1,
    "name": "Alice Johnson",
    "title": "Frontend Developer",
    "body": "Specializes in building responsive UI components."
  },
  {
    "id": 2,
    "name": "Michael Smith",
    "title": "Backend Engineer",
    "body": "Experienced in database design and API development."
  },
  {
    "id": 3,
    "name": "Sophia Williams",
    "title": "Project Manager",
    "body": "Expert in agile methodologies and workflow optimization."
  },
  {
    "id": 4,
    "name": "Daniel Martinez",
    "title": "UI/UX Designer",
    "body": "Focuses on creating intuitive and user-friendly designs."
  },
  {
    "id": 5,
    "name": "Emma Davis",
    "title": "Full Stack Developer",
    "body": "Passionate about scalable application architecture."
  },
  {
    "id": 6,
    "name": "James Miller",
    "title": "QA Engineer",
    "body": "Ensures product quality through manual and automated testing."
  },
  {
    "id": 7,
    "name": "Olivia Brown",
    "title": "Data Analyst",
    "body": "Analyzes datasets to discover trends and insights."
  },
  {
    "id": 8,
    "name": "Henry Wilson",
    "title": "DevOps Engineer",
    "body": "Works with CI/CD pipelines and cloud infrastructure."
  },
  {
    "id": 9,
    "name": "Ava Thompson",
    "title": "Security Specialist",
    "body": "Protects applications by identifying vulnerabilities."
  },
  {
    "id": 10,
    "name": "Lucas Anderson",
    "title": "Mobile Developer",
    "body": "Builds performant apps for Android and iOS."
  }
]

/* GET users listing. */
router.get('/', function (req, res) {
  res.json(user);
});




module.exports = router;
