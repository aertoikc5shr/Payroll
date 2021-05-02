package payroll.trans;

import payroll.Employee;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.exception.NoSuchEmployeeException;

public class DeleteEmployeeTransaction implements Transaction {

	private int empId;

	public DeleteEmployeeTransaction(int empId) {
		this.empId = empId;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Employee e = PayrollDatabase.getEmployee(empId);
		if (e != null) {
			PayrollDatabase.deleteEmployee(empId);
		} else {
			throw new NoSuchEmployeeException("No such employee empId="+empId);
		} 

	}

}
