import logo from './logo.svg';
import './App.css';
import Navbar from './components/Nvabar';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">




      <Navbar />



      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Hello world ,this is my first react app
        </p>

        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>



      <Footer />



    </div>
  );
}

export default App;
