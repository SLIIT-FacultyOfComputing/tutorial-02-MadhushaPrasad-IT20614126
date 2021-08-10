class Student{

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

    public void calcAndStoreAVG(){
        average = (subject01 + subject02 + subject03) / 3;
    }

}