package de.szut.dqi12.onlinepoker.client.config;

/**
 * Created by Kevin on 22.02.2016.
 */
public class Config {
    private String host;
    private int port;

    public Config(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
