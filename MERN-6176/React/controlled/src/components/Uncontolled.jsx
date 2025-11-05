import React, { useEffect, useRef } from "react";

const Uncontolled = () => {
  const inputRef = useRef("vish");

  const dummer = () => {
    console.log(inputRef.current);
  };

  useEffect(() => {
    console.log("hello");
  }, []);

  return (
    <div>
      <input type="text" ref={inputRef} onChange={dummer} />
    </div>
  );
};

export default Uncontolled;
