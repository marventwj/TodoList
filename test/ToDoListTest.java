import org.junit.*;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.Collection;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class ToDoListTest {
	private Task task1;
	private Task task2;
	private Task task3;
	private ToDoList todoList = new ToDoList();

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
    public void testAddTask() throws ParseException {
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task t1 = new Task();
        t1.setCategory("Food");
        t1.setTitle("Make Mac & Cheese");
        t1.setDescription("Go NTUC and buy lah");
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        Date startDate = format.parse("31-07-2019");
        t1.setStartDate(startDate);
        Date endDate = format.parse("01-08-2019");
        t1.setEndDate(endDate);
        t1.setComplete(false);
        t1.setPriotryNo(1);

        Task t2 = new Task();
        t2.setCategory("Food");
        t2.setTitle("Make Mac & Cheese");
        t2.setDescription("Go NTUC and buy lah");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-mm-yyyy");
        Date startDate2 = format.parse("31-07-2019");
        t2.setStartDate(startDate2);
        Date endDate2 = format.parse("01-08-2019");
        t2.setEndDate(endDate2);
        t2.setComplete(false);
        t2.setPriotryNo(1);


        tasks = todoList.addTask(tasks, t1);
        tasks = todoList.addTask(tasks, t2);
        assertEquals(2, tasks.size());
    }

//	@Test
//	public void testgetStatus() {
//		assertNotNull(todoList);
//		todoList.addTask(task1);
//		assertEquals(false, todoList.getStatus(task1.getDescription()));
//		todoList.completeTask(task1.getDescription());
//		assertEquals(true, todoList.getStatus(task1.getDescription()));
//	}
//	@Test
//	public void testRemoveTask() {
//		assertNotNull(todoList);
//		todoList.addTask(task1);
//		todoList.addTask(task2);;
//
//		todoList.removeTask(task1.getDescription());
//		assertNull(todoList.getTask(task1.getDescription()));
//	}
//	@Test
//	public void testGetCompletedTasks() {
//		task1.setComplete(true);
//		task3.setComplete(true);
//		todoList.addTask(task1);
//		todoList.addTask(task2);
//		todoList.addTask(task3);
//
//		Collection<Task> tasks = todoList.getCompletedTasks();
//		assertEquals(2, tasks.size());
//	}
}
