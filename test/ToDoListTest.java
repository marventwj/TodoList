import org.junit.*;
import static org.junit.Assert.*;


import java.util.Collection;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class ToDoListTest {
	private Task task1;
	private Task task2;
	private Task task3;
	private ToDoList todoList;

	DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
	Date dateobj = new Date();

	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		task1 = new Task ("desc 1" , false , "title 1" , dateobj , dateobj , 0 , "Nil");
		task2 = new Task ("desc 2" , false , "title 2" , dateobj , dateobj , 0 , "Nil");
		task3 = new Task ("desc 3" , false , "title 3" , dateobj , dateobj , 0 , "Nil");
		
		todoList = new ToDoList();
	}
	@After
	 public void tearDown() throws Exception{
		task1 = null;
		task2 = null;
		task3 = null;
		
		todoList = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull(todoList);
		todoList.addTask(task1);
		assertEquals(1, todoList.getAllTasks().size());
		assertEquals(task1, todoList.getTask(task1.getDescription()));

	}
	@Test
	public void testgetStatus() {
		assertNotNull(todoList);
		todoList.addTask(task1);
		assertEquals(false, todoList.getStatus(task1.getDescription()));
		todoList.completeTask(task1.getDescription());
		assertEquals(true, todoList.getStatus(task1.getDescription()));
	}
	@Test
	public void testRemoveTask() {
		assertNotNull(todoList);
		todoList.addTask(task1);
		todoList.addTask(task2);
		todoList.removeTask(task1.getDescription());
		assertNull(todoList.getTask(task1.getDescription()));	
	}
	@Test
	public void testGetCompletedTasks() {
		task1.setComplete(true);
		task3.setComplete(true);
		todoList.addTask(task1);
		todoList.addTask(task2);
		todoList.addTask(task3);
		
		Collection<Task> tasks = todoList.getCompletedTasks();
		assertEquals(2, tasks.size());
	}
}
