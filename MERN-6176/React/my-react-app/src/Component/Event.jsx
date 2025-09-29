import React, { useState } from "react";

const Event = () => {
  const [name, setName] = useState("");

  const handleChange = (e) => {
    console.log(e);
    setName(e.target.value);
  };

  const getName = (username) => {
    alert(`Hello, ${username}`);
  };

  return (
    <div style={{ padding: "20px" }}>
      <input
        type="text"
        className="mb-5"
        placeholder="Enter your name"
        onChange={handleChange}
      />

      <br />

      <button className="btn btn-primary btn-sm" onClick={() => getName(name)}>
        Click here to get your name
      </button>
    </div>
  );
};

export default Event;
