package de.szut.dqi12.onlinepoker.client.comm.packet.parse;

import de.szut.dqi12.onlinepoker.client.comm.packet.Packet;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;
import de.szut.dqi12.onlinepoker.client.comm.packet.entity.Player;
import de.szut.dqi12.onlinepoker.client.comm.packet.request.auth.LogIn;
import de.szut.dqi12.onlinepoker.client.comm.packet.request.auth.LogOut;
import de.szut.dqi12.onlinepoker.client.comm.packet.request.auth.Register;
import de.szut.dqi12.onlinepoker.client.comm.packet.response.auth.LoginResponse;
import de.szut.dqi12.onlinepoker.client.comm.packet.response.auth.RegisterResponse;
import org.json.JSONObject;

/**
 * Created by Kevin on 22.02.2016.
 */
public class PacketParser {

    public static Object parse(JSONObject jsonParsed){
            //Action in PacketType konvertieren
            PacketType packetType = (PacketType) jsonParsed.get(Packet.KEY_ACTION);

            switch (packetType){
                case RESPONSE_LOGIN:
                    return parseRegisterResponse(jsonParsed);
                case REGISTER_RESPONSE:
                    return parseLogInResponse(jsonParsed);
                default:
                    throw new UnsupportedOperationException("Unsupported Packet");
            }
    }

    private static Object parseRegisterResponse(JSONObject jsonParsed){
        boolean success = jsonParsed.getBoolean("success");

        JSONObject playerFromJSON = jsonParsed.getJSONObject("player");

        Player player = null;

        if(playerFromJSON != null){
            player = (Player) EntityParser.parse(playerFromJSON);
        }

        return new RegisterResponse(success, player);
    }

    private static Object parseLogInResponse(JSONObject jsonParsed){
        boolean success = jsonParsed.getBoolean("success");

        JSONObject playerFromJSON = jsonParsed.getJSONObject("player");

        Player player = null;

        if(playerFromJSON != null){
            player = (Player) EntityParser.parse(playerFromJSON);
        }

        return new LoginResponse(success, player);
    }

}
