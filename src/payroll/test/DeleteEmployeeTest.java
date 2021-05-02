package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import payroll.Employee;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.exception.NoSuchEmployeeException;
import payroll.trans.AddHourlyEmployeeTransaction;
import payroll.trans.DeleteEmployeeTransaction;

public class DeleteEmployeeTest {

	@Test
	public void testDeleteEmployeeExists() {
		int empId = 2001;
		new AddHourlyEmployeeTransaction(empId, "Bill", "Home", 12.5).execute();

		Transaction t = new DeleteEmployeeTransaction(empId);
		t.execute();

		Employee e = PayrollDatabase.getEmployee(empId);
		assertNull(e);
	}
	
	@Test
	public void deleteEmployeeNotExists() {
		int empId = 2002;
		Employee e = PayrollDatabase.getEmployee(empId);
		assertNull(e);
		
		Transaction t = new DeleteEmployeeTransaction(empId);
		try {
			t.execute();
			fail("No such employee.");
		} catch (Exception e2) {
			// TODO: handle exception
			assertTrue(e2 instanceof NoSuchEmployeeException);
		}
		
	}

}
