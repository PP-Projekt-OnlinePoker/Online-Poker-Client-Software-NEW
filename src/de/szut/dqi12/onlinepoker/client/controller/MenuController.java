package de.szut.dqi12.onlinepoker.client.controller;

import de.szut.dqi12.onlinepoker.client.comm.*;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;
import de.szut.dqi12.onlinepoker.client.comm.packet.parse.*;
import de.szut.dqi12.onlinepoker.client.comm.packet.request.auth.Register;
import de.szut.dqi12.onlinepoker.client.comm.packet.response.auth.LoginResponse;
import de.szut.dqi12.onlinepoker.client.comm.packet.response.auth.RegisterResponse;
import de.szut.dqi12.onlinepoker.client.controller.flow.Intent;
import de.szut.dqi12.onlinepoker.client.model.MenuModel;
import de.szut.dqi12.onlinepoker.client.view.MenuView;
import org.json.JSONObject;

import java.util.Observable;

/**
 * Created by Kevin on 22.02.2016.
 */
public class MenuController extends Controller {
    public MenuController(ServerIO serverIO, MainController mainController, Intent intent) {
        super(serverIO, mainController, intent);

        this.model = new MenuModel();
        this.view = new MenuView();

        //Model und View verbinden
        establishDataBind();

        this.view.init(this);
    }

    @Override
    public void update(Observable o, Object jsonEncodedPacket) {
        Object packet = PacketParser.parse(new JSONObject(jsonEncodedPacket));

        PacketType packetType = ((Packet) packet).getPacketType();

        switch (packetType) {
            case RESPONSE_LOGIN:
                handleLoginResponse((LoginResponse) packet);
                break;
            case REGISTER:
                handleRegisterResponse((RegisterResponse) packet);
                break;
        }
    }

    private void handleRegisterResponse(RegisterResponse registerResponse) {
        if (registerResponse.isSuccess()){
            ((MenuModel)model).registerSuccess(registerResponse.getPlayer());
        } else{
            ((MenuModel)model).registerFailed();
        }
    }

    private void handleLoginResponse(LoginResponse loginResponse) {
        if (loginResponse.isSuccess()){
            ((MenuModel)model).loginSuccess(loginResponse.getPlayer());
        } else{
            ((MenuModel)model).loginFailed();
        }
    }


    public void registerComplete(String username, String password, String firstname, String lastname, String email) {
        serverIO.sendPacket(new Register(username, password, firstname, lastname, email));
    }
}
