const useState = require('react').useState()

const opponentData = require('./opponents.json')

// {Array.from({ length: opponentData.length}).map((_, idx) =>

//     console.log(opponentData[idx].createdAt)

// )}

// const filtered = opponentData.filter(item => item.level == "NOVICE")
// console.log(filtered)

const [getAllItems, setAllItems] = useState(opponentData)

console.log(getAllItems)




<Row>
    <Button onClick={() => onClickButton('NOVICE')}> novice </Button>    
</Row>



<Row xw={1} md={4} className="g-4" >
{Array.from({ length: opponentData.length}).map((_, i) =>  
    <Col>
        <OpponentCard
            avatar={opponentData[i].avatar}
            name={opponentData[i].name}
            bio={opponentData[i].bio}
            level={opponentData[i].level}
            createdAt={opponentData[i].createdAt}
        />
    </Col>
)}                
</Row>

