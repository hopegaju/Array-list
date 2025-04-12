import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        try {
            manager.addTask("Do laundry");
            manager.addTask("Write homework");
            manager.addTask("Buy milk");
            manager.addTask("Sell milk");
            manager.addTask("Mopping");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        manager.sortTask();
        manager.showTasks();
    }
}