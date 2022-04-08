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

//        ComputerCar comBeginner = new ComputerCar(ComputerCar.CARNUMBER.FIRST);
//        this.actors.add(comBeginner);
//
//        ComputerCar comFollower = new ComputerCar(ComputerCar.CARNUMBER.SECOND);
//        this.actors.add(comFollower);
//
//        ComputerCar com2ndFollower = new ComputerCar(ComputerCar.CARNUMBER.THIRD);
//        this.actors.add(com2ndFollower);
         ComputerCar c1 = new ComputerCar();
         ComputerCar c2 = new ComputerCar();
         ComputerCar c3 = new ComputerCar();
         c1.setNextCar(c2);
         c2.setNextCar(c3);
         c3.setNextCar(c1);

         this.actors.add(c1);
         this.actors.add(c2);
         this.actors.add(c3);
         c1.start();
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
