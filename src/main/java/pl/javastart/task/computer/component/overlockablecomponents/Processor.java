package pl.javastart.task.computer.component.overlockablecomponents;

import pl.javastart.task.computer.component.exception.ProcesorOverlockingException;

public class Processor extends OverlockableComponents {

    private static final double INCREASE_TEMPERATURE_VALUE = 10;

    public Processor(String name, String producer, String serialNumber, double frequency, double temperature, double maxTemperature) {
        super(name, producer, serialNumber, frequency, temperature, maxTemperature);
    }

    @Override
    public void overlock() {
        setFrequency(getFrequency() + INCREASE_FREQUENCY_VALUE);
        setTemperature(getTemperature() + INCREASE_TEMPERATURE_VALUE);
        if (getTemperature() > getMaxTemperature()) {
            throw new ProcesorOverlockingException();
        }
    }
}
