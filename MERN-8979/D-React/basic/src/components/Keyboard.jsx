import React, { useState } from "react";

const Keyboard = () => {
  const [letter, setLetter] = useState("");

  const handleChange = (e) => {
    console.log(e);
    setLetter(e.key);
  };
  return (
    <div>
      <input onKeyDown={(e) => handleChange(e)} />

      <h1>{letter}</h1>
    </div>
  );
};

export default Keyboard;
