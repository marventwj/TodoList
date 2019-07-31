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

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int selection = sc.nextInt();  // Read user input

        switch(selection) {
            case 1:
                System.out.println("1) Add a task");
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
}
