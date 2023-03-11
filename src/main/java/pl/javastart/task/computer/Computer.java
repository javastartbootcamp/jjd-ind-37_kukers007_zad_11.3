package pl.javastart.task.computer;

import pl.javastart.task.computer.component.pccomponent.HardDrive;
import pl.javastart.task.computer.component.overlockablecomponents.Memory;
import pl.javastart.task.computer.component.overlockablecomponents.Processor;

public class Computer {
    private Processor processor;
    private HardDrive hardDrive;
    private Memory memory;
    private String name;
    private double price;

    public Computer(Processor processor, HardDrive hardDrive, Memory memory, String name, double price) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

