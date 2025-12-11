import logo from './logo.svg';
import './App.css';
import Theme from './components/Theme';
import React, { Suspense, useContext } from 'react';
import { ThemeContext } from './context/ThemeContext';

const LazySample = React.lazy(() => import('./components/Sample'))


function App() {

  const { theme } = useContext(ThemeContext);

  return (
    <div className='box' style={{ backgroundColor: theme === "light" ? "black" : "white", color: theme === "light" ? "white" : "black" }} >
      <Suspense fallback={<h1>Loading....</h1>}>
        <Theme />
        <LazySample />
      </Suspense>
    </div>
  );

}

export default App;
