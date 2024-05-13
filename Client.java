//client server messenging in java programming

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;

public class Client {
/**
 * @param args
 */
public static void main(String[] args) {
    Socket socket =null;//socket is used for end to communication between two devices it has ip address and port number
    // streams used for end to end data read
    InputStreamReader inputstreamreader=null;//converting data into bytes and data into characters a bridge
    OutputStreamWriter outputstreamwriter=null;//converting charcters into bytes to output
    //import efficency by using buffer that take larger bytes than single character
    BufferedReader bufferedreader=null;//for input stream
    BufferedWriter bufferedwriter=null;//for outputstream

    try{
        socket =new Socket("localhost",9823);
        //client and server communicate by writing into outputstream and reading from inputstream
        inputstreamreader=new InputStreamReader(socket.getInputStream());
        outputstreamwriter=new OutputStreamWriter(socket.getOutputStream());
         bufferedreader=new BufferedReader(inputstreamreader);
         bufferedwriter=new BufferedWriter(outputstreamwriter);
         System.out.println("enter message you want to send to server");

         Scanner sc=new Scanner(System.in);// just like take input from user keyboard
         while(true){
            
            String msgtosend=sc.nextLine();
            bufferedwriter.write(msgtosend);
            bufferedwriter.newLine();// seperate lines for message
            bufferedwriter.flush();//it is used when we want to send message by pressing enter key not buffer is full
            System.out.println(bufferedreader.readLine());//wait for server reponse to read the message

            if(msgtosend.equalsIgnoreCase("bye")){
                break;
            }
         }



    }
    catch(IOException e){
        e.printStackTrace();

    }
    try{
        if(socket!=null){
            socket.close();
        }
        if(inputstreamreader!=null){
            inputstreamreader.close();
        }
        if(outputstreamwriter!=null){
            outputstreamwriter.close();
        }
        if(bufferedreader!=null){
            bufferedreader.close();

        }
        if(bufferedwriter!=null){
            bufferedwriter.close();
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
    
}
