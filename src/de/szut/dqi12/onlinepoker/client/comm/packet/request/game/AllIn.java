package de.szut.dqi12.onlinepoker.client.comm.packet.request.game;


import de.szut.dqi12.onlinepoker.client.comm.packet.Packet;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;

public class AllIn extends Packet {

	public int playerId;
	public int tableId;

	public AllIn(int playerId, int tableId) {
        super(PacketType.ALLIN);

		this.playerId = playerId;
		this.tableId = tableId;
	}

	public String toJSON() {
		return null;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
}
