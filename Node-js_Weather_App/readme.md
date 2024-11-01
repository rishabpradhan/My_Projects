# Weather Application

This is a weather application built with Node.js, Express, HTML, CSS, and JavaScript. It allows users to search for a city's current weather conditions using data from the OpenWeatherMap API.

## Features

- **City-based Weather Search**: Enter any city name to fetch its current weather.
- **Real-time Weather Data**: Displays temperature, humidity, wind speed, and weather condition icons.
- **Simple UI**: Clean and intuitive user interface for ease of use.

## Prerequisites

- **Node.js** and **npm** installed on your machine.
- **OpenWeatherMap API Key**: Register on [OpenWeatherMap](https://home.openweathermap.org/users/sign_up) and obtain an API key. Replace the `apikey` variable in `app.get("/weather")` with your API key.

## Project Structure

### Server-side

- **Express Server**: Handles API calls to OpenWeatherMap.
- **Static Files**: Serves HTML, CSS, and JavaScript files from the `public` directory.

### Frontend

- **HTML & CSS**: The frontend interface to enter a city name and display weather details.
- **JavaScript**: Handles user interactions and fetches data from the backend.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/weather-app.git [//your repo name]
   cd weather-app
   ```

2. **Install dependencies**:

   ```bash
   npm install
   ```

3. **Add Weather Icons and Images**:

   - Ensure images for search, weather icons, humidity, and wind speed are saved in `public/weather-app-img/images/`.

4. **Start the Server**:

   ```bash
   node app.js
   ```

5. **Run the Application**:
   - Open a browser and go to `http://localhost:3000`.

## Usage

1. **Enter a City Name**: Type a city name (e.g., "Kathmandu") in the search bar.
2. **Get Weather Details**: Click the search button, and the current weather information will be displayed, including:
   - Temperature in Celsius
   - City name
   - Humidity percentage
   - Wind speed in km/hr
   - Weather icon (based on weather conditions)

## API Information

- **OpenWeatherMap API**: Fetches real-time weather data based on city names.
- **Endpoint Used**:
  ```url
  https://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}&units=metric
  ```
