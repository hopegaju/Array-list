import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskManager {
    ArrayList<String> tasks = new ArrayList<String>();
    ArrayList<Boolean> taskStatus = new ArrayList<>();
    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid task! Task cannot be empty.");
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    public void sortTask() {
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
    public void findTheLongestTask() {
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
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (String task : tasks) {
                if (task.endsWith("✔️")) {
                    System.out.println("[Done] " + task.replace("✔️", "").trim());
                } else {
                    System.out.println("[Pending] " + task);
                }
            }
        }
        System.out.println("Task count: " + tasks.size());
    }

    //Additional search
    //notice task which are done
    public void markTaskAsDone(String task) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            taskStatus.set(index, true);
            System.out.println("Task marked as done: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }
    //completed tasks
    public void countCompletedTasks() {
        int count = 0;
        for (boolean status : taskStatus) {
            if (status) count++;
        }
        System.out.println("✅ Completed: " + count + "/" + tasks.size());
    }


}
