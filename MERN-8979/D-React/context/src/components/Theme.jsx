import React, { useContext } from "react";
import { ThemeContext } from "../context/ThemeContext";

const Theme = () => {
  const { theme, toggleTheme } = useContext(ThemeContext);
  return (
    <div>
      <button onClick={toggleTheme}>Click Me</button>
    </div>
  );
};

export default Theme;
