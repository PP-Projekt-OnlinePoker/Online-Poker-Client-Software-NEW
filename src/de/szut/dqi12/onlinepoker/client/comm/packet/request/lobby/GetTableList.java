package de.szut.dqi12.onlinepoker.client.comm.packet.request.lobby;


import de.szut.dqi12.onlinepoker.client.comm.packet.Packet;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;
import org.json.JSONObject;

public class GetTableList extends Packet {

    public GetTableList() {
        super(PacketType.GETTABLELIST);
    }

    public String toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Packet.KEY_ACTION, PacketType.GETTABLELIST);
        return jsonObject.toString();
    }
}
