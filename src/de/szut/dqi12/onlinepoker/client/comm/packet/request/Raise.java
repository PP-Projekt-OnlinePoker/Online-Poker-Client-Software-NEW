package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;

public class Raise implements Packet {

	public int playerId;
	public int tableId;
	public int amount;
	public Raise(int playerId, int tableId, int amount) {
		this.playerId = playerId;
		this.tableId = tableId;
		this.amount = amount;
	}

	@Override
	public String toJSON() {
		return null;
	}
}
