package pl.javastart.task.computer.component.exception;

public class MemoryOverlockingException extends RuntimeException {
    public MemoryOverlockingException() {
        super("WARNING ! Temperature too high ! You can burn your RAM memory ;-)");
    }
}
