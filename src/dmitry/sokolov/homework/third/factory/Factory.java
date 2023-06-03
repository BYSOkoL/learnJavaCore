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

    public String toString() {
        return
                "Factory can produce: colors: " + Arrays.toString(colors) +
                        ", models: %s" + Arrays.toString(models) +
                        ", wheelSizes: %s" + Arrays.toString(wheelSizes) +
                        ", engineVolumes: %s" + Arrays.toString(engineVolumes);

    }
}
