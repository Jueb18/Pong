import java.awt.Color;
import javax.swing.Timer;
import java.util.Random;
import java.util.ArrayList;
public class Ball extends Circle
{
    private Timer Wait; //Ball wartet nach Punkt/Spielstart
    Random rand = new Random();

    public double posX;
    public double posY;
    double StartX;
    double StartY;
    double startAngle;
    double direction;
    private double startDir;
    private int dirInt;
    public double dirX;
    public double dirY;
    
    public Ball(double startX, double startY, int radius, Color color)
    {
        
        super(startX, startY, radius, color);
     
        posX = StartX;
        posY = StartY;

        startAngle = final_angle;

        dirInt = rand.nextInt(2);
        if(dirInt == 0){dirX = 1;}else{dirX = -1;}

        dirInt = rand.nextInt(2);
	if(dirInt == 0){dirY = 1;}else{dirY = -1;}
    }

    public void move(){
        
        moveByDelta(Config.BALL_SPEED * dirX, Config.BALL_SPEED * dirY);
    }
    
    public void angle_calc(){
        ArrayList angle = new ArrayList();
        for(double i = 0.1; i<0.46; i += 0.01){
            angle.add(i);
            System.out.println(angle);
        }
        int pick = rand.nextInt(0,46);
        double final_angle = angle.get(pick);
        }
               
}