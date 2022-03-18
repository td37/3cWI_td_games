package at.td.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Ellipse implements Actor {

    private float x;
    private float y;
    private float speed;
    private float width;
    private float height;

    public Ellipse() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(30) + 5;
        this.width = random.nextInt(20) + 15;
        this.height = random.nextInt(20) + 15;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.width, this.height);
    }

    public void update(int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        if (this.x > 800 || this.y > 600) {
            this.x = 0;
            this.y = 0;
        }
    }
}
