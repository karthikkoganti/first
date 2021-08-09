package app.mylearning;

public class Employee {
	int empId;
	String empName;
	float salary;

	Employee(int empId,String empName,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		}
		void printEmpinfo() {
			System.out.println("employee details"+""+empId+""+empName+""+salary);
		}
	}


