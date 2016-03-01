package de.szut.dqi12.onlinepoker.client.controller;

import de.szut.dqi12.onlinepoker.client.comm.*;
import de.szut.dqi12.onlinepoker.client.comm.packet.request.Register;
import de.szut.dqi12.onlinepoker.client.controller.flow.Intent;
import de.szut.dqi12.onlinepoker.client.model.MenuModel;
import de.szut.dqi12.onlinepoker.client.view.MenuView;

import java.util.Observable;

/**
 * Created by Kevin on 22.02.2016.
 */
public class MenuController extends Controller{
    public MenuController(ServerIO serverIO, MainController mainController, Intent intent){
        super(serverIO, mainController, intent);

        this.model = new MenuModel();
        this.view = new MenuView();

        //Model und View verbinden
        establishDataBind();

        this.view.init(this);
    }

    @Override
    public void update(Observable o, Object jsonEncodedPacket) {
        try {
            Packet packet = PacketParser.parse((String)jsonEncodedPacket);

            PacketType packetType = packet.getPacketType();

            switch (packetType){
                case LOGIN:
                    handleLoginResponse();
                    break;
                case REGISTER:
                    handleRegisterResponse();
                    break;
            }
        } catch (PacketParseException e) {
            e.printStackTrace();
        }
    }

    private void handleRegisterResponse(){

    }

    private void handleLoginResponse(){

    }


    public void registerComplete(String username, String password, String firstname, String lastname, String email) {
        serverIO.sendPacket(new Register(username, password, firstname, lastname, email));
    }
}
