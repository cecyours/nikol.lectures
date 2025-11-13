import logo from './logo.svg';
import './App.css';
import Navbar from './components/Nvabar';
import Footer from './components/Footer';
import MComp from './components/ClassBased';
import FunctionBased from './components/FunctionBased'
import UserCard from './components/UserCard';

function App() {
  return (
    <div className="App">




      <Navbar />


      {/* <MComp /> */}


      {/* <FunctionBased /> */}




      <UserCard name={"Devang"} age={18} />


      <UserCard name={"CEC"} age={3} />




      <Footer />


    </div>
  );
}

export default App;
