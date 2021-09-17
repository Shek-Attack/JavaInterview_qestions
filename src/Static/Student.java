package Static;

public class Student {
    int rollno ; //insance variable
    String name;
    static String college = "ITS"; //static variable

    Student(int r, String n){ // constructor
        rollno = r;
        name = n;
    }
    void display(){ // method to display the values
        System.out.println(rollno+ " " + name+ " "+college);
    }
    public static void main(String[] args) {
        //need to create the object of class to access to variables and public methods
        Student s1 = new Student(111,"Elon");
        Student s2 = new Student(222,"Musk");

        //Student.college = "BBDIT"; //We can change the college of objects by the single line of code

        s1.display();
        s2.display();




    }
}
