import logo from './logo.svg';
import './App.css';
import Theme from './components/Theme';
import { useContext } from 'react';
import { ThemeContext } from './context/ThemeContext';

function App() {

  const { theme } = useContext(ThemeContext);

  return (
    <div className='box' style={{ backgroundColor: theme === "light" ? "black" : "white", color: theme === "light" ? "white" : "black" }} >
      <Theme />
    </div>
  );
}

export default App;
