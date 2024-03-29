import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                tdl.getAllTasks(overallTask);
            }

            else if(selection == 3)
            {
                System.out.println("3) Remove a Task");
                System.out.println("Enter task name: ");
                //Scanner sc = new Scanner(System.in);
                String taskName = sc.nextLine();
                toDoList.removeTask(taskName);
            }

            else if(selection == 4)
            {
                System.out.println("Type '1' to show completed tasks, Type '2' to show incompleted tasks");
                selection = sc.nextInt();  // Read user input

                ArrayList<Task> tasksToPrint = new ArrayList<Task>();
                if (selection == 1){
                    tasksToPrint = tdl.filterTask(true, overallTask);
                    System.out.println("Completed Tasks: ");
                }
                else{
                    tasksToPrint = tdl.filterTask(false, overallTask);
                    System.out.println("Incompleted Tasks: ");
                }

                for (Task task: tasksToPrint){
                    System.out.println(task.getTitle());
                }
//                ArrayList<Task> completedTasks = todoList.filterTask(true);
            }

            else if(selection == 5)
            {
                System.out.println("5) Edit Task's Description");
                System.out.println("Please enter the title of the task you want to edit: ");
                sc.nextLine();
                String taskTitle = sc.nextLine();
                Task taskToBeEdited = toDoList.getTask(tdl, taskTitle);
                Boolean taskExists = toDoList.doesTaskExist(overallTask, taskTitle);
                if (taskExists) {
                    System.out.println("Current description of selected task: " + taskToBeEdited.getDescription());
                    System.out.println("Please enter the edit you would like to make: ");
                    String newDescription = sc.nextLine();
                    toDoList.editTask(taskToBeEdited, newDescription);
                    System.out.println("Task has been successfully edited to: " + taskToBeEdited.getDescription() + "!");

                }
                else {
                    System.out.println("This task does not exist!");

                }
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
                tdl.getTask(tdl , desc);
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


    private static ArrayList<Task> addATask(Scanner sc, ArrayList<Task> overallTask, ToDoList toDoList) {
        while (true) {
            try {
                Task newTask = new Task();
                System.out.println("Please enter a category");
                sc = new Scanner(System.in);
                newTask.setCategory(sc.nextLine());
                System.out.println("Please enter a title");
                sc = new Scanner(System.in);
                newTask.setTitle(sc.nextLine());
                System.out.println("Please enter a description");
                sc = new Scanner(System.in);
                newTask.setDescription(sc.nextLine());
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

