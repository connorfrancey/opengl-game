package com.openglgame.engine.components;

import com.openglgame.engine.GameObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Component {

    public GameObject gameObject = null;

    public void start() {

    }

    public abstract void update(float dt);
}
