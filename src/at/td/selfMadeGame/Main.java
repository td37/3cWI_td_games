package at.td.selfMadeGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    private List<Actor> actors;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Background background = new Background();
        this.actors.add(background);

        PlayerCar playerCar = new PlayerCar();
        this.actors.add(playerCar);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.td.selfMadeGame.Main("Formel1 Race"));
            container.setDisplayMode(1280, 720, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
