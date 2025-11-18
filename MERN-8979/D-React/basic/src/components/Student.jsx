import React from "react";

const Student = ({ stuName = "CEC", stuClass = 11, stuRoll = 34 }) => {
  return (
    <div> 
      <h1>
        hello my name is {stuName} i am in {stuClass} and my roll number is{" "}
        {stuRoll}
      </h1>
    </div>
  );
};

export default Student;
