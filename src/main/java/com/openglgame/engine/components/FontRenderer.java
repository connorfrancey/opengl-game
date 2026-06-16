package com.openglgame.engine.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FontRenderer extends Component {

    // Logger
    private static final Logger LOGGER = LogManager.getLogger(FontRenderer.class);

    @Override
    public void start() {
        if (gameObject.getComponent(SpriteRenderer.class) != null) {
            LOGGER.info("Found Font Renderer!");
        }
    }

    @Override
    public void update(float dt) {

    }
}
