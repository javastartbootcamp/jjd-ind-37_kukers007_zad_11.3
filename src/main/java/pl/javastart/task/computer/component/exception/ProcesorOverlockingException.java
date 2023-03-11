package pl.javastart.task.computer.component.exception;

public class ProcesorOverlockingException extends RuntimeException {
    public ProcesorOverlockingException() {
        super("WARNING ! Temperature too high ! You can burn your processor =)");
    }
}
