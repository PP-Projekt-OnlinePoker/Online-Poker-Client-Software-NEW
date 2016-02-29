package de.szut.dqi12.onlinepoker.client.controller;

import de.szut.dqi12.onlinepoker.client.comm.ServerIO;
import de.szut.dqi12.onlinepoker.client.view.View;
import de.szut.dqi12.onlinepoker.client.controller.flow.Intent;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kevin on 22.02.2016.
 */
public abstract class Controller implements Observer {
    protected ServerIO serverIO;

    protected Observable model;
    protected View view;

    protected MainController mainController;

    public Controller(ServerIO serverIO, MainController mainController, Intent intent){
        this.serverIO = serverIO;
        subscribe();
    }

    protected void establishDataBind(){
        model.addObserver(view);
    }

    /**
     * Fügt den Controller als Observer für den Server hinzu
     */
    private void subscribe(){
        serverIO.addObserver(this);
    }

    /**
     * Entfernt den Controller als Observer für den Server
     */
    public void unsubsribe(){
        serverIO.deleteObserver(this);
    }

    public void run(){
        //Model und View verbinden
        establishDataBind();

        //GUI anzeigen (Gui ist immer JFrame)
        ((JFrame)this.view).setVisible(true);
    }

    protected void passbackControl(Intent intent){
        ((JFrame)this.view).setVisible(false);
        mainController.passbackControl(intent);
    }

    @Override
    public abstract void update(Observable o, Object arg);
}
