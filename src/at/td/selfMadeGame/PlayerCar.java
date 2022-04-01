package at.td.selfMadeGame;

import org.newdawn.slick.*;

public class PlayerCar implements Actor{

    private Image playerCar;
    private Image scaledPlayerCar;
    private float x = 609;
    private float y = 510;

    public PlayerCar() throws SlickException {
        this.playerCar = new Image("testdata/playerCar.png");
        scaledPlayerCar = playerCar.getScaledCopy(85, 170);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }
    }

    @Override
    public void render(Graphics graphics) {
        scaledPlayerCar.draw(this.x,this.y);
    }
}
