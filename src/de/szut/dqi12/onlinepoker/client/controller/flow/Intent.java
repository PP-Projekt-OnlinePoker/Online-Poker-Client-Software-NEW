package de.szut.dqi12.onlinepoker.client.controller.flow;

/**
 * Created by Kevin on 22.02.2016.
 */
public class Intent {
    private ControllerChoice controllerChoice = ControllerChoice.NONE;
    private boolean exit = true;

    public ControllerChoice getControllerChoice() {
        return controllerChoice;
    }

    public void setControllerChoice(ControllerChoice controllerChoice) {
        this.controllerChoice = controllerChoice;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}
