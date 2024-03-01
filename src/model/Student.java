package model;

public class Student {
	//1 Variables  
		private long sID;
		private String name;
		private String surname;
		
		private static long counter = 1000;
		
		//2. set and get
		public long getpID() {
			return sID;
		}
		public void setsID()  {
	 		this.sID = counter;
	 		counter++;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if(name != null && name.matches("[A-Z]{1}[a-z]{1,20}"))
				this.name = name;
			else
				this.name = "Undifinied";
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			if(name != null && name.matches("[A-Z]{1}[a-z]{1,20}"))
				this.surname = surname;
			else
				this.name = "Undifinied";
		}
		
		public Student() {
			setsID();
			setName("John");
			setSurname("Smith");
		
		}
		
		public Student(String name, String surname) {
			setsID();
			setName(name);
			setSurname(surname);
			
		}
		

		//4. toString
		@Override
		public String toString()
		{
			return sID + ": " + name + " " + surname;
		}
		

}
