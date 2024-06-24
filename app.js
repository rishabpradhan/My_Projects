


// // Start the server
// app.listen(PORT, () => {
//     console.log(`Server is running on http://localhost:${PORT}`);
// });


// /*
// app.get("/weather",(req,res)=>{


// const apikey = 'e755ae8b6b1709b975e5052f4d591640';



// const url = 'https://api.openweathermap.org/data/2.5/weather?q=kathmandu&appid=e755ae8b6b1709b975e5052f4d591640&units=metric';

// async function fetchWeather() {
//     try {
//         const response = await axios.get(url);
//         console.log(response.status); // Corrected from res.statusCode()
//         console.log(response.data); // Use response.data to access the response body
//     } catch (error) {
//         console.error("An error has occurred:", error.message); // Added error message for clarity
//     }
// }
// });
// */


const express = require('express');
const path = require('path');
const app = express();
const axios=require('axios');


// Define the port to run the server on
const PORT = 3000;

// Serve static files from the 'public' directory
app.use(express.static(path.join(__dirname, '..', 'public')));
app.use('/weather-app-img', express.static(path.join(__dirname, 'weather-app-img')));

//api logic
app.get('/weather',async (req,res)=>{
// get city from query parameters
const city=req.query.city;
const apikey='e755ae8b6b1709b975e5052f4d591640';
//const url='https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apikey}&units=metric';
const url=  `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apikey}&units=metric`;


try{
    const response= await axios.get(url);
    //console.log(res.statusCode());
   
   // console.log(res.data);
    (res.json(response.data));
   


}
catch(error){
console.error("error has occured",error.message);
res.status(500).send("error has occured");
}
});

// // Route to serve the HTML page

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, '..', 'public', 'page.html'));
});



// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
