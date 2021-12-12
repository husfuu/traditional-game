import React, { useContext } from 'react'
import {Navbar, Nav, Container, Row, Col} from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.css';
import { UserContext } from '../helpers/UserContext';

function BootstrapNavbar(props) {
    const { user, setUser } = useContext(UserContext)

    function signOut(){
        setUser(null)
        props = false
    }

    function leftSide(props){
        if (!props.authenticated){
            return(
                <Row>
                    <Col> <Nav.Link href="/register">Register</Nav.Link> </Col>
                    <Col> <Nav.Link href="/login">Login</Nav.Link> </Col>
                </Row>
            )
        }
        return (
            <Row>
                <Col> <Nav.Link href="/register">{user}</Nav.Link> </Col>
                <Col> <Nav.Link onClick={signOut} href="/opponent">SignOut</Nav.Link> </Col>
            </Row>
        )
    }
    
    const leftSideJSX = leftSide(props)

    return (
        <div>
            <Navbar fixed="top" collapseOnSelect expand="lg" bg="dark" variant="dark">
                <Container>
                <Navbar.Brand href="/">SUIT GAME</Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="me-auto">

                    </Nav>
                    <Nav>
                        {leftSideJSX}
                    </Nav>
                </Navbar.Collapse>
                </Container>
            </Navbar>
        </div>
    )
}

export default BootstrapNavbar
