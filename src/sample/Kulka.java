package sample;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Kulka {

    private static final double R = 10;
    protected double ySpeed;
    protected double xSpeed;
    protected double xPos;
    protected double yPos;
    protected Color color;

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        color = Color.WHITESMOKE;
    }

    public void checkBoundaryCollision(double xLeft, double yTop, double xRight, double yBottom) {
        if ((xPos - R <= xLeft) || (xPos + R >= xRight)) {
            xSpeed =- xSpeed;
        }
        if ((yPos - R <= yTop) || (yPos + R >= yBottom)) {
            ySpeed =- ySpeed;
        }
    }

    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITESMOKE);
        gc.setFill(color);
        int ry = 1;
        int rx = 2;
        
        gc.fillOval(xPos - rx, yPos - ry, 2 * rx, 2 * ry);
        gc.restore();
    }

    public void update(){
        xPos += xSpeed;
        yPos += ySpeed;
    }
}