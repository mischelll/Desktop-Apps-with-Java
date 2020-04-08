package core;

import gui.GUIManager;
import gui.GUIManagerImpl;

public class Engine implements Runnable {
    private GUIManager guiManager;

    public Engine() {
        this.guiManager = new GUIManagerImpl();
    }

    @Override
    public void run() {
        this.guiManager.initialize();
    }
}
