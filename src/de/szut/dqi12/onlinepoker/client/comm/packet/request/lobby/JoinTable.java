package de.szut.dqi12.onlinepoker.client.comm.packet.request.lobby;

import de.szut.dqi12.onlinepoker.client.comm.packet.Packet;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;

public class JoinTable extends Packet {

	public int tableId;
	public int playerId;
	public int stake;

	public JoinTable(int tableId, int playerId, int stake) {
		super(PacketType.JOINTABLE);

		this.tableId = tableId;
		this.playerId = playerId;
		this.stake = stake;
	}

    public String toJSON() {
        return null;
    }
}
