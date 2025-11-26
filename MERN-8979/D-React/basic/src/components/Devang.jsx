import React, { useState } from "react";

const Devang = () => {
  const [name, setName] = useState(null);

  const DevangDey = () => {
    setName(name);
  };
  return (
    <div>
      <input type="text" onChange={(e) => DevangDey(e)} />

      {name && <h1>Hello {name}</h1>}
    </div>
  );
};

export default Devang;
