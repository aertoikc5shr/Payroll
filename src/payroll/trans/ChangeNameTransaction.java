package payroll.trans;

import payroll.Transaction;

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

	}

}
