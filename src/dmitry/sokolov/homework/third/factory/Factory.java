package dmitry.sokolov.homework.third.factory;

import dmitry.sokolov.homework.third.enums.*;

import static java.lang.String.format;

import dmitry.sokolov.homework.third.*;

import java.util.Arrays;

public class Factory {
    private static final int YEAR = 2022;
    private final Colors[] colors;
    private final Models[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolumes[] engineVolumes;

    public Colors[] getColors() {
        return colors;
    }

    public Models[] getModels() {
        return models;
    }

    public WheelSize[] getWheelSizes() {
        return wheelSizes;
    }

    public EngineVolumes[] getEngineVolumes() {
        return engineVolumes;
    }

    public Factory(Colors[] colors, Models[] models, WheelSize[] wheelSizes, EngineVolumes[] engineVolumes) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
    }

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes)
        );
    }
}
