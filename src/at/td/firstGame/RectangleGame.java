package at.td.firstGame;

import org.newdawn.slick.*;

public class RectangleGame extends BasicGame {

    private float xRectangle;
    private float yRectangle;
    private float xOval;
    private float yOval;
    private float xCircle;
    private float yCircle;
    private int directionR = 1; //1 rechts, 2 unten, 3 links 4 oben
    private int directionO = 1; //1 rechts, 3 links
    private int directionC = 2; //2 unten, 4 oben
    private float speed;


    public RectangleGame(String title) {
        super(title);

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRectangle = 100;
        this.yRectangle = 100;
        this.xOval = 100;
        this.yOval = 0;
        this.xCircle = 0;
        this.yCircle = 100;
        this.speed = 2f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (directionR == 1) {

            if (this.xRectangle > 600) {
                directionR = 2;
            }
            else this.xRectangle += delta/speed;
        }
        else if (directionR == 2) {
            if (this.yRectangle > 400){
                directionR = 3;
            }
            else this.yRectangle += delta/speed;
        }
        else if (directionR == 3){
            if (this.xRectangle < 100){
                directionR = 4;
            }
            else this.xRectangle -= delta/speed;
        }
        else if (directionR == 4){
            if(this.yRectangle < 100){
                directionR = 1;
            }
            else this.yRectangle -= delta/speed;
        }

        if (directionO == 1) {
            if (this.xOval > 600){
                this.directionO = 3;
            }
            else this.xOval += delta/speed;
        }
        else if (directionO == 3){
            if (this.xOval < 100){
                this.directionO = 1;
            }
            else this.xOval -= delta/speed;
        }

        if (directionC == 2) {
            if (this.yCircle > 500){
                this.directionC = 4;
            }
            else this.yCircle += delta/speed;
        }
        else if (directionC == 4){
            if (this.yCircle < 100){
                this.directionC = 2;
            }
            else this.yCircle -= delta/speed;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRectangle, this.yRectangle, 50, 80);
        graphics.drawOval(this.xOval, this.yOval, 100, 30);
        graphics.drawOval(this.xCircle, this.yCircle, 50, 50);
        graphics.drawString("Hello you!", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectangleGame("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
