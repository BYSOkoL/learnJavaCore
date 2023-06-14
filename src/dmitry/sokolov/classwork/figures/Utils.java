package dmitry.sokolov.classwork.figures;

import dmitry.sokolov.classwork.figures.interfaces.Angle;
import dmitry.sokolov.classwork.figures.interfaces.Area;
import dmitry.sokolov.classwork.figures.interfaces.Rib;
import dmitry.sokolov.classwork.figures.threedemension.ThreeDimension;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static double countArea(List<? extends Area> figures) {
        double sum = 0;
        for (var area: figures) {
            sum += area.getArea();
        }
        return sum;
    }
    public static <T extends ThreeDimension & Angle> int countAnglesOf3DFigures(List<T> figures) {

        int angleCount = 0;
        for (var figureAngle: figures) {
            angleCount += figureAngle.getAngleCount();
        }
        return angleCount;
    }
    public static <T extends Figure & Rib> List<Figure> convertFiguresListsToFigures (List<T>... lists) {
        List<Figure> result = new ArrayList<>();
        for (var list : lists) {
            for (var figure : list) {
                result.add(figure);
            }
        }
        return result;
    }

}
