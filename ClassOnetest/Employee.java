package ClassOnetest;

public class Employee {
	//设置实例变量
	   public String name;
	   int age;
	   String designation;
	   private double salary;
	   
	 //salary1是静态的私有变量
	   private static double salary1;
	   // DEPARTMENT是一个常量(类变量被声明为 public static final 类型时，类变量名称必须使用大写字母。)
	   public static final String DEPARTMENT = "Development ";
	   
	   // Employee 构造器
	   public Employee(String name){
	      this.name = name;
	   }
	   // 设置age的值
	   public void empAge(int empAge){
		// 设置局部变量age1的值
		  int age1 = 2;
		  age1 = empAge + age1;
		  System.out.println("局部变量age1 ：" + age1);
	      age =  empAge;
	   }
	   /* 设置designation的值*/
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   /* 设置salary的值*/
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	   /* 打印信息 */
	   public void printEmployee(){
	      System.out.println("Name\":"+ name );
	      System.out.println("Age\':" + age );
	      System.out.println("Designation\\:" + designation );
	      System.out.println("Salary:" + salary);
	      //静态变量可以通过：ClassName.VariableName 的方式访问。
	      Employee.salary1 = 18000;
	      System.out.println("after change record :" + salary1 + DEPARTMENT);
	   }
	   
	   /*
	   public static void main(String []args) {
		   salary1 = 16000;
		   System.out.println(DEPARTMENT + "静态变量salary1 :" + salary1);
		   
	   }*/
}

