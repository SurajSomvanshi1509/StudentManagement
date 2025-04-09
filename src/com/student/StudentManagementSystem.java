package com.student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	private ArrayList<Student>students;
	private Scanner scanner=new Scanner(System.in);
	public StudentManagementSystem() {
		this.students=new ArrayList<>();
	}
	public void addStudent() {
		System.out.print("Enter Student Id: ");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Student Name: ");
		String name=scanner.nextLine();
		System.out.print("Enter Student Age: ");
		int age=scanner.nextInt();
		Student student=new Student(id,name,age);
		students.add(student);
		System.out.println("Student added Successfully!!");
	}
	public void viewStudents() {
		if(students.isEmpty()) {
			System.out.println("No Students Found");
			return;
		}
		System.out.println("List of Students: ");
		for(Student student:students) {
			System.out.println(student);
		}
	}
	public void deleteStudent() {
		System.out.print("Enter Student ID delete: ");
		int id=scanner.nextInt();
		boolean found=false;
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getStudentId()==id) {
				students.remove(i);
				System.out.println("Student deleted Successfully!!");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student with ID "+id+" not found.");
		}
	}
	public void run() {
		while(true) {
			System.out.println("Student Management System");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Delete Student");
			System.out.println("4 Exit");
			System.out.print("Choose an Option: ");
			int choise=scanner.nextInt();
			switch(choise) {
			case 1:addStudent();
			       break;
			case 2:viewStudents();
			       break;
			case 3:deleteStudent();
			       break;
			case 4:System.out.println("Existing...");
			       return;
			default:System.out.println("Enter choise from 1-4");
			}
		}
	}
	public static void main(String[] args) {
		StudentManagementSystem studentManagementSystem=new StudentManagementSystem();
		studentManagementSystem.run();
		
	}

}
