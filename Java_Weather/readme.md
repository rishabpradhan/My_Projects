# Weather Forecast Application

This project is a Java-based weather application that retrieves real-time weather information for a specified city. It uses two APIs:

1. **Geocoding API** (to get the latitude and longitude of the city).
2. **Weather Forecast API** (to fetch the current weather data based on the coordinates).

## Features

- **City Location Fetching**: Retrieves the latitude and longitude for a specified city.
- **Weather Data Retrieval**: Provides the current temperature, relative humidity, apparent temperature, and precipitation details.
- **Real-Time Weather Display**: Displays the current weather conditions in the console.

## Project Structure

### Main Classes

- **Main3**: Contains methods to prompt the user for a city name, retrieve its coordinates using the Geocoding API, and fetch the current weather details.

### Key Methods

- **location(String city)**: Connects to the Geocoding API, retrieves the location data, and extracts latitude and longitude.
- **Weatherdata(double latitude, double longitude)**: Uses latitude and longitude to fetch weather data from the Weather Forecast API.
- **fetch(HttpURLConnection connection)**: Reads the API response and returns it as a JSON string.

## Prerequisites

- **Java**: Make sure the Java Development Kit (JDK) is installed.
- **Google JSON Simple Library**: This project uses the JSON Simple library to parse JSON data from the APIs.

### Installing JSON Simple Library

1. Download the JSON Simple library (json-simple-1.1.1.jar) from [Maven Repository](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1).
2. Add `json-simple-1.1.1.jar` to your project’s classpath.

#### Adding JSON Simple to Classpath in Command Line (Optional)

```bash
javac -cp .:json-simple-1.1.1.jar Main3.java
java -cp .:json-simple-1.1.1.jar Main3
Running the Application
Compile the Java file:

bash
Copy code
javac Main3.java
Run the application:

bash
Copy code
java Main3
When prompted, enter the name of a city (e.g., "Kathmandu").

The application will:

Fetch the latitude and longitude of the city.
Use these coordinates to get the current weather data.
Display the following weather details:
Current time
Temperature
Relative humidity
Apparent temperature
Precipitation level
Example Usage
Input: Enter a city name, such as "Kathmandu."
Output: Displays weather details such as temperature, humidity, and precipitation.
Notes
APIs Used:
Geocoding API for location data.
Weather API for weather data.
Error Handling: The program will print a stack trace if there’s a connection or parsing error.
License
This project is open-source and available for modification and redistribution.

vbnet
Copy code

This `README.md` provides a complete guide for setting up, running, and understanding the application, including instructions on using the JSON Simple library. Let me know if you need any further details!





```
