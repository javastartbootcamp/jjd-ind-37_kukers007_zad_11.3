package pl.javastart.task.computer.component.exception;

public class HardwareValueOrNameException extends RuntimeException {
    public HardwareValueOrNameException() {
        super("Name or producer cannot be a null and has to be longer than 1 letter. Thats simply, istnt it?");
    }
}
