package at.td.Parcheesi;

import org.newdawn.slick.Color;

public class FigureColor {

    public static Color getColorForFigure(Figure.COLOR colorCode){
        switch (colorCode){
            case RED:
                return new Color(255,50,50);
            case GRAY:
                return new Color(117,117,117);
            case YELLOW:
                return new Color(255, 255, 80);
            case GREEN:
                return new Color(0, 180, 0);
            default:
                return new Color(0, 0, 0);
        }
    }
}
