package model;

public class Grade {
	private  long gID;
	private  int value;
	private Student student;
	private Course course;
	
	private static long counter = 20000;
	
	// setter and getters

	public long getgID() {
		return gID;
	}

	public void setgID() {
		this.gID = counter;
		counter++;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value > 0 && value <=100)
		
			this.value = value;
		else
			this.value = 4;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		if(student  != null)
			this.student = student;
		else
			this.student = new Student();
		
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		if(course != null)
			this.course = course;
		else
			this.course = new Course();
	}


	// constructors
		public  Grade() {
			setgID();
			setValue(10);
			setStudent(new Student());
			setCourse(new Course());
		}
		
		public Grade(int value,  Student student, Course course){
			setgID();
			setValue(value);
			setStudent(student);
			setCourse(course);
			
		}
			
			

		//4. toString and outputting the code example: John Smith received  a grade  total of  8 in  Java
		@Override
		public String toString()
		{
			return gID + ": "   + student.getName().charAt(0) + "." + student.getSurname() + " recieved a grade total of " +"( " + value + ")"  + "in " + course.getTitle();
		}
		
	
	
	
	

}
