package at.td.selfMadeGame;

import org.newdawn.slick.*;

import java.util.Random;

public class ComputerCar implements Actor{

    private Image computerCar;
    private Image scaledComputerCar;
    private float x;
    private float y = -200;
    private double speed = 2;
    private int timeToWait = 0;
    private int timePassed = 0;


    public ComputerCar() throws SlickException {
        this.computerCar = new Image("testdata/computerCar.png");
        scaledComputerCar = computerCar.getScaledCopy(85, 170);
        Random random = new Random();
        this.x = random.nextInt(370)+420;
        this.timeToWait = random.nextInt(2000)+3500;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.timePassed += delta;
        if (this.timeToWait<this.timePassed){
            this.y += (float) delta / this.speed;
        }
        if (y>725){
            reset();
        }
    }

    @Override
    public void render(Graphics graphics) {
        scaledComputerCar.draw(this.x, this.y);
    }

    public void reset(){
        Random random = new Random();
        this.timePassed = 0;
        this.x = random.nextInt(370)+420;
        this.timeToWait = random.nextInt(2000)+3500;
        this.y = -200;
    }
}
