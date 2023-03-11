package pl.javastart.task.computer.component.overlockablecomponents;

import pl.javastart.task.computer.component.Component;

public abstract class OverlockableComponents extends Component implements Overclockable {
    static final double INCREASE_FREQUENCY_VALUE = 100;
    private double frequency;
    private double temperature;
    private double maxTemperature;

    public OverlockableComponents(String name, String producer, String serialNumber, double frequency, double temperature, double maxTemperature) {
        super(name, producer, serialNumber);
        this.frequency = frequency;
        this.temperature = temperature;
        this.maxTemperature = maxTemperature;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "OverlockableComponents{" +
                "frequency=" + frequency +
                ", temperature=" + temperature +
                ", maxTemperature=" + maxTemperature +
                '}';
    }
}
