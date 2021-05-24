package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Rugby extends Kulka{

    double rx;
    double ry;
    protected double omega;
    protected double rot;

    public Rugby(double xPos, double yPos, double xSpeed, double ySpeed, int omega, int rx) {
        super(xPos, yPos, xSpeed, ySpeed);
        this.rx = rx;
        this.ry = ry;
        this.omega=omega;
    }
}
