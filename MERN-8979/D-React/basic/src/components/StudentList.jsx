import React from "react";

const StudentList = ({ students }) => {
  return (
    <div>
      {students.map((student) => (
        <div>
          hello , i am roll number {student.roll}! my name is {student.name} and
          my course is {student.course}
          <br />
        </div>
      ))}
    </div>
  );
};

export default StudentList;
