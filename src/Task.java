import java.util.Date;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	private String title;
	private Date startDate;
	private Date endDate;
	private int priotryNo;
	private String category;
	
	
	public Task(String description) {
		super();
		this.description = description;
	}

	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}

	public Task(String description, boolean isComplete, String title, Date startDate, Date endDate, int priotryNo, String category) {
		this.description = description;
		this.isComplete = isComplete;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priotryNo = priotryNo;
		this.category = category;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPriotryNo() {
		return priotryNo;
	}

	public void setPriotryNo(int priotryNo) {
		this.priotryNo = priotryNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
