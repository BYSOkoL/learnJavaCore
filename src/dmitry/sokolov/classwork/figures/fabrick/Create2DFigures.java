package dmitry.sokolov.classwork.figures.fabrick;
import dmitry.sokolov.classwork.figures.*;
import dmitry.sokolov.classwork.figures.twodimension.TwoDimension;

public interface Create2DFigures<T extends TwoDimension> {
     T create (String name, double... params);

    }

