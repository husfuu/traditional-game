import React from 'react'
import {Navbar, Nav, Container} from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.css'

function BootstrapNavbar() {
    return (
        <div>
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
                <Container>
                <Navbar.Brand href="/">SUIT GAME</Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="me-auto">

                    </Nav>
                    <Nav>
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
