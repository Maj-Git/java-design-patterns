package com.maj.behavioral.visitor.shapes;

public abstract class AbstractShape implements Shape {
    protected final int x;
    protected final int y;

    public AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
