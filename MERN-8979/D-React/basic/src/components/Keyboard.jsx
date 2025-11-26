import React, { useState } from "react";

const Keyboard = () => {
  const [word, setWord] = useState("");

  const devang = (e) => {
    setWord(e.key);
  };
  return (
    <div>
      <input onKeyDown={(e) => devang(e)} />

      <h2>{word}</h2>
    </div>
  );
};

export default Keyboard;
