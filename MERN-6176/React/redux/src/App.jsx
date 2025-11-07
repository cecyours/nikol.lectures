import "./App.css";
import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "./redux/counterSlice";
function App() {
  const dispatch = useDispatch();
  const { counter } = useSelector((state) => state.Counter);

  return (
    <div>
      <button onClick={() => dispatch(decrement())}>-</button>

      <h1>{counter}</h1>

      <button onClick={() => dispatch(increment())}>+</button>
    </div>
  );
}

export default App;
