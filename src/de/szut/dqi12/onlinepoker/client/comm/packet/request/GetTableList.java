package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;
import de.szut.dqi12.onlinepoker.client.comm.PacketType;
import org.json.JSONObject;

public class GetTableList implements Packet {

    @Override
    public String toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Packet.KEY_ACTION, PacketType.GETTABLELIST);
        return jsonObject.toString();
    }
}
