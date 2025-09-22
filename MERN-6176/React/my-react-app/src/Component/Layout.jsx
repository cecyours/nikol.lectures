import React from 'react'

function Layout(props) {
  return (
    <div style={{backgroundColor: "blue", border: "1px solid black", display: "flex"}}>
      {props.children}
    </div>
  )
}

export default Layout
