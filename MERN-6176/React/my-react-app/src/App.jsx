import React from "react";
import Layout from "./Component/Layout";
import Button from "./Component/Button";
import ClassComp from "./Component/ClassComp";
import PureComp from "./Component/PureComp";
import Child from "./Component/Child";
import Counter from "./Component/Counter";
import Card from "./Component/Card";
import Event from "./Component/Event";
// import { students } from "./json/data.json";

function App() {
  const name = "Kuldeep";

  return (
    <>
      <h1>{name}</h1>
      {/* <Layout>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "aque",
          }}
        >
          Box 1
        </div>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "yellow",
            color: "black",
          }}
        >
          Box 2
        </div>
        <div
          style={{
            padding: "25px",
            border: "2px solid",
            backgroundColor: "red",
          }}
        >
          Box 3
        </div>
      </Layout>
      <Button>
        <button>Submit</button>
        <button>Delete</button>
        <button>Update</button>
      </Button>
      <div>
        <ClassComp name="Kuldeep" />
      </div>
      <div>
        <PureComp />
      </div> */}

      {/* <Child>
        <h1>hello</h1>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptate
          hic soluta odio temporibus error minus, reiciendis voluptas! Repellat
          itaque dolores rem, cupiditate odio quae, deleniti aperiam consectetur
          asperiores modi incidunt, maxime ullam voluptas saepe.
        </p>
      </Child> */}

      {/* <Counter /> */}

      {/* <Card students={students} /> */}

      <Event />
    </>
  );
}

export default App;
