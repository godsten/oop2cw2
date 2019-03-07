
package oop2cw2.java;

import java.util.ArrayList;
import java.util.Scanner;


public class Oop2cw2Java {


    public static void main(String[] args) {

        ArrayList<String>name=new ArrayList();
    Scanner nam=new Scanner(System.in);
    System.out.println("enter Students name(enter exit when done)");
    int m=1;
    String n = nam.next();
    while(true){
       
        System.out.println("enter students name"+m+"");
        n=nam.next();
        if(n.toLowerCase().equals("exit")){
           break;
        }else
         m++;
    }
      int mark[]=new int[7];
int g = 0;
String grd;
float sum=0;
Scanner mongi = new Scanner(System.in);

System.out.println("Enter Your First Course Unit");
String b = mongi.next();
System.out.println(b);

System.out.println("Enter Your First Course Unit Marks");
  mark[g]=mongi.nextInt();
    sum=sum+mark[g];
if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}

System.out.println("Enter Your Second Course Unit");
String d= mongi.next();
System.out.println(d);

System.out.println("Enter Your Second Course Unit Marks");

 mark[g]=mongi.nextInt();
    sum=sum+mark[g];


if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}

System.out.println("Enter Your Third Course Unit");
String f = mongi.next();
System.out.println(f);

System.out.println("Enter Your Third Course Unit Marks");

 mark[g]=mongi.nextInt();
    sum=sum+mark[g];


if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}

System.out.println("Enter Your Fourth Course Unit");
String i = mongi.next();
System.out.println(i);

System.out.println("Enter Your Fourth Course Unit Marks");

 mark[g]=mongi.nextInt();
    sum=sum+mark[g];


if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}

System.out.println("Enter Your Fifth Course Unit");
String k = mongi.next();
System.out.println(k);

System.out.println("Enter Your Fifth Course Unit Marks");


 mark[g]=mongi.nextInt();
    sum=sum+mark[g];


if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}

System.out.println("Enter Your Sixth Course Unit");
String m = mongi.next();
System.out.println(m);

System.out.println("Enter Your Sixth Course Unit Marks");


    mark[g]=mongi.nextInt();
    sum=sum+mark[g];


if(mark[g]>=80 && mark[g]<100){
    grd="A";
    System.out.println("A");
}
else if(mark[g]>=70&&mark[g]<80){
    grd="B";
    System.out.println("B");
}else if(mark[g]>=60&&mark[g]<70){
    grd="C";
    System.out.println("C");
}else if(mark[g]>=50&&mark[g]<60){
    grd="D";
    System.out.println("D");
}
else if(mark[g]>40&&mark[g]<50)
{
    System.out.println("F");
}else{
    System.out.println("invalid");
}
    
}
}
