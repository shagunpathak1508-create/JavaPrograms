class Student{
      
    int roll_no;
    String name;
    void get_age(){
       System.out.println("Multiplication is: "+ roll_no*2);
             }
               }

class Studentdetails{
      public static void main(String[] args){
         Student s1=new Student();
         Student s2=new Student();

       s1.roll_no=1;
       s1.name="shagun";

       s2.roll_no=2;
       s2.name="Priyanka";

    System.out.println("Name of student 1 is:" + s1.name);
    System.out.println("Name of student 2 is:" + s2.name);
}
}