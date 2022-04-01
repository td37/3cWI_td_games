package at.td.selfMadeGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

interface Actor {

    public void update(GameContainer gameContainer, int delta);

    public void render(Graphics graphics);
}
