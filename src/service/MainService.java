package service;

import model.Course;
import model.Degree;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Professor pr1 = new Professor(); // John smith -- defaukt Professor
		System.out.println(pr1);
		
		Professor pr2 = new Professor("Karina", "Smith", Degree.Ms);
		System.out.println(pr2);
		Professor pr3 = new Professor("Estere", "Vitola", Degree.Ms);
		System.out.println(pr3);
		
		
		Student stu1 = new Student(); 
		System.out.println(stu1);
		Student stu2 = new Student("Agnes", "Kelechukwu");
		System.out.println(stu2);
		
		Course cur1 = new Course();
		System.out.println(cur1);
		Course cur2 = new Course("Data Structure", 2, pr3);
		System.out.println(cur2);
		
		Course cur3 = new Course("Networking", 4, pr2);
		System.out.println(cur3);
		
		

	}
	

}
