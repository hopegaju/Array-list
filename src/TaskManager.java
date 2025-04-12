import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskManager {
    ArrayList<String> tasks = new ArrayList<String>();
    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid task! Task cannot be empty.");
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    public void sortTask(String task) {
        Collections.sort(tasks);
        System.out.println("\nTasks sorted ");
    }
    public void searchTask(String task) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found: ");
        }
    }
    public void removeTask(String task) {
        if (tasks.remove(task)){
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: ");
        }
    }
    public void findTheLongestTask(String task) {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty");
            return;
        }
        String longestTask = tasks.get(0);
        for (String r : tasks) {
            if (r.length() > longestTask.length()) {
                longestTask = r;
            }
        }
        System.out.println("\n Longest task: " + longestTask);
    }
    public void getTaskByIndex(int index) {
        try {
            String task = tasks.get(index);
            System.out.println("Task index " + index + " found: " + task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! No task at that position.");
        }
    }
    public void showTasks() {
        System.out.println("\nTask list: ");
        System.out.println("Task count: " + tasks.size());
    }
}
