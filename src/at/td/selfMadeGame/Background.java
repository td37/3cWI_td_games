package at.td.selfMadeGame;

import org.newdawn.slick.BigImage;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Background implements Actor{

    private Image background;

    public Background() throws SlickException {
        this.background = new BigImage("testdata/background.png", Image.FILTER_NEAREST);
    }


    @Override
    public void update(int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        background.draw(0,0);
    }
}
