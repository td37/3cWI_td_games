package at.td.selfMadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.util.Random;

public class ComputerCar implements Actor{
    private Image computerCar;
    private Image scaledComputerCar;
    private ComputerCar nextCar;
    private float x,y;
    private float speed = 1.5f;
    boolean isDriving = false;


    public ComputerCar() throws SlickException {
        setRandomXPosition();
        this.y = -200;

        this.computerCar = new Image("testdata/computerCar.png");
        scaledComputerCar = computerCar.getScaledCopy(85, 170);
    }


    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (this.y>400 && this.y<500){
            this.nextCar.start();
        }
        if (isDriving){
            this.y += (float) delta / this.speed;
        }

        if (this.y > 700){
            this.isDriving = false;
            this.y = -200;
            setRandomXPosition();
            setSpeedFaster();
        }
    }

    @Override
    public void render(Graphics graphics) {
        scaledComputerCar.draw(this.x, this.y);
    }

    public void start(){
        this.isDriving = true;
    }

    public ComputerCar getNextCar() {
        return nextCar;
    }

    private void setRandomXPosition() {
        this.x = (new Random()).nextInt(370) + 420;
    }

    public void setSpeedFaster() {
        if(this.speed>0.8){
            this.speed -= 0.05;
        }

    }

    public void setNextCar(ComputerCar nextCar) {
        this.nextCar = nextCar;
    }
}
