package payroll.trans;

import payroll.PaymentClassification;
import payroll.Transaction;
import payroll.classification.HourlyClassification;
import payroll.classification.SalariedClassification;

public class AddSalariedEmployeeTransaction extends AddEmployeeTransaction implements Transaction {

	private double salary;

	public AddSalariedEmployeeTransaction(int empId, String name, String address, double salary) {
		super(empId, name, address);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	protected PaymentClassification getPaymentClassification() {
		return new SalariedClassification(salary);
	}

}
