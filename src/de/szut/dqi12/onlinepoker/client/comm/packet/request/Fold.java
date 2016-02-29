package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;

public class Fold implements Packet {

	public int playerId;
	public int tableId;
	public Fold(int playerId, int tableId) {
		this.playerId = playerId;
		this.tableId = tableId;
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

	@Override
	public String toJSON() {
		return null;
	}
}