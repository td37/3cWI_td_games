package at.td.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x;
    private float y;
    private float speed;
    private int diameter;
    private float growth;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(30) + 5;
        this.diameter = random.nextInt(10) + 10;
        this.growth = 2;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(int delta) {
        this.diameter += (float) delta / this.growth;
        this.y += (float) delta / this.speed;

    }
}
