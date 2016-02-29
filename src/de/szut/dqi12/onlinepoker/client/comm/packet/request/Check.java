package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;

public class Check implements Packet {

	public int playerID;
	public int tableID;
	public Check(int playerID, int tableID) {
		this.playerID = playerID;
		this.tableID = tableID;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getTableID() {
		return tableID;
	}

	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	@Override
	public String toJSON() {
		return null;
	}
}
