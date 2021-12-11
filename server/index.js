const express = require('express');
const morgan = require('morgan')
const cors = require('cors')

const app = express();

// ============================ MIDDLEWARE ============================
// Setup Json parser
app.use(express.json());
// parse requests of content-type - application/x-www-form-urlencoded
app.use(express.urlencoded({ extended: true }));
// log request
app.use(morgan('tiny'));
app.use(cors())


require('./routes/auth.routes')(app)



app.listen(8080, () => console.log('Api is running on http://localhost:8080/'));