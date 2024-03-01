package model;

public class Course {
	private long cID;
	private String title;
	private int creditpoints;
	private Professor professor;
	
	
	private static long counter = 4;
	
	public long getcID() {
		return cID;
	}
	public void setcID() {
		this.cID = counter;
		counter++;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Za-z 0-9]{4,40}"))
			this.title = title;
		else
			this.title = "Undifined";
		
	}
	public int getCreditpoints() {
		return creditpoints;
	}
	public void setCreditpoints(int creditpoints) {
		if(creditpoints > 0 && creditpoints <=20)
		
			this.creditpoints = creditpoints;
		else
			this.creditpoints= 2;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		if(professor != null)
		
			this.professor = professor;
		else 
			this.professor =new Professor();
		
		
	}
	// constructors
	public  Course() {
		setcID();
		setTitle("Java Programming");
		setCreditpoints(6);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditpoints, Professor professor){
		setcID();
		setTitle(title);
		setCreditpoints(creditpoints);
		setProfessor(professor);
		
	}
		
		

	//4. toString
	@Override
	public String toString()
	{
		return cID + ": " + title + "( " + creditpoints + " CP,)" + professor.getName().charAt(0) + "." + professor.getSurname();
	}
	
	
	

}
