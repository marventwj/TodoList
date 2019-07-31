import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
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

//        Scanner scMain = new Scanner(System.in);  // Create a Scanner object
//        int selection = scMain.nextInt();  // Read user input
        ToDoList tdl = new ToDoList();
        ArrayList<Task> overallTask = new ArrayList<Task>();    // This will be the overall task for everyone.
        ToDoList toDoList = new ToDoList(); // This will be the to do  for everyone.

        int selection = 100;

        while(selection != 0)
        {
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            selection = sc.nextInt();  // Read user input

            if(selection == 1)
            {
                System.out.println("You selected: \"Add a task\"");
                overallTask = addATask(sc, overallTask, toDoList);

            }

            else if(selection == 2)
            {
                System.out.println("2) Display My To-Do List ");
                tdl.getAllTasks();
            }

            else if(selection == 3)
            {
                System.out.println("3) Remove a Task");
            }

            else if(selection == 4)
            {
                System.out.println("4) Mark Task as Complete");
            }

            else if(selection == 5)
            {
                System.out.println("5) Edit Task's Description");
            }

            else if(selection == 6)
            {
                System.out.println("6) Filter Task as complete/incomplete");
            }

            else if(selection == 7)
            {
                Scanner sc7 = new Scanner(System.in);
                System.out.println("7) Search for task by Description");
                System.out.println("Enter description");
                String desc = sc7.nextLine();
                tdl.getTask(desc);
            }

            else if(selection == 8)
            {
                System.out.println("8) Prioritize Task");
            }

            else if(selection == 9)
            {
                System.out.println("9) Re-prioritize task");
            }

            else if(selection == 10)
            {
                System.out.println("10) Export to-do list");
            }

            else if(selection == 11)
            {
                System.out.println("11) Tag each task");
            }
            else
            {
                System.out.println("System ending");
            }
        }
    }
}
