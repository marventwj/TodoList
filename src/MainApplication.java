import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        System.out.println("Welcome To TEAM 4 TO-DO List App.\n Please make a selection: ");
        System.out.println("1) Add a task");
        System.out.println("2) Display My To-Do List ");
        System.out.println("3) Remove a Task");
        System.out.println("4) Mark Task as Complete");
        System.out.println("5) Edit Task's Description");
        System.out.println("6) Filter Task as complete/incomplete");
        System.out.println("7) Search for task by Description");
        System.out.println("8) Prioritize Task");
        System.out.println("9) Re-prioritize task");
        System.out.println("10) Export to-do list");
        System.out.println("11) Tag each task");

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int selection = sc.nextInt();  // Read user input

        ArrayList<Task> overallTask = new ArrayList<Task>();    // This will be the overall task for everyone.
        ToDoList toDoList = new ToDoList(); // This will be the to do  for everyone.

        switch (selection) {
            case 1:
                System.out.println("You selected: \"Add a task\"");

                overallTask = addATask(sc, overallTask, toDoList);

                break;
            case 2:
                System.out.println("2) Display My To-Do List ");
                break;
            case 3:
                System.out.println("3) Remove a Task");
                break;
            case 4:
                System.out.println("4) Mark Task as Complete");
                break;
            case 5:
                System.out.println("5) Edit Task's Description");
                break;
            case 6:
                System.out.println("6) Filter Task as complete/incomplete");
                break;
            case 7:
                System.out.println("7) Search for task by Description");
                break;
            case 8:
                System.out.println("8) Prioritize Task");
                break;
            case 9:
                System.out.println("9) Re-prioritize task");
                break;
            case 10:
                System.out.println("10) Export to-do list");
                break;
            case 11:
                System.out.println("11) Tag each task");
                break;
            default:
                // code block
        }
    }

    private static ArrayList<Task> addATask(Scanner sc, ArrayList<Task> overallTask, ToDoList toDoList) {
        while (true) {
            try {
                Task newTask = new Task();
                System.out.println("Please enter a title");
                sc = new Scanner(System.in);
                newTask.setTitle(sc.nextLine());

                System.out.println("Please enter a description");
                sc = new Scanner(System.in);
                newTask.setTitle(sc.nextLine());

                System.out.println("Please enter a start date in this format : dd-mm-yyyy");
                sc = new Scanner(System.in);
                SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
                Date startDate = format.parse(sc.nextLine());
                newTask.setStartDate(startDate);

                System.out.println("Please enter a end date in this format : dd-mm-yyyy");
                sc = new Scanner(System.in);
                Date endDate = format.parse(sc.nextLine());
                newTask.setStartDate(endDate);

                // Default Task is Not Completed
                newTask.setComplete(false);

                while (true) {
                    try {
                        System.out.println("Please enter a priory");
                        sc = new Scanner(System.in);
                        newTask.setPriotryNo(sc.nextInt());
                        if (newTask.getPriotryNo() >= 1 && newTask.getPriotryNo() <= 1000) {
                            break;  // Break this while loop
                        }
                    } catch (Exception e) {

                    }
                }

                return toDoList.addTask(overallTask, newTask);
            } catch (Exception e) {
                System.out.println("Failed adding a task");
                return overallTask;
            }
        }
    }


}
