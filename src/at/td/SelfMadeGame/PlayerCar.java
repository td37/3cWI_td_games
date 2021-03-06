package at.td.SelfMadeGame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;

public class PlayerCar implements Actor {

    private Image playerCar;
    private Image scaledPlayerCar;
    private float x = 609;
    private float y = 510;
    private double speed = 1;
    private Shape collisionShape;
    private List<ComputerCar> computerCars;
    private boolean notCrashed = true;
    private int score = 0;

    public PlayerCar() throws SlickException {
        this.playerCar = new Image("testdata/playerCar.png");
        scaledPlayerCar = playerCar.getScaledCopy(85, 170);
        this.collisionShape = new Rectangle(this.x, this.y, 85, 170);
        this.computerCars = new ArrayList<ComputerCar>();
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(notCrashed){
            if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
                if (this.x < 790) {
                    this.x++; //= (float) delta / this.speed;
                }
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
                if (this.x > 420) {
                    this.x -= (float) delta / this.speed;
                }
            }
            this.score += delta;
        }

        this.collisionShape.setX(this.x);
        this.collisionShape.setY(this.y);


    }

    @Override
    public void render(Graphics graphics) {
        scaledPlayerCar.draw(this.x, this.y);
        graphics.drawString("Your Score: " + Integer.toString(this.score), 10, 50);
        //graphics.draw(collisionShape);
        if(hasCollision().isHasCollision()){
            graphics.drawString("!!DAMN BOY YOU CRASHED!!", 542, 300);
        }

    }


    public void addCollisionCar(ComputerCar computerCar) {
        this.computerCars.add(computerCar);
    }

    public CollisionObject hasCollision() {
        for (ComputerCar car : this.computerCars) {
            if (car.getCollisionShape().intersects(this.collisionShape)){
                this.notCrashed = false;
                CollisionObject co = new CollisionObject(true, car);
                return co;
            }
        }
        return new CollisionObject(false, null);
    }


}
