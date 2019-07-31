import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class ToDoList {

	private HashMap<String, Task> tasks = new HashMap<String, Task>();

	// Davidson
	public ArrayList<Task> addTask(ArrayList<Task> tasks, Task task) {
		try {
			tasks.add(task);
			System.out.println("Task added.");
		}catch (Exception e) {
			System.out.println("Task is not added.");
		}
		return tasks;
	}

//	public void addTask (Task task) {
//		tasks.put(task.getDescription(), task);
//	}
	public void completeTask(String description) {
		Task task = null;
		if ((task = tasks.get(description)) != null){
			task.setComplete(true);
		};
	}
	public boolean getStatus(String description) {
		Task task = null;
		if ((task = tasks.get(description)) != null){
			return task.isComplete();
		};
		return false;
	}
	public Task getTask(String description) {
		if(tasks.get(description) != null)
		{
			System.out.println(tasks.get(description).getTitle());
		}
		else
		{
			System.out.println("No task found");
		}
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		return tasks.remove(description);
	}


	public Collection<Task> getAllTasks() {
		if (tasks.size() == 0)
		{
			System.out.println("There are no item in the list");
		}

		return tasks.values();
	}




	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTasks = new ArrayList<Task> ();
		Collection<Task> allTasks = new ArrayList<Task> ();
		allTasks = getAllTasks();
		for (Task task: allTasks) 
			if (task.isComplete() == true) completedTasks.add(task);
		return completedTasks;
	}


	public ArrayList<Task> filterTask(ArrayList<Task> tasks){
		return null;
//		for (Task temp : tasks) {
//			System.out.println(temp);
//		}
	}
}
