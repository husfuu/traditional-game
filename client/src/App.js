import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; 
import BootstrapNavbar from './components/Navbar';
import Login from './pages/Login';
import Opponent from './pages/Opponent';
import Register from './pages/Register';

function App() {
  return (
    <div className="App">
      <Router>
          <BootstrapNavbar />
        <Routes>
          <Route path="/register"  element={<Register />} />
          <Route path="/login"  element={<Login />} />
          <Route path="/"  element={<Opponent />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
