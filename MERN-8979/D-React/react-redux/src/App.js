import logo from './logo.svg';
import './App.css';
import { useDispatch, useSelector } from 'react-redux'
import { decrement, increment } from './redux/counterSlice';

function App() {

  const { counter } = useSelector((state) => state.counter)
  const dispatch = useDispatch()


  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

        <div>
          <button onClick={() => dispatch(increment())}>Increment</button>

          <button onClick={() => dispatch(decrement())}>Decrement</button>
        </div>

        <h1>{counter}</h1>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React  and
        </a>
      </header>
    </div>
  );
}

export default App;
