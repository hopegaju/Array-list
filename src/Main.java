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

        System.out.print("\nEnter a task to search: ");
        String userSearch = scanner.nextLine();
        manager.searchTask(userSearch);

        System.out.print("\nEnter a task to remove: ");
        String userRemove = scanner.nextLine();
        manager.removeTask(userRemove);

        System.out.print("\nEnter an index to view a task: ");
        int userIndex = -1;
        try {
            userIndex = Integer.parseInt(scanner.nextLine());
            manager.getTaskByIndex(userIndex);
        } catch (NumberFormatException e) {
            System.out.println("Error: You must enter a number.\n");
        }

        manager.findTheLongestTask();
        manager.showTasks();
        System.out.println("\nThanks for being with me !!");
        scanner.close();

        //Additional
        manager.markTaskAsDone("Buy milk");
        manager.markTaskAsDone("Write homework");

        manager.countCompletedTasks();
    }
}

