import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server{
    public static void main(String[] args) throws IOException  {
        Socket socket=null;
        InputStreamReader inputstreamreader=null;
        OutputStreamWriter outputstreamwriter=null;
        BufferedReader bufferreader=null;
        BufferedWriter bufferedwriter=null;
        ServerSocket serversocket=null;//wait for response from client and look for port number provided 9823

        serversocket=new ServerSocket(9823);

        /*there is two while in case of server programming first loops ensure that server is running constantly and second ensure that server runs untill client discoonects */

        while(true){
            try{
                socket=serversocket.accept();
                /*waits for client connection and once made it returns socket object */
                inputstreamreader=new InputStreamReader(socket.getInputStream());
                outputstreamwriter=new OutputStreamWriter(socket.getOutputStream());
                bufferreader=new BufferedReader(inputstreamreader);
                bufferedwriter= new BufferedWriter(outputstreamwriter);

                while(true){
                    String msgfromclient=bufferreader.readLine();
                    System.out.println("message form client:"+msgfromclient);
                    bufferedwriter.write("seen");
                    bufferedwriter.newLine();
                    bufferedwriter.flush();
                    if(msgfromclient.equalsIgnoreCase("bye")){
                        break;
                    }
                }
                //when client says bye close all socket that made by that client
                socket.close();
                inputstreamreader.close();;
                outputstreamwriter.close();
                bufferedwriter.close();
                bufferreader.close();

            }
            catch(IOException e){
                System.out.println("Error");
            }
        }


    }
}