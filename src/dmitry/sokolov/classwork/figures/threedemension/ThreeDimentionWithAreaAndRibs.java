package dmitry.sokolov.classwork.figures.threedemension;

import dmitry.sokolov.classwork.figures.interfaces.Area;
import dmitry.sokolov.classwork.figures.interfaces.Rib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeDimentionWithAreaAndRibs <T extends ThreeDimension & Area & Rib> {
    private final List<T> figures = new ArrayList<>();

    public void addFigure (T figure) {
        figures.add(figure);
    }
    public int countFigures () {
        return figures.size();
    }
    public Map<Double, List<T>> getFiguresByArea() {
        Map<Double, List<T>> result = new HashMap<>();
        for (var figure : figures) {
            var area = figure.getArea();
            var listWithFigures = result.getOrDefault(area, new ArrayList<T>());
            listWithFigures.add(figure);
            result.put(area, listWithFigures);
        }
        return result;
    }
}
