import React from "react";

const Card = ({ students }) => {
  return (
    <div className="row  gap-2 p-5 ">
      {students.map((student) => (
        <div
          key={student.id}
          className="bg-light p-3 border border-black w-25 rounded-3  mt-3 col-4"
        >
          <p>Roll No : {student.id}</p>
          <h6> Name : {student.name}</h6>
          <p>Grade : {student.grade}</p>
          <small>{student.course}</small>
        </div>
      ))}
    </div>
  );
};

export default Card;
