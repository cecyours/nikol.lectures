import React, { useRef } from "react";

const UnControlled = () => {
  const inputRef = useRef(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Input value:", inputRef.current.value);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" placeholder="Type something" ref={inputRef} />

      <button type="submit">Submit</button>
    </form>
  );
};

export default UnControlled;
