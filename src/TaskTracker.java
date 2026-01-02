import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Welcome to the Task Tracker--");
        System.out.println("1: Add Task.");
        System.out.println("2: Update Task.");
        System.out.println("3: Delete Task.");
        System.out.println("4: Progress Task.");
        System.out.println("5: Done Task.");
        System.out.println("6: List of task.");
        System.out.println("7: List of task that is not done.");
        System.out.println("8: List of task that are progress.");
        System.out.println("9: List of task that is done.");

        System.out.print("Input a number: ");
        Integer choices = scanner.nextInt();


        scanner.close();
    }
}

