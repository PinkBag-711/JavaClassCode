import java.util.Scanner;

public class Employ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Please input the employee's name: ");
        String name  = in.nextLine();
        employee.setName(name); //可以使用方法对其修改，也可直接修改

        System.out.println("Please input the employee's age: ");
        int age = in.nextInt();
        employee.age = age; // 因为employee中的age不是private。所以可以直接访问修改

        System.out.println("Please input the employee's sarary:");
        double income = in.nextDouble();
        employee.setIncome(income);

        System.out.println("Please input the employee's bonus:");
        double income_more = in.nextDouble();
        employee.income_more = income_more;
        System.out.println("Employee's name: "+employee.name);
        System.out.println("Employee's age: "+age);
        System.out.println("Employee's income: "+employee.allIncome());


    }
}


class Employee{
    String name = "0";
    int age = 0;
    double income = 0;
    double income_more = 0;


   void setName(String s){
       name = s;
   }
   void setAge(int a){
       age = a;
   }
   void setIncome(double in){
       income = in;
   }
   void setIncome_more(double in){
       income_more = in;
   }
   double allIncome(){
       return income_more+income;
   }
}