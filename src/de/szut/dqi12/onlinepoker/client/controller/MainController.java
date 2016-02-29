package de.szut.dqi12.onlinepoker.client.controller;

import de.szut.dqi12.onlinepoker.client.comm.ServerIO;
import de.szut.dqi12.onlinepoker.client.config.Loader;
import de.szut.dqi12.onlinepoker.client.config.Config;
import de.szut.dqi12.onlinepoker.client.config.Parser;
import de.szut.dqi12.onlinepoker.client.controller.flow.ControllerChoice;
import de.szut.dqi12.onlinepoker.client.controller.flow.Intent;

import java.io.IOException;

/**
 * Created by Kevin on 22.02.2016.
 */
public class MainController {
    ServerIO serverIO;


    /**
     * Aktueller Controller der gerade läuft
     */
    private Controller activeController;

    public void run(){
        try {
            Config config = Parser.parse(Loader.load("config/config.json"));

            //Serververbindung herstellens
            serverIO = new ServerIO(config.getHost(), config.getPort());

            //Intent für den Start erstellen
            Intent initIntent = new Intent();

            //Startcontroller ist immer Menu
            initIntent.setControllerChoice(ControllerChoice.MENU);
            Controller controller = getController(initIntent);

            //Controller ausführen
            controller.run();
        } catch (IOException e) {
            //TODO: Show Error and exit
            e.printStackTrace();
        }
    }

    /**
     * Wird benutzt um die Kontrolle von einem Controller an
     * den MainController wieder zurückzugeben
     *
     * @param intent
     */
    public void passbackControl(Intent intent){

    }

    private Controller getController(Intent intent){
        ControllerChoice controller = intent.getControllerChoice();

        switch(controller){
            case MENU:
                return new MenuController(serverIO, this, intent);
            case LOBBY: //TODO: Implement
            case GAME: //TODO: Implement
        }

        return null;
    }
}
