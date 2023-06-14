package dmitry.sokolov.classwork.figures;

import dmitry.sokolov.classwork.figures.threedemension.Pyramid;
import dmitry.sokolov.classwork.figures.twodimension.Square;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var square1 = new Square("Square1", 5);
        var square2 = new Square("Square2", 7);
        var square3 = new Square("Square3", 10);
        var pyramid1 = new Pyramid("Pyramid1", 2, 5, 4, 6);
        var pyramid2 = new Pyramid("Pyramid2", 2, 5, 4, 6);
        var pyramid3 = new Pyramid("Pyramid3", 2, 5, 4, 6);
        List<Square> squares = List.of(square1, square2, square3);
        List<Pyramid> pyramids = List.of(pyramid1, pyramid2, pyramid3);
        double result = Utils.countArea(squares);
        result = Utils.countAnglesOf3DFigures(pyramids);
    }
}
