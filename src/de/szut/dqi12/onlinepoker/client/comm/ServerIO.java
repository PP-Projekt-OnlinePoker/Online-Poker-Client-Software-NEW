package de.szut.dqi12.onlinepoker.client.comm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Observable;

/**
 * Created by Kevin on 22.02.2016.
 */
public class ServerIO extends Observable implements Runnable {
    private Socket socketIO;
    private PrintWriter out;
    private BufferedReader in;

    private boolean checkForCommunication = true;

    public ServerIO(String hostName, int port) {
        try(
            Socket socketIO = new Socket(hostName, port);
            PrintWriter out = new PrintWriter(socketIO.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketIO.getInputStream()));
        ) {
            this.socketIO = socketIO;
            this.out = out;
            this.in = in;
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void sendPacket(Packet packet){
        String packetString = packet.toJSON();
        this.out.println(packet);
        this.out.flush();
    }

    @Override
    public void run() {
        while(checkForCommunication){
            try {
                String jsonEncodedPacket = in.readLine();

                if(jsonEncodedPacket != ""){
                    this.notifyObservers(jsonEncodedPacket);
                }
            } catch (IOException e) {
                //TODO: Log Server communication error
                e.printStackTrace();
            }
        }
    }
}
