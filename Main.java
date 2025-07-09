class Student{
    int age = 20;
    String college ="GITAM";

}

public class Main{
    public static void main (String args[]){

        Student Shashi =new Student();
        System.out.println(Shashi.age);
        System.out.println(Shashi.college);

        Student Ram = new Student();
        Ram.age=22;
        Ram.college="REVA";
        System.out.println(Ram.age);
        System.out.println(Ram.college);
    }
}