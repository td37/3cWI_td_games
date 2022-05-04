package at.td.Parcheesi;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {

    private List<Actor> actors;
    private int Id = 0;

    public Main(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Playboard playboard = new Playboard();
        this.actors.add(playboard);

        while (this.Id < 16){
            if(this.Id < 4){
                Figure figure = new Figure(Figure.COLOR.RED, this.Id);
                this.actors.add(figure);
            }
            else if (3 < this.Id && this.Id < 8){
                Figure figure = new Figure(Figure.COLOR.BLACK, this.Id);
                this.actors.add(figure);
            }
            else if (7 < this.Id && this.Id < 12){
                Figure figure = new Figure(Figure.COLOR.YELLOW, this.Id);
                this.actors.add(figure);
            }
            else if (11 < this.Id && this.Id < 16){
                Figure figure = new Figure(Figure.COLOR.BLACK, this.Id);
                this.actors.add(figure);
            }

            this.Id ++;
        }


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
            AppGameContainer container = new AppGameContainer(new at.td.Parcheesi.Main("Mensch Ärger Dich Nicht"));
            container.setDisplayMode(958, 960, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
