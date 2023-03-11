package pl.javastart.task.computer.component.pccomponent;

import pl.javastart.task.computer.component.Component;

public class HardDrive extends Component {
    private int capacity;
    private String type;

    public HardDrive(String name, String producer, String serialNumber, int capacity, String type) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "HardDrive{" +
                "size=" + capacity + " GB" +
                ", type='" + type + '\'' +
                '}';
    }
}
