package dmitry.sokolov.classwork.figures.threedemension;

import dmitry.sokolov.classwork.figures.Figure;
import dmitry.sokolov.classwork.figures.interfaces.Volume;

public abstract class ThreeDimension extends Figure implements Volume {
    public ThreeDimension(String name) {
        super(name);
    }
}
