import './App.css';

import { Routes, Route, BrowserRouter as Router } from 'react-router-dom';
import Home from './pages/Home';
import About from './pages/About';
import Contact from './pages/Contact';

import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './components/Navbar';
import Users from './pages/Users';
import UserView from './pages/UserView';
import NotFound from './components/NotFound';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />

          {/* static routes */}
          <Route path="/about-us" element={<About />} />
          <Route path="/contact-us" element={<Contact />} />
          <Route path='/users' element={<Users />} />

          {/* dynamic routes */}
          <Route path='/users/:id' element={<UserView />} />


{/* path-less */}
          <Route path='*' element={<NotFound />} />


        </Routes>
      </Router>
    </div>
  );
}

export default App;
