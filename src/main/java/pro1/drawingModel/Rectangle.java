package pro1.drawingModel;

import java.awt.*;

public class Rectangle implements Drawable {
    private int x;
    private int y;
    private int width;
    private int height;
    private String color; // Např.#FF56A1

    public Rectangle(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.decode(color));
        g.fillRect(x,y,width,height);
    }
}
