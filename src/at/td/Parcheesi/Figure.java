package at.td.Parcheesi;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import java.awt.BasicStroke;

import java.awt.*;

public class Figure implements Actor{

    private float x = 100;
    private float y = 100;
    private float diameter = 50;

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillOval(this.x, this.y, this.diameter, this.diameter);
        graphics.setColor(Color.red);
        graphics.fillOval(this.x+2.5f, this.y+2.5f, this.diameter-5, this.diameter-5);

    }


}
