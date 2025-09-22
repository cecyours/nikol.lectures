import React from "react";
import Layout from "./Component/Layout";
import Button from "./Component/Button";
import ClassComp from "./Component/ClassComp";
import PureComp from "./Component/PureComp";
import Child from "./Component/Child";
import Counter from "./Component/Counter";
import Card from "./Component/Card";

function App() {
  const name = "Kuldeep";
const students = [
  {
    id: 1,
    name: "Aarav Sharma",
    age: 20,
    grade: "A",
    course: "Computer Science",
  },
  {
    id: 2,
    name: "Isha Patel",
    age: 22,
    grade: "B",
    course: "Mechanical Engineering",
  },
  {
    id: 3,
    name: "Rohan Gupta",
    age: 19,
    grade: "A+",
    course: "Electrical Engineering",
  },
  {
    id: 4,
    name: "Simran Kaur",
    age: 21,
    grade: "B+",
    course: "Information Technology",
  },
  {
    id: 5,
    name: "Vikram Singh",
    age: 23,
    grade: "A",
    course: "Civil Engineering",
  },
  {
    id: 6,
    name: "Neha Verma",
    age: 20,
    grade: "A-",
    course: "Biotechnology",
  },
  {
    id: 7,
    name: "Aditya Mehra",
    age: 22,
    grade: "B",
    course: "Aerospace Engineering",
  },
  {
    id: 8,
    name: "Priya Nair",
    age: 21,
    grade: "A",
    course: "Computer Applications",
  },
  {
    id: 9,
    name: "Karan Joshi",
    age: 24,
    grade: "B+",
    course: "Mechanical Engineering",
  },
  {
    id: 10,
    name: "Ananya Roy",
    age: 19,
    grade: "A+",
    course: "Data Science",
  },
  {
    id: 11,
    name: "Rahul Yadav",
    age: 23,
    grade: "B",
    course: "Civil Engineering",
  },
  {
    id: 12,
    name: "Sneha Kapoor",
    age: 20,
    grade: "A",
    course: "Information Technology",
  },
  {
    id: 13,
    name: "Arjun Desai",
    age: 22,
    grade: "A-",
    course: "Computer Science",
  },
  {
    id: 14,
    name: "Meera Iyer",
    age: 21,
    grade: "B+",
    course: "Electronics Engineering",
  },
  {
    id: 15,
    name: "Siddharth Rao",
    age: 23,
    grade: "A",
    course: "Artificial Intelligence",
  },
  {
    id: 16,
    name: "Pooja Sharma",
    age: 19,
    grade: "A+",
    course: "Cybersecurity",
  },
  {
    id: 17,
    name: "Varun Bansal",
    age: 22,
    grade: "B",
    course: "Mechanical Engineering",
  },
  {
    id: 18,
    name: "Tanya Malhotra",
    age: 20,
    grade: "A",
    course: "Robotics",
  },
  {
    id: 19,
    name: "Harsh Jain",
    age: 21,
    grade: "B+",
    course: "Software Engineering",
  },
  {
    id: 20,
    name: "Kavya Reddy",
    age: 22,
    grade: "A",
    course: "Data Analytics",
  },
];

  return (
    <>
      <h1>{name}</h1>
      {/* <Layout>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "aque",
          }}
        >
          Box 1
        </div>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "yellow",
            color: "black",
          }}
        >
          Box 2
        </div>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "red",
          }}
        >
          Box 3
        </div>
      </Layout>
      <Button>
        <button>Submit</button>
        <button>Delete</button>
        <button>Update</button>
      </Button>
      <div>
        <ClassComp name="Kuldeep" />
      </div>
      <div>
        <PureComp />
      </div> */}

      {/* <Child>
        <h1>hello</h1>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptate
          hic soluta odio temporibus error minus, reiciendis voluptas! Repellat
          itaque dolores rem, cupiditate odio quae, deleniti aperiam consectetur
          asperiores modi incidunt, maxime ullam voluptas saepe.
        </p>
      </Child> */}

      <Counter />

      <Card students={students} />
    </>
  );
}

export default App;
