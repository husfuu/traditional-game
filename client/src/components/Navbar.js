import React, { useContext } from 'react'
import {Navbar, Nav, Container} from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.css';
import { UserContext } from '../helpers/UserContext';

function BootstrapNavbar(props) {
    const { user } = useContext(UserContext)
    console.log(props)
    function leftSide(props){
        if (!props.authenticated){
            return(
                <div>
                    <h1>Belum login</h1>
                </div>
            )
        }
        return (
            <h1>Udah login</h1>
        )
    }
    
    const leftSideJSX = leftSide(props)

    return (
        <div>
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
                <Container>
                <Navbar.Brand href="/">SUIT GAME</Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="me-auto">
                        {<p style={{color: 'white'}} >{user}</p>}
                    </Nav>
                    <Nav>
                        <Nav.Link href="/register">{leftSideJSX}</Nav.Link> 
                        <Nav.Link href="/register">Register</Nav.Link>
                        <Nav.Link eventKey={2} href="/login">
                            Login
                        </Nav.Link>
                    </Nav>
                </Navbar.Collapse>
                </Container>
            </Navbar>
        </div>
    )
}

export default BootstrapNavbar
