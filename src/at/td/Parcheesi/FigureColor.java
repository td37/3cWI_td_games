package at.td.Parcheesi;

import org.newdawn.slick.Color;

public class FigureColor {

    public static Color getColorForFigure(Figure.COLOR colorCode){
        switch (colorCode){
            case RED:
                return new Color(255,0,0);
            case BLACK:
                return new Color(0,0,0);
            case YELLOW:
                return new Color(255, 255, 0);
            case GREEN:
                return new Color(0, 255, 0);
            default:
                return new Color(47,79,79);
        }
    }
}
