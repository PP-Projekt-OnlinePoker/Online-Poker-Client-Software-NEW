package de.szut.dqi12.onlinepoker.client.controller;

import de.szut.dqi12.onlinepoker.client.comm.ServerIO;
import de.szut.dqi12.onlinepoker.client.model.GameModel;
import de.szut.dqi12.onlinepoker.client.view.GameView;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kevin on 22.02.2016.
 */
public class GameController implements Runnable{
    private Observable model;
    private Observer view;

    private ServerIO server;

    public GameController() {
        model = new GameModel();
        view = new GameView();

        //Model und View-verlinken
        model.addObserver(view);
    }

    @Override
    public void run() {

    }
}
