package payroll.trans;

import payroll.Employee;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.exception.NoSuchEmployeeException;

public class ChangeNameTransaction implements Transaction {

	private int empId;
	private String newName;

	public ChangeNameTransaction(int empId, String newName) {
		this.empId = empId;
		this.newName = newName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee employee = PayrollDatabase.getEmployee(empId);
		if (employee== null)
			throw new NoSuchEmployeeException("No such employee");
		employee.setName(newName);

	}

}
