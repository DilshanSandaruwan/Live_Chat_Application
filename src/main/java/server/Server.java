package server;

import server.Handler.Handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server {
    private static ArrayList<server.Handler.Handler> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket =new ServerSocket(1500);

        Socket accept;

        while (true){
            System.out.println("waiting for client.....");
            accept= serverSocket.accept();
            System.out.println("Client Connected");
            server.Handler.Handler clientThread =new Handler(accept,clients);
            clients.add(clientThread);
            clientThread.start();
        }
    }
}
