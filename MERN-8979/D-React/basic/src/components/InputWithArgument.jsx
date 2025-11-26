import React, { useState } from "react";

const InputWithArgument = () => {
  const [name, setName] = useState(null);

  const handleChange = (name) => {
    setName(name);
  };

  return (
    <div>
      <input type="text" onChange={(e) => handleChange(e.target.value)} />

      {name && <h1>Hello , {name}</h1>}
    </div>
  );
};

export default InputWithArgument;
