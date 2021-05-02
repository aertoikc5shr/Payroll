package payroll.trans;

import payroll.Employee;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.classification.HourlyClassification;
import payroll.classification.SalariedClassification;
import payroll.method.HoldMethod;

public class AddSalariedEmployeeTransaction implements Transaction {

	private int empId;
	private String name;
	private String address;
	private double salary;

	public AddSalariedEmployeeTransaction(int empId, String name, String address, double salary) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee employee=new Employee(empId,name,address);
		employee.setPaymentClassification(new SalariedClassification(salary));
		employee.setPaymentMethod(new HoldMethod());
		PayrollDatabase.save(employee);

	}

}
