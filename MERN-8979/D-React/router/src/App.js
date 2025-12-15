import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {


  const [todos, setTodos] = useState([])


  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/todos')
      .then(response => response.json())
      .then(json => setTodos(json))
  }, [])


  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >


          {todos.map((t, index) => (
            <div>
              {t.title}
              < hr />
            </div>
          ))}
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
