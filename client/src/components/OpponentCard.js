import React from 'react'
import { Card, Button} from 'react-bootstrap'
import { Row, Col } from 'react-bootstrap'
import '../styles/Opponent.css'


const OpponentCard = ({name, bio, avatar, level, createdAt}) => {
    const dateTime = new Date(createdAt)
    const month  = dateTime.toLocaleDateString('default', {month: 'long'})
    const day = dateTime.getDay()
    const year = dateTime.getFullYear()
    
    createdAt = `since ${month} ${day}, ${year}`
    
    return (
        <div>
            <Card className='card' style={{backgroundColor: '#ffffff14'} }>
                <Card.Body>
                    <Row  >
                        <Col sm={4} ><Card.Img className='avatar' variant="top" src={avatar} /></Col>                        
                        <Col sm={8} > 
                            <h6 class='text-justify' style={{color: 'white'}} >{name}</h6> 
                            <p style={{color: 'white'}} > {level} </p>
                        </Col>
                    </Row>
                    <p style={{color: 'white'}} > {bio} </p>
                    <p style={{color: 'white'}} > {createdAt} </p> 
                    <Button variant="primary">Fight</Button>
                </Card.Body>
            </Card>
        </div>
    )
}

export default OpponentCard

