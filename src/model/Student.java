package model;

public class Student {
	//1 Variables  
		private long sID;
		private String name;
		private String surname;
		private String personcode;
		
		private static long counter = 1000;
		
		//2. set and getters
		public long getpID() {
			return sID;
		}
		public void setsID()  {
	 		this.sID = counter;
	 		counter++;
		}
		public String getPersoncode() {
			return personcode;
		}
		public void setPersoncode(String personcode) {
			if(personcode != null && personcode.matches("[0-9]{6} -[0-9]{5}"))
				this.personcode = personcode;
			else
				this.personcode = "undefined";
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
		//Constructors
		public Student() {
			setsID();
			setName("John");
			setSurname("Smith");
			setPersoncode("234562-34567");
		
		}
		
		public Student(String name, String surname, String personcode ){
			setsID();
			setName(name);
			setSurname(surname);
			setPersoncode(personcode);
			
		}
		

		//4. toString
		@Override
		public String toString()
		{
			return sID + ": " + name + " " + surname + "[" + personcode+ "]";
		}
		

}
