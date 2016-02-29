package de.szut.dqi12.onlinepoker.client.config;

import org.json.JSONObject;

/**
 * Created by Kevin on 22.02.2016.
 */
public class Parser {
    public static Config parse(String config_file_content){
        JSONObject parsedJSON = new JSONObject(config_file_content);

        //Einzelne Konfigurationsoptionen auslesen
        String hostname = parsedJSON.getString("host");
        int port = parsedJSON.getInt("port");

        //In Config Objekt speichern
        return new Config(hostname, port);
    }
}
