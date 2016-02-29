package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;

public class LeaveTable implements Packet {
	
	public int playerId;
	public int tableId;
	public LeaveTable(int playerId, int tableId) {
		this.playerId = playerId;
		this.tableId = tableId;
	}

	@Override
	public String toJSON() {
		return null;
	}
}
