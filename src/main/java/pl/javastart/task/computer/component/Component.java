package pl.javastart.task.computer.component;

import pl.javastart.task.computer.component.exception.HardwareValueOrNameException;

public abstract class Component {
    String name;
    String producer;
    String serialNumber;

    public Component(String name, String producer, String serialNumber) {
        checkConditions(name, producer, serialNumber);
        this.name = name;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    private void checkConditions(String name, String producer, String serialNumber) {
        checkProducer(producer);
        checkSerialNumber(serialNumber);
        checkName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        checkProducer(producer);
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private void checkProducer(String producer) {
        if (producer == null) {
            throw new HardwareValueOrNameException();
        }
        int lenght = producer.length();
        if (lenght < 2) {
            throw new HardwareValueOrNameException();
        }
    }

    private void checkSerialNumber(String serialNumber) {
        if (serialNumber == null) {
            throw new HardwareValueOrNameException();
        }
        int lenght = serialNumber.length();
        if (lenght < 2) {
            throw new HardwareValueOrNameException();
        }
    }

    private void checkName(String name) {
        if (name == null) {
            throw new HardwareValueOrNameException();
        }
        int lenght = name.length();
        if (lenght < 2) {
            throw new HardwareValueOrNameException();
        }
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}