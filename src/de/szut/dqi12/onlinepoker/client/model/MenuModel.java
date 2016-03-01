package de.szut.dqi12.onlinepoker.client.model;

import de.szut.dqi12.onlinepoker.client.comm.packet.entity.Player;

import java.util.Observable;

/**
 * Created by Kevin on 27.02.2016.
 */
public class MenuModel extends Observable {

    public void registerSuccess(Player p){

        this.notifyObservers();
    }

    public void registerFailed(){
        this.notifyObservers();
    }

    public void loginSuccess(Player p){
        this.notifyObservers();
    }

    public void loginFailed(){
        this.notifyObservers();
    }
}
