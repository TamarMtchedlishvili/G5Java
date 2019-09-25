package btu;

public class Student {
    String name;
    public String lastname;
    private int age;

    public void printData(){
        System.out.println(name+" " + lastname);

    }
    public void setAge(int _age){
        age = _age;

    }
    public void printFullData(){
        System.out.println(name +" " + lastname+ "\n " +  age);


    }

    public int getAge(){
        return age;
    }


}
