import React, {useState} from 'react'
import axios from "axios";
import { useNavigate } from 'react-router-dom'
import { Container } from 'react-bootstrap'
import '../styles/register.css'

function Register() {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')
    const [email, setEmail] = useState('')
    let navigate = useNavigate();

    const register = () => {
        axios.post('http://localhost:8080/api/v1/register', {
            username,
            password,
            email
        }).then((response) => {
            navigate("/login")

        })
        
    }

    return (
        <div className='registration-page' >
            <Container className='container-registration' >
                <div className='registration'>
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
            </Container>
        </div>
    )
}

export default Register
