package at.td.objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor {
    private float x;
    private float y;
    private float speed;
    private float width;
    private float height;
    private boolean direction;


    public Rectangle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(30) + 5;
        this.width = random.nextInt(20) + 15;
        this.height = random.nextInt(20) + 15;
        this.direction = random.nextBoolean();
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, this.width, this.height);
    }

    public void update(int delta) {
        if (direction) {
            this.x += (float) delta / this.speed;
        } else {
            this.x -= (float) delta / this.speed;
        }
    }
}
