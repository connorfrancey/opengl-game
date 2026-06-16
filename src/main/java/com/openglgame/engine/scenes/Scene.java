package com.openglgame.engine.scenes;

import com.openglgame.engine.Camera;
import com.openglgame.engine.GameObject;
import com.openglgame.engine.renderer.Renderer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    // Logger
    private static final Logger LOGGER = LogManager.getLogger(Scene.class);

    protected Renderer renderer = new Renderer();
    protected Camera camera;
    private boolean isRunning = false;
    protected List<GameObject> gameObjects = new ArrayList<>();

    public Scene() {

    }

    public void start() {
        for (GameObject go : gameObjects) {
            go.start();
            this.renderer.add(go);
        }
        isRunning = true;
    }

    public void addGameObjectToScene(GameObject go) {
        if (!isRunning) {
            gameObjects.add(go);
        } else {
            gameObjects.add(go);
            go.start();
            this.renderer.add(go);
        }
    }


    public void init() {

    }

    public abstract void update(float dt);

    public Camera camera() {
        return this.camera;
    }
}
