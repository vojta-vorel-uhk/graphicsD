package pro1.drawingModel;

import java.awt.*;

public class Rectangle extends WidthHeightShape {
    private String color; // Např.#FF56A1

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x,y,width,height);
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.decode(color));
        g.fillRect(x,y,width,height);
        g.drawString(color,x,y);
    }
}
