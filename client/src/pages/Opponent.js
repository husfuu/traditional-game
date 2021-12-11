import React, {useState} from 'react'
import backgroundImg from '../assets/requirements.png'
import OpponentCard from '../components/OpponentCard'
import { Container, Row, Col, Button } from 'react-bootstrap'



const opponentData = require('../data/opponents.json')

const Opponent = () => {
    // const [getAllItems, setAllItems] = useState(opponentData)
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
        <div className="opponent" style={{backgroundImage: `url(${backgroundImg})`}} >
        
        <Container>
            <Row>
                <h1>CHOOSE YOUR OPPONENT</h1>
            </Row>
            <Row>
                <Col> <Button onClick={() => onClickButton('ALL')}> ALL </Button> </Col>
                <Col> <Button onClick={() => onClickButton('NOVICE')}> NOVICE </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS A')}> CLASS A </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS B')}> CLASS B </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS C')}> CLASS C </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CLASS D')}> CLASS D </Button> </Col>
                <Col> <Button onClick={() => onClickButton('CANDIDATE MASTER')}> CANDIDATE MASTER </Button> </Col>
                <Col> <Button onClick={() => onClickButton('GRAND MASTER')}> GRAND MASTER </Button> </Col>
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

