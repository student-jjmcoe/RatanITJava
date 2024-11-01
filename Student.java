import java.util.Scanner;

Class Student
{
     private int rollNumber;
     private int age;
     private String name;

     //Parameterized constructor
     public Student (String name, int age, int rollNumber){
               this.rollNumber = rollNumber;
               this.age = age;
               this.name = name;
     }
     //Copy Constructor
     public Student(Student student)
     {
               this.rollNumber = student.rollNumber;
               this.age = student.age;
               this.name = student.name;
     }
     //method to print
     public void displayStudent(){
               System.out.println("Roll number :"+this.rollNumber);
               System.out.println("Name:" + this.name);
               System.out.println("Age:" + this.age);
     }
     public static void main(String[] args) {
	Scanner scanner=new Scanner (Sytem.in);
	System.out.println("Enter your name");
	String name=scanner.next();

        Sytem.out.println("Enter your RollNumber");
        int roll_number=scanner.nextInt();

        System.out.println("Enter your age");
        int age =scanner.nextln();

        Student student =new Student(name,age,roll_number);

        System.out.println("contents of the original object");
        student.displayStudent();

        Student student_copy=new Student(student);

        System.out.ptintln("Contents of the copied object");
        student_copy.displayStudent();

}