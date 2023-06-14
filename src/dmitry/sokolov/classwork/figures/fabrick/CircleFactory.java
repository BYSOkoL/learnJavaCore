package dmitry.sokolov.classwork.figures.fabrick;

import dmitry.sokolov.classwork.figures.twodimension.Circle;

import java.util.Arrays;

public class CircleFactory implements Create2DFigures<Circle> {
    public Circle create (String name, double... params){
        if (name == null || params == null) {
            throw new NullPointerException("Name or params is null.");
        }
        if (params.length > 1 || params[0] <= 0) {
            throw new IllegalArgumentException("Params incorrect " + Arrays.toString(params));
        }
        return new Circle(name, params[0]);
    }
}
