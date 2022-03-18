package at.td.objects;

import org.newdawn.slick.Graphics;

interface Actor {

    public void update(int delta);

    public void render(Graphics graphics);
}
