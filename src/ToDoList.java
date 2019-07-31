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
//	public void getTask(ArrayList<Task> overallTask , String desc) {
//		for(int i =0; i<overallTask.size(); i++) {
//			if (overallTask.get(i).getDescription() == desc)
//			{
//				System.out.println(overallTask.get(i).getTitle());
//			}
//			else
//			{
//				System.out.println("No task found");
//			}
//
//		}
//	}
	public Task getTask(ToDoList tasks, String title) {
//		Task task = null;
//		for(int i = 0; i < tasks.size(); i++) {
//			task = tasks.get(i);
//		}
//		return task;
		return tasks.getTask(tasks, title);
	}
//	public Task removeTask(String description) {
//		return tasks.remove(description);
//	}


	public void getAllTasks(ArrayList<Task> overallTask) {
		if (overallTask.size() == 0)
		{
			System.out.println("There are no item in the list");
		}

		for(int i =0; i<overallTask.size(); i++) {
			System.out.println(overallTask.get(i).getTitle());
		}
	}




//	public Collection<Task> getCompletedTasks() {
//		Collection<Task> completedTasks = new ArrayList<Task> ();
//		Collection<Task> allTasks = new ArrayList<Task> ();
//		allTasks = getAllTasks();
//		for (Task task: allTasks)
//			if (task.isComplete() == true) completedTasks.add(task);
//		return completedTasks;
//	}


	public ArrayList<Task> filterTask(boolean complete, ArrayList<Task> overallTask){



//		Collection<Task> allTasks = new ArrayList<Task> ();
//		allTasks = getAllTasks();



		ArrayList<Task> tasksToReturn = new ArrayList<Task>();
		if (complete) {
			for (Task task: overallTask)
				if (task.isComplete() == true) tasksToReturn.add(task);
		}
		else{
			for (Task task: overallTask)
				if (task.isComplete() == false) tasksToReturn.add(task);
		}



		return tasksToReturn;
	}

	public Task removeTask(String description) {
		if(isAbleToRemove(description)) {
			return tasks.remove(description);
		}
		else return null;
	}

	public boolean isAbleToRemove(String description) {
		boolean canRemove = false;
		if(tasks.size()<=0) {
			System.out.println("List is empty");
		}
		else if(tasks.get(description)==null) {
			System.out.println("Task does not exist");
		}
		else {
			canRemove = true;
		}
		return canRemove;
	}

	public Boolean doesTaskExist(ArrayList<Task> tasks, String title) {
		Boolean doesTaskExist = false;
		for (int i = 0; i < tasks.size(); i++) {
			String taskTitle = tasks.get(i).getTitle();
			if (taskTitle == title) {
				doesTaskExist = true;
				break;
			}
			else {
				doesTaskExist = false;
			}
		}
		return doesTaskExist;
	}
	public void editTask(Task task, String newDescription) {
		task.setDescription(newDescription);
	}


}
