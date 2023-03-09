package org.example;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point p){
        double x1 = p.getX();
        double y1 = p.getY();
        return Math.sqrt((x1 - this.x) * (x1 - this.x) + (y1 - this.y) * (y1 - this.y));
    }

    @Override
    public String toString(){
        return "(" + this.x +"," + this.y + ")";
    }

}
