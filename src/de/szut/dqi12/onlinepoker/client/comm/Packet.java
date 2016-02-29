package de.szut.dqi12.onlinepoker.client.comm;

public abstract class Packet {
    public static final String KEY_ACTION = "Action";

    protected PacketType packetType;
    protected CommWay commWay = CommWay.REQUEST;

    public Packet(PacketType packetType, CommWay commWay) {
        this.packetType = packetType;
        this.commWay = commWay;
    }

    public Packet(PacketType packetType) {
        this.packetType = packetType;
    }

    public abstract String toJSON();
}
