# Client-Server Messaging System

This project demonstrates a basic Client-Server messaging system using Java sockets. The client and server communicate by sending and receiving text messages. The system includes a client program that connects to a server, sends messages, and displays server responses. The server receives client messages, sends a response back to the client, and can handle multiple client connections.

## Features

- **Client-Server Communication**: Establishes a connection over a network using sockets.
- **Messaging**: Allows clients to send messages to the server and receive responses.
- **Bi-directional Communication**: Clients can send messages, and the server acknowledges each message with a "seen" response.
- **Exit Protocol**: Type "bye" to end the client-server session.

## Project Structure

### Main Classes

- **Client**: Initiates a connection with the server, sends messages, and receives server responses.
- **Server**: Accepts client connections, receives messages, and sends responses.

### Key Methods

- **Socket Communication**: Uses `Socket` for the client and `ServerSocket` for the server to establish a connection.
- **Buffered Streams**: `BufferedReader` and `BufferedWriter` enable efficient communication between the client and server.

## Getting Started

### Prerequisites

- **Java**: Ensure that Java Development Kit (JDK) is installed.

### Running the Application

#### Step 1: Start the Server

1. Compile and run the `Server` class:

   ```bash
   javac Server.java
   java Server
   ```

2. The server listens on port `9823` and waits for client connections.

#### Step 2: Start the Client

1. In a separate terminal, compile and run the `Client` class:

   ```bash
   javac Client.java
   java Client
   ```

2. Enter messages to send to the server. The server will respond with "seen" for each message.

3. Type "bye" to end the communication.

## Example Usage

- **Client**: Sends a message, for example, "Hello Server."
- **Server**: Responds with "seen," indicating the message was received.
- **Exit**: To close the connection, type "bye."

## Notes

- **Port Configuration**: The default port is set to `9823`. Ensure this port is open and available, or adjust it in the code if needed.
- **Single-threaded Server**: This implementation is basic and handles one client connection at a time.
- **Error Handling**: Basic error handling is included, and exceptions are logged to the console.

## License

This project is open-source and available for modification and redistribution,Under name of rishab pradhan.
