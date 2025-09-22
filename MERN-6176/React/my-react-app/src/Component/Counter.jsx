import React, { useState } from "react";

const Counter = () => {
  const [counter, setCounter] = useState(0);

  const handleIncrement = () => {
    setCounter(counter + 1);
  };

  const handleDecrement = () => {
    if (counter <= 0) return;
    setCounter(counter - 1);
  };

  const handleIncrementByTen = () => {
    setCounter(counter + 10);
  };

  const handleDecrementByTen = () => {
    if (counter <= 0) return;

    setCounter(counter - 10);
  };

  return (
    <div>
      <button onClick={handleDecrementByTen}>Decrement by 10 </button>
      <br />

      <button onClick={handleDecrement}>-</button>

      <span style={{ margin: "23px" }}> {counter}</span>

      <button onClick={handleIncrement}>+</button>

      <br />
      <button onClick={handleIncrementByTen}>Increment by 10 </button>
      <br />
      {"🚀".repeat(counter)}

      <br />
    </div>
  );
};

export default Counter;
