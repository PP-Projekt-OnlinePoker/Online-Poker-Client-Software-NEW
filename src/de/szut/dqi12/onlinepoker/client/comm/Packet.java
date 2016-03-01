package de.szut.dqi12.onlinepoker.client.comm;

import de.szut.dqi12.onlinepoker.client.comm.packet.PacketType;

public abstract class Packet {
    public static final String KEY_ACTION = "Action";

    protected PacketType packetType;

    public Packet(PacketType packetType) {
        this.packetType = packetType;
    }

    public PacketType getPacketType() {
        return packetType;
    }

    public abstract String toJSON();
}
