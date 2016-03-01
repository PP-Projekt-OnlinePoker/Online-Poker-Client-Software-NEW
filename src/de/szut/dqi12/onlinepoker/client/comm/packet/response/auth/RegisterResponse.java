package de.szut.dqi12.onlinepoker.client.comm.packet.response.auth;

import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;
import de.szut.dqi12.onlinepoker.client.comm.packet.entity.Player;

/**
 * Created by Kevin on 29.02.2016.
 */
public class RegisterResponse extends LoginResponse{
    public RegisterResponse(boolean success, Player player) {
        super(success, player);

        this.packetType = PacketType.REGISTER_RESPONSE;
    }


}
