package de.szut.dqi12.onlinepoker.client.comm.packet.request;

import de.szut.dqi12.onlinepoker.client.comm.Packet;

public class JoinTable implements Packet {

	public int tableId;
	public int playerId;
	public int stake;

	public JoinTable(int tableId, int playerId, int stake) {
		this.tableId = tableId;
		this.playerId = playerId;
		this.stake = stake;
	}

    @Override
    public String toJSON() {
        return null;
    }
}
