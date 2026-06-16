package com.openglgame.engine.debug;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.glfw.GLFW.*;

public class GLFWLogging {
    private static final Logger LOGGER =
            LogManager.getLogger("GLFW");

    public static void install() {

        GLFWErrorCallback.create((error, desc) -> {

            LOGGER.error(
                    "GLFW Error [{}]: {}",
                    error,
                    GLFWErrorCallback.getDescription(desc)
            );

        }).set();
    }
}
