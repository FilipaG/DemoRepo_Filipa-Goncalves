package lab14;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	private static final String EMP_NAME = "nome do empregado";
	private static final String EMP_COMPANY = "nome da empresa";
	
	@Test
	public void testWorkerOperations()
	{
		Worker worker = new Employee(EMP_NAME, EMP_COMPANY);
		// Attention: At this point, the employee has not started
		// working yet!
		Assert.assertFalse(worker.stopWork()); // Should be false.
		Assert.assertTrue(worker.startWork()); // Should be true.
		Assert.assertFalse(worker.startWork()); // Should be false.
		Assert.assertTrue(worker.stopWork()); // Should be true.
		Assert.assertFalse(worker.stopWork()); // Should be false.
	}
	
	@Test
	public void testEmployeeOperations()
	{
		Employee emp = new Employee(EMP_NAME, EMP_COMPANY);
		// Attention: At this point, the employee has not started
		// working yet!
		Assert.assertFalse(emp.stopWork()); // Should be false.
		Assert.assertTrue(emp.startWork()); // Should be true.
		Assert.assertFalse(emp.startWork()); // Should be false.
		Assert.assertTrue(emp.stopWork()); // Should be true.
		Assert.assertFalse(emp.stopWork()); // Should be false.
		Assert.assertEquals(EMP_NAME, emp.getName());
		Assert.assertEquals(EMP_COMPANY, emp.getCompany());
	}

}
