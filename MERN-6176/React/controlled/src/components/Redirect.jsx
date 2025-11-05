import React from "react";
import usenavigate from "react-router";

const Redirect = () => {
  const navigate = usenavigate();

  const handleClick = () => {
    navigate("www.google.com");
  };

  return (
    <div>
      <button onClick={handleClick}>click me </button>
    </div>
  );
};

export default Redirect;
