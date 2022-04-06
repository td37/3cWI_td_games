package at.td.selfMadeGame;

import org.newdawn.slick.*;

public class PlayerCar implements Actor {

    private Image playerCar;
    private Image scaledPlayerCar;
    private float x = 609;
    private float y = 510;
    private double speed = 1.5;

    public PlayerCar() throws SlickException {
        this.playerCar = new Image("testdata/playerCar.png");
        scaledPlayerCar = playerCar.getScaledCopy(85, 170);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            if (this.x < 790) {
                this.x += (float) delta / this.speed;
            }
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            if (this.x > 420) {
                this.x -= (float) delta / this.speed;
            }
        }
    }

    @Override
    public void render(Graphics graphics) {
        scaledPlayerCar.draw(this.x, this.y);
    }
}
