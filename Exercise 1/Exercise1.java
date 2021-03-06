import java.util.Scanner;

class Student{

    //declare a private field for the student's name
    private String studentName;
    //declare a private field for the student's ID number
    private String studentID;
    //create variables for store marks of three subjects
    private double subject01;
    private double subject02;
    private double subject03;
    //create a variable for store the average of three subjects
    private double average;

    public Student(){
        subject01 = 0;
        subject02 = 0;
        subject03 = 0;
    }

    //calculate and store the average of three subjects
    public void calcAndStoreAVG(){
        average = (subject01 + subject02 + subject03) / 3;
    }

    //display the ID, name and the average marks of the student
    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Average: " + average);
    }

    //set the student's name , ID number and the marks of three subjects
    public void setDetails(String name, String id, double subject01, double subject02, double subject03){
        this.studentName = name;
        this.studentID = id;
        this.subject01 = subject01;
        this.subject02 = subject02;
        this.subject03 = subject03;
    }
}

public class Exercise1 {

    public static void main(String[] args) {

        Student student = new Student();
        
        //get the student's name
        System.out.print("Enter the student's name: ");
        Scanner input = new Scanner(System.in);
        String name  = input.nextLine();

        //get the student's ID number
        System.out.print("Enter the student's ID number: ");
        Scanner input02 = new Scanner(System.in);
        String id = input02.nextLine();

        //get the marks of three subjects
        System.out.print("Enter the marks of subject 1: ");
        Scanner input03 = new Scanner(System.in);
        double subject01 = input03.nextDouble();

        System.out.print("Enter the marks of subject 2: ");
        Scanner input04 = new Scanner(System.in);
        double subject02 = input04.nextDouble();

        System.out.print("Enter the marks of subject 3: ");
        Scanner input05 = new Scanner(System.in);
        double subject03 = input05.nextDouble();

        //set the student's name , ID number and the marks of three subjects
        student.setDetails(name, id, subject01, subject02, subject03);

        //calculate and store the average of three subjects
        student.calcAndStoreAVG();

        //display the ID, name and the average marks of the student
        student.display();

    }

}
