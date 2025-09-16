import React from "react";
import Layout from './Component/Layout'
import Button from './Component/Button'

function App() {
  const name = "Kuldeep";

  return (
    <>
    <h1>{`${name}`}</h1>
      <Layout>
        <div style={{padding: "25px", border: "2px solid", backgroundColor: "aque" }}>Box 1</div>
        <div style={{padding: "25px", border: "2px solid", backgroundColor: "yellow", color: "black" }}>Box 2</div>
        <div style={{padding: "25px", border: "2px solid", backgroundColor: "red" }}>Box 3</div>
      </Layout>
      <Button>
        <button>Submit</button>
        <button>Delete</button>
        <button>Update</button>
      </Button>
    </>
  );
}

export default App;
