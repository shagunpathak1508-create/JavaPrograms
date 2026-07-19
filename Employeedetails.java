import java.util.*;

class Employee{
    int id;
    int BS; //BS=basic salary
    double GS(){  //GS=gross salary
       return BS+0.3*BS+1.25*BS; }
         
}


class Employeedetails{
     
        
  public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Employee E1=new Employee();
       System.out.println("Enter Employee Id: ");
       E1.id=sc.nextInt();
       System.out.println("Enter Salary: ");
       E1.BS=sc.nextInt();
      
    System.out.println("For Id: "+E1.id);
    System.out.println("Gross salary: "+E1.GS());

}
}
