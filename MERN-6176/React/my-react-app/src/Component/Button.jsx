import React from 'react'

function Button(props) {
  return (
    <div style={{backgroundColor: "green", display: "flex", gap: "10px 20px"}}>
      {props.children}
    </div>
  )
}

export default Button
