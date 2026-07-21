import java.awt.*;                              //tools for design and all
import java.io.*;                               //package for maths calc(core)
import java.util.Scanner;                       //package for taking input from user

class PackageTest{
    public void main(String[] args){
         Scanner sc=new Scanner(System.in);              //to take input
         System.out.println("first number:" );  
         int num1=sc.nextInt();
         System.out.println("second number:" ); 
         int num2=sc.nextInt();

         int maxint;                                     //used io package for inbuilt math function
         maxint=Math.max(num1,num2);
         System.out.println("max:"+maxint);  


           Frame f1=new Frame();                           //new frame with label 
          Label la = new Label("Lesgoooo!"); 
          f1.add(la);     
          f1.setSize(100, 100); 
          f1.setVisible(true); 
         }
}
          