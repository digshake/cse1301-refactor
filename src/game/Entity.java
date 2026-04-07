package game;

import edu.princeton.cs.introcs.StdDraw;

public class Entity {
    private double xPosition;
    private double yPosition;
    private double size;

    public Entity(double x, double y, double size) {
        this.xPosition = x;
        this.yPosition = y;
        this.size = size;
    }

    public void draw() {
        StdDraw.circle(xPosition, yPosition, size);
    }

    public boolean collidesWith(Entity e) {
        double distance = Math.sqrt(Math.pow(this.xPosition - e.getXPosition(), 2) + Math.pow(this.yPosition - e.getYPosition(), 2));
        if(distance > this.getSize() + e.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    public double getSize() {
        return this.size;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public void setXPosition(double x) {
        this.xPosition = x;
    }

    public void setYPosition(double y) {
        this.yPosition = y;
    }
}
