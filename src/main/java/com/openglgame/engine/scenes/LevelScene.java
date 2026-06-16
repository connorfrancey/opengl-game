package com.openglgame.engine.scenes;

import com.openglgame.engine.Camera;
import com.openglgame.engine.GameObject;
import com.openglgame.engine.Transform;
import com.openglgame.engine.Window;
import com.openglgame.engine.components.SpriteRenderer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class LevelScene extends Scene {
    // Logger
    private static final Logger LOGGER = LogManager.getLogger(LevelScene.class);

    public LevelScene() {
        LOGGER.info("Inside level scene");
    }

    @Override
    public void update(float dt) {

    }
}
