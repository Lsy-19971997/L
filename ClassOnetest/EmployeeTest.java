package ClassOnetest;

public class EmployeeTest {
	public static void main(String args[]){
	      /* 使用构造器创建两个对象 */
	      Employee empOne = new Employee("James Smith");
	      Employee empTwo = new Employee("Mary Anne");

	      // 调用这两个对象的成员方法
	      empOne.empAge(26);
	      empOne.empDesignation("Senior\n Software\r Engineer");
	      empOne.empSalary(1000);
	      empOne.printEmployee();

	      empTwo.empAge(21);
	      //访问Employee的public static final变量
	      empTwo.empDesignation("Software\s Engineer\n" +"其他类访问:" + Employee.DEPARTMENT);
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	     
	   }
}
