package de.szut.dqi12.onlinepoker.client.comm.packet.request.game;


import de.szut.dqi12.onlinepoker.client.comm.packet.Packet;
import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;

public class Call extends Packet {
	public int tableID;
	public int playerID;

	public Call(int tableID, int playerID) {
		super(PacketType.CALL);

		this.tableID = tableID;
		this.playerID = playerID;
	}

	public int getTableID() {
		return tableID;
	}

	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String toJSON() {
		return null;
	}
}
