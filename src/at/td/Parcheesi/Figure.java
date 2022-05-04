package at.td.Parcheesi;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import java.awt.BasicStroke;

import java.awt.*;
import java.util.Random;

public class Figure implements Actor{

    public enum COLOR{RED, YELLOW, GREEN, BLACK};
    private float x, y;
    private float diameterBase = 50;
    private float diameterTop = 45;
    private COLOR color;
    private int figureId;

    public Figure(COLOR color, int figureId) {
        this.color = color;
        this.figureId = figureId;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        Random random = new Random();
        FigurePosition fp = new FigurePosition();
        GamePoint point = fp.getFigurePosition(0);
        point.getX();
                point.getY();
        this.x = random.nextInt(100)+500;
        this.y = random.nextInt(100)+500;
        graphics.setColor(Color.black);
        graphics.fillOval(this.x, this.y, this.diameterBase, this.diameterBase);

        graphics.setColor(FigureColor.getColorForFigure(this.color));
        graphics.fillOval(this.x+(this.diameterBase-this.diameterTop)/2, this.y+(this.diameterBase-this.diameterTop)/2, this.diameterTop, this.diameterTop);

    }


}
