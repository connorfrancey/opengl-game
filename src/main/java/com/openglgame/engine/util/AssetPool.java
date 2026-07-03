package com.openglgame.engine.util;

import com.openglgame.engine.renderer.Shader;
import com.openglgame.engine.renderer.Texture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AssetPool {

    // Logger
    private static final Logger LOGGER = LogManager.getLogger(AssetPool.class);

    private static Map<String, Shader> shaders = new HashMap<>();
    private static Map<String, Texture> textures = new HashMap<>();

    public static Shader getShader(String resourceName) {
        LOGGER.info("Getting shader from resource: {}", resourceName);
        File file = new File(resourceName);
        if (AssetPool.shaders.containsKey(file.getAbsolutePath())) {
            return AssetPool.shaders.get(file.getAbsolutePath());
        } else {
            Shader shader = new Shader(resourceName);
            shader.compile();
            AssetPool.shaders.put(file.getAbsolutePath(), shader);
            return shader;
        }
    }

    public static Texture getTexture(String resourceName) {
        LOGGER.info("Getting texture from resource: {}", resourceName);
        File file = new File(resourceName);
        if (AssetPool.textures.containsKey(file.getAbsolutePath())) {
            return AssetPool.textures.get(file.getAbsolutePath());
        } else {
            Texture texture = new Texture(resourceName);
            AssetPool.textures.put(file.getAbsolutePath(), texture);
            return texture;
        }
    }
}
