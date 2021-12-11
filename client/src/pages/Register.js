import React, {useState} from 'react'
import axios from "axios";


function Register() {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')
    const [email, setEmail] = useState('')
    
    const register = () => {
        axios.post('http://localhost:8080/api/v1/register', {
            username,
            password,
            email
        }).then((response) => {
            console.log(response)
        })
        
    }

    return (
        <div className='registration' >
            <h1>Registration</h1>
            <label> Username </label>
            <input type="text" onChange={(e) => {
                setUsername(e.target.value);
            }}/>
            <label> Email </label>
            <input type="text" onChange={(e) => {
                setEmail(e.target.value);
            }}/>
            <label> Password </label>
            <input type="text" onChange={(e) => {
                setPassword(e.target.value);
            }}/>
            
            <button onClick={register} > Register </button>
        </div>
    )
}

export default Register
