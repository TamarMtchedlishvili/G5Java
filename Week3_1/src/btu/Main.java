package btu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student();
        student1.name = "Tamar";
        student1.lastname = "Mtchedlishvili";
     //   System.out.println(student1.name);
        student1.printData();
        student1.setAge(21);
        student1.printFullData();
        if (student1.getAge()>=18){
            System.out.println("ზრდასრულია");
        }else {
            System.out.println("არარის");
        }
    }
}
