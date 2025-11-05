import { lazy, Suspense } from "react";
import "./App.css";
import Controlled from "./components/Controlled";
import Redirect from "./components/Redirect";

const UncontolledLazy = lazy(() => import("./components/Uncontolled"));

import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Suspense fallback={<h1>loading......</h1>}>
            <Controlled />

            <UncontolledLazy />

            <Redirect />
          </Suspense>
        </Routes>
      </Router>
    </>
  );
}

export default App;
