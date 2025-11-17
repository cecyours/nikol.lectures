import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Student from './components/Student';

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






  return (
    <div className="App">
      <h4>
        hello , i am {name} and now i am studying {course} in {year}
      </h4>
      <button onClick={handleChange}  >Click me for change values</button>



      <Student  stuRoll={55}  stuName={"Devang"} />


      <Student />




    </div>
  );
}

export default App;
