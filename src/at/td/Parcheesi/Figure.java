package at.td.Parcheesi;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.awt.BasicStroke;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Figure implements Actor {

    public enum COLOR {RED, YELLOW, GREEN, GRAY}

    ;
    private float x, y;
    private float diameterBase = 50;
    private float diameterTop = 45;
    private COLOR color;
    private int figureId;
    private int movingFigureId;
    private String movingFigureColor;
    private int diceValue;

    public Figure(COLOR color, int figureId) {
        this.color = color;
        this.figureId = figureId;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bitte gib die Farbe an die am Zug ist.");
        movingFigureColor = scanner.next();
        System.out.println("Bitte gib die Nummer des Kegels an, den du bewegen möchtest.");
        movingFigureId = scanner.nextInt();

        diceValue = random.nextInt(5)+1;

        //if(this.figureId == movingFigureId && FigureColor.getColorForFigure(this.color) == this.movingFigureColor)

    }

    @Override
    public void render(Graphics graphics) {
        FigurePosition fp = new FigurePosition();
        GamePoint point = fp.getFigurePosition(this.figureId);
        PlayerViewFigure player = new PlayerViewFigure();

        graphics.setColor(Color.black);

        graphics.fillOval(point.getX(), point.getY(), this.diameterBase, this.diameterBase);

        graphics.setColor(FigureColor.getColorForFigure(this.color));
        graphics.fillOval(point.getX() + (this.diameterBase - this.diameterTop) / 2, point.getY() + (this.diameterBase - this.diameterTop) / 2, this.diameterTop, this.diameterTop);
        graphics.setColor(Color.black);
        graphics.drawString(String.valueOf(player.getPlayerViewFigureId(this.figureId)), point.getX()+20, point.getY()+15);
    }


}
