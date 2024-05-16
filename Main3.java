import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class Main3{
    public static void main(String[] args) {
        try{
            Scanner sc =new Scanner(System.in);
            String city;
            System.out.println("enter a city name");
            city=sc.nextLine();
            JSONObject jsonObject=(JSONObject) location(city);
            double latitude=(double) jsonObject.get("latitude");
            double longitude=(double) jsonObject.get("longitude");
            /*it retrives only latitude and longitude from given array of jsonobjects */
           // System.out.println("latitude:"+latitude);
            //System.out.println("longitude:"+longitude);
            Weatherdata(latitude, longitude);

            

        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    // this method estalblishes connection with the server
        private static JSONObject location(String city) throws IOException{
            try{
                String urlstring="https://geocoding-api.open-meteo.com/v1/search?name="+city+"&count=10&language=en&format=json";
                URL url=new URL(urlstring);
                HttpURLConnection connection=(HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responsecode=connection.getResponseCode();
                //System.out.println(responsecode);  // 200 for ok 
                if(responsecode!=HttpURLConnection.HTTP_OK){
                    System.out.println("connection failed");
                }
                else{
                    // api call reponse is stored in string format in javaResponse String
                    String jsonResponse=fetch(connection);
                    // since all data we are getting is in string format so we need to parse into jsonObjetcs
                    JSONParser parser=new JSONParser();
                    JSONObject pJsonObject=(JSONObject) parser.parse(jsonResponse);
                    
                    // assuming jsonreponse contains array of result where each result has latitude and longitude field
                    JSONArray locationData = (JSONArray) pJsonObject.get("results");
                    return (JSONObject) locationData.get(0);// it assumes api responce array of data(location data) and desired location is in very fiest index 
                     // if we are searching for kathmandu it's location data is in very first index
                }

                

            }
            catch(Exception e){

            }
            return null;

        
        
    }
    private static void Weatherdata(double latitude,double longitude){
        // in this method we are  using laitude and longitude form geolocation api to fetch weather data from weather forecast api
       try{
        String url="https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude+"&current=temperature_2m,relative_humidity_2m,apparent_temperature,precipitation";
        URL url2=new URL(url);
        HttpURLConnection conn=(HttpURLConnection) url2.openConnection();
        int reponse=conn.getResponseCode();
        if(reponse!=HttpURLConnection.HTTP_OK){
            System.out.println("cannot connect to weather api");
        }
        else{
            // calling fetch() method to get response form api in string format and storing in apiresponse variable
            String apiresponse=fetch(conn);
            // since the response we are  getting in string format of json objetcs to we need to parse into json objects
            JSONParser parser=new JSONParser();
            JSONObject obj=(JSONObject) parser.parse(apiresponse);
            JSONObject current=(JSONObject) obj.get("current");

            /*current json boject holding this data
             * 
             *  },
  "current": {
    "time": "2024-05-16T06:00", STRING FORMAT
    "interval": 900, 
    "temperature_2m": 15.6, DOUBLE
    "relative_humidity_2m": 49, LONG
    "apparent_temperature": 12.2, DOUBLE

    "precipitation": 0 INT
  }                  


         now need fetch this data in their correspondind datatype
             */
            String time=(String) current.get("time");
            System.out.println("curremt time is:"+time);

            double temperature=(double) current.get("temperature_2m");
            System.out.println("current temprature is:"+temperature);

            long relative_humidity=(long) current.get("relative_humidity_2m");
            System.out.println("current relative_humidity is:"+relative_humidity);


            
            double aptemp=(double) current.get("apparent_temperature");
            System.out.println("apparent temprature is:"+aptemp);

            int pre=(int) current.get("precipitation");
            System.out.println("current precipitation is:"+pre);

          


        }

       }
       catch(Exception e){

       }

    }
    //this collects all the data from api using stringbuilder class 
    private static String fetch(HttpURLConnection connection) throws IOException{
        try{
            StringBuilder sb=new StringBuilder();
            Scanner scanner=new Scanner(connection.getInputStream());
            while(scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
            scanner.close();
            return (sb.toString());

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
}