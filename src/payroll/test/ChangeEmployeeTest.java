package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import payroll.Employee;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.trans.AddHourlyEmployeeTransaction;
import payroll.trans.DeleteEmployeeTransaction;

public class ChangeEmployeeTest {

	@Test
	public void testChangeName() {
		int empId = 5001;
		String name = "Bill";
		String address = "Home";
		double hourlyRate = 12.5;
		new AddHourlyEmployeeTransaction(empId,name,address,hourlyRate).execute();
		assertNotNull(PayrollDatabase.getEmployee(empId));
		String newName="Bob";
		Transaction t = new ChangeNameTransaction(empId,newName);
		t.execute();
	}
	
	@Test
	public void testChangeAddress() {}
	
	@Test
	public void testChangeHourlyRate() {}
	
	@Test
	public void testChangeSalaried() {}
	
	@Test
	public void testChangeCommissioned() {}
	
	@Test
	public void testChangeHoldMethod() {}
	
	@Test
	public void testChangeDirectMethod() {}
	
	@Test
	public void testChangeMailMethod() {}
	
	@Test
	public void testChangeNobody() {}

}
