import React from "react";
import { Link } from "react-router";

const NotFound = () => {
  return (
    <div>
      <h1>404 | This is can't be found</h1>

      <Link to={"/"}> Back to home </Link>
    </div>
  );
};

export default NotFound;
