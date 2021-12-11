import React, {useState} from 'react'
import axios from 'axios'


function Login() {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('') 

    const login = () => {
        axios.post('http://localhost:8080/api/v1/login', {
            username,
            password
        }).then((response) => {
            console.log(response)
        })
    }

    return (
        <div className='login'>
            <h1>Login</h1>
            <label> Username </label>
            <input type="text" onChange={(e) => {
                setUsername(e.target.value);
            }}/>
            <label> Password </label>
            <input type="text" onChange={(e) => {
                setPassword(e.target.value);
            }}/>
            <button onClick={login} > Login </button>
        </div>
    )
}

export default Login
