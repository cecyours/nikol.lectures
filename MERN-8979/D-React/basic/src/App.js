import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Student from './components/Student';
import StudentList from './components/StudentList';
import Button from './components/Button';
import TypingPlayground from './components/TypingPlayground';
import Keyboard from './components/Keyboard';

function App() {



  const [name, setName] = useState("Devang")
  const [course, setCourse] = useState('MERN')
  const [year, setYear] = useState(2025)



  // arrow function
  function handleChange() {
    setName("CEC")
    setCourse('Java')
    setYear(2042)
  }


  const Students = [
    { roll: 1, name: "vishal", course: "MERN Stack" },
    { roll: 2, name: "devang", course: "Full Stack" },
    { roll: 3, name: "pavan", course: "MEAN Stack" },
    { roll: 4, name: "sahil", course: "WAEM Stack" }

  ]



  return (
    <div className="App">
      <h4>
        hello , i am {name} and now i am studying {course} in {year}
      </h4>

      <button onClick={handleChange}  >Click me for change values</button>

      <Student stuRoll={55} stuName={"Devang"} />

      {/* <Student stuRoll={25} stuName={"vishal"} /> */}


      {/* <Student /> */}


      {/* <StudentList students={Students} /> */}


      <TypingPlayground />



      <Keyboard />



      <Button />

    </div>
  );
}

export default App;
