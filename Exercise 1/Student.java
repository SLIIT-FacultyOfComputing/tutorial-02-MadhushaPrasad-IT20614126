class Student{

    //declare a private field for the student's name
    private String studentName;
    //declare a private field for the student's ID number
    private String studentID;
    //create variables for store marks of three subjects
    private double subject01;
    private double subject02;
    private double subject02;
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
}