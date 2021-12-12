import { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; 
import BootstrapNavbar from './components/Navbar';
import Login from './pages/Login';
import Opponent from './pages/Opponent';
import Register from './pages/Register';
import { AuthContext } from './helpers/AuthContext';
import { NameProvider } from './helpers/NameContext'

{/* <Route path="/login"  element={<Login />} /> */}
function App() {

  const [token, setToken] = useState();
  function isAuth(token) {
    if (!token) {
      return false;
    }
    return true;
  }

  const isAuthenticate = isAuth(token);
  
  if (!isAuthenticate) {
    return <Login setToken={setToken} />
  }

  return (
    <div className="App">
    <AuthContext.Provider value={isAuthenticate} >
      <NameProvider> 
        <Router>
            {/* navbar perlu info token dan username */}
            <BootstrapNavbar authorized={true} />
          <Routes>
              <Route path="/register"  element={<Register />} />          
              <Route path="/"  element={<Opponent />} />
          </Routes>
        </Router>        
      </NameProvider>

    
    </AuthContext.Provider>
    </div>
  );
}

export default App;
