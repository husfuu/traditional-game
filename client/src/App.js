import { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; 
import BootstrapNavbar from './components/Navbar';
import Login from './pages/Login';
import Opponent from './pages/Opponent';
import Register from './pages/Register';

import { UserContext } from './helpers/UserContext'


{/* <Route path="/login"  element={<Login />} /> */}
function App() {
  const [token, setToken] = useState();
  const [user, setUser] = useState();

  function isAuthenticated(token){
    if (!token) return false
    return true
  }
  const authenticated = isAuthenticated(token)

  return (
    <div className="App">
      <UserContext.Provider value={ {user, setUser} } > 
        <Router>
          <BootstrapNavbar authenticated={authenticated}/>
          <Routes>
            <Route path="/login" element={<Login setToken={setToken} />} />
            <Route path="/register" element={<Register />} />
            <Route path="/opponent" element={<Opponent />} />
          </Routes>
        </Router>        
      </UserContext.Provider>
    </div>
  );
}

export default App;
