package de.szut.dqi12.onlinepoker.client.view;

import de.szut.dqi12.onlinepoker.client.controller.Controller;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kevin on 22.02.2016.
 */
public interface View extends Observer {

    public void init(Controller controller);

    @Override
    public abstract void update(Observable o, Object arg);
}
