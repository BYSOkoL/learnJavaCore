package dmitry.sokolov.classwork.Task6.figures.threedemension;

import dmitry.sokolov.classwork.Task6.figures.Figure;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Volume;

public abstract class ThreeDimension extends Figure implements Volume {
    public ThreeDimension(String name) {
        super(name);
    }
}
