import React, {useState, useContext} from 'react'
import OpponentCard from '../components/OpponentCard'
import { Container, Row, Col, Button } from 'react-bootstrap'
import '../styles/Opponent.css'

const opponentData = require('../data/opponents.json')

const Opponent = () => {
    const [getRenderedItems, setRenderedItems] = useState(opponentData)

    const onClickButton = (chosenCategory) => {
        if (chosenCategory === "ALL") {
            setRenderedItems(opponentData)
        }
        else{
            const filtered = opponentData.filter(item => item.level === chosenCategory)
            setRenderedItems(filtered);
        }
    }

    return (
        <div className="opponent" >
        <Container className='container' >
            <Row className='title' >
            <h3> <b> CHOOSE YOUR OPPONENT </b> </h3>
            </Row>
            <Row className='button-categorize'>
                <Col> <Button onClick={() => onClickButton('ALL')}> <b>ALL</b>  </Button> </Col>
                <Col> <Button onClick={() => onClickButton('NOVICE')}> <b>NOVICE</b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS A')}> <b> CLASS A </b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS B')}> <b> CLASS B </b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS C')}> <b>CLASS C</b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS D')}> <b> CLASS D </b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CANDIDATE MASTER')}> <b> CANDIDATE MASTER </b> </Button> </Col>
                <Col> <Button onClick={() => onClickButton('GRAND MASTER')}> <b>GRAND MASTER</b> </Button> </Col>
            </Row>

            <Row xw={1} md={4} className="g-4" >

            {Array.from({ length: getRenderedItems.length}).map((_, i) =>  
                <Col>
                    <OpponentCard
                        avatar={getRenderedItems[i].avatar}
                        name={getRenderedItems[i].name}
                        bio={getRenderedItems[i].bio}
                        level={getRenderedItems[i].level}
                        createdAt={getRenderedItems[i].createdAt}
                    />
                </Col>
            )}                
            </Row>
        </Container>
        </div>
    )
}

export default Opponent

