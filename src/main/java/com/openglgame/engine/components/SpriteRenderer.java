package com.openglgame.engine.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector4f;

public class SpriteRenderer extends Component {

    // Logger
    private static final Logger LOGGER = LogManager.getLogger(SpriteRenderer.class);

    private Vector4f color;

    public SpriteRenderer(Vector4f color) {
        this.color = color;
    }

    @Override
    public void start() {

    }

    @Override
    public void update(float dt) {

    }

    public Vector4f getColor() {
        return this.color;
    }
}
