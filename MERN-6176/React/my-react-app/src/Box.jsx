import React from 'react'

function Box(props) {
  return (
    <div style={{ border: "2px solid blue", padding: "10px", margin: "10px" }}>
      <h2>This is a box component!</h2>
      <p>{props.children}</p>
    </div>
  )
}

export default Box