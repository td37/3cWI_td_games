package at.td.Parcheesi;

import org.newdawn.slick.*;

public class Playboard implements Actor{

    private Image playboard;

    public Playboard() throws SlickException {
        this.playboard = new BigImage("testdata/playboard.png", Image.FILTER_NEAREST);
        playboard = playboard.getScaledCopy(958, 960);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        playboard.draw(0,0);
    }
}
