package payroll.trans;

import payroll.PaymentClassification;
import payroll.Transaction;

public class AddCommissionedEmployeeTransaction extends AddEmployeeTransaction implements Transaction {

	private int empId2;
	private String name2;
	private String address2;
	private double salary;
	private double commissionRate;

	public AddCommissionedEmployeeTransaction(int empId, String name, String address, double salary,
			double commissionRate) {
				empId2 = empId;
				name2 = name;
				address2 = address;
				this.salary = salary;
				this.commissionRate = commissionRate;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PaymentClassification getPaymentClassification() {
		// TODO Auto-generated method stub
		return null;
	}

}
