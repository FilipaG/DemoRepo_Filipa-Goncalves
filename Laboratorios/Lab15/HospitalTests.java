package lab15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HospitalTests {

	private Hospital _hospital;
	
	@Before
	public void init()
	{
	// Arrange
	_hospital = new Hospital(3);
	}
	
	@Test
	public void testAddProfessionals()
	{
		// Act & Assert
		Assert.assertTrue(_hospital.addProfessional(new Doctor("Marco")));
		Assert.assertTrue(_hospital.addProfessional(new Nurse("Miguel")));
		Assert.assertTrue(_hospital.addProfessional(new Helper("Mateus")));
	}
	
	@Test
	public void testExceededNumberOfProfessionals()
	{
		// Act & Assert
		Assert.assertTrue(_hospital.addProfessional(new Doctor("Jorge")));
		Assert.assertTrue(_hospital.addProfessional(new Nurse("Joel")));
		Assert.assertTrue(_hospital.addProfessional(new Helper("Jeremias")));
		Assert.assertFalse(_hospital.addProfessional(new Helper("Jaime")));   // como só criámos um array com 3 elementos, ele não permite colocar mais -> dá falso
		Assert.assertFalse(_hospital.addProfessional(new Doctor("Joaquim"))); // como só criámos um array com 3 elementos, ele não permite colocar mais -> dá falso
	}
	
	@Test
	public void testHealthProfessionals()
	{
		// Arrange
		HealthProfessional p1 = new Doctor("Fernando");
		HealthProfessional p2 = new Nurse("Fabio");
		HealthProfessional p3 = new Helper("Fonseca");
		// Act & Assert
		Assert.assertEquals("Dr. Fernando is treating the patient.", p1.care());
		Assert.assertEquals("Nurse Fabio is caring for a patient.", p2.care());
		Assert.assertEquals("Helper Fonseca is preparing the patient's lunch.", p3.care());
	}
	
	@Test
	public void testPersons()
	{
		// Arrange
		Person p1 = new Doctor("Rui");
		Person p2 = new Nurse("Ricardo");
		Person p3 = new Helper("Renato");
		// Act & Assert
		Assert.assertSame("Rui", p1.getName());
		Assert.assertSame("Ricardo", p2.getName());
		Assert.assertSame("Renato", p3.getName());
	}
}
