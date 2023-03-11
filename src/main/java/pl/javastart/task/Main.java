package pl.javastart.task;

import pl.javastart.task.computer.Computer;
import pl.javastart.task.computer.component.pccomponent.HardDrive;
import pl.javastart.task.computer.component.overlockablecomponents.Memory;
import pl.javastart.task.computer.component.overlockablecomponents.Processor;
import pl.javastart.task.computer.component.exception.HardwareValueOrNameException;
import pl.javastart.task.computer.component.exception.MemoryOverlockingException;
import pl.javastart.task.computer.component.exception.ProcesorOverlockingException;

public class Main {
    public static void main(String[] args) {
        try {
            Memory memory = new Memory("DDR5", "Kingstone", "AEM12345",
                    3200, 40, 70);
            Processor processor = new Processor("Core i7", "Intel", "aws1234",
                    3800, 60, 90);
            HardDrive hardDrive = new HardDrive("Pro", "Samsung", "SAM12345", 500, "SSD");
            Computer computer = new Computer(processor, hardDrive, memory, "Dell", 4000);
            System.out.println(processor);
            processor.overlock();
            processor.overlock();
            processor.overlock();
            memory.overlock();
            memory.overlock();
            memory.overlock();
            System.out.println(processor);
        } catch (HardwareValueOrNameException | MemoryOverlockingException |
                 ProcesorOverlockingException e) {
            System.err.println(e.getMessage());
        }
    }
}