package com.hank.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
