package Lab11p2;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class EmployeeBonusTester {
	EmployeeBonus eB = new EmployeeBonus();    //temos de criar o objecto
	@Test    // teste para bonus do Departamento de vendas
	public void testGetBonusDoubleParamBelowThreshould(){   //se o valor de vendas for <= a 5000, n�o recebe bonus
		Assert.assertTrue(0.0 == eB.getBonus(4000.0));
	}
	
	@Test     // teste para bonus do Departamento de vendas
	public void testGetBonusDoubleParamAboveThreshould(){   //se o valor de vendas for >= a 5000 recebe 5% sobre as vendas
		double sales = 6000.0;
		Assert.assertTrue((0.05 * sales) == eB.getBonus(sales));
	}
	
	@Test     // teste para bonus do Departamento de produ��o
	public void testGetBonusIntParamBelowThreshould(){   //se o n� pe�as produzidas for <= 25, recebe bonus 100�/pe�a
		int numUnits = 1;
		Assert.assertTrue(100.0  == eB.getBonus(numUnits));
	}
	
	@Test     // teste para bonus do Departamento de produ��o
	public void testGetBonusIntParamAboveThreshould(){ //se o n� pe�as produzidas for > 25, recebe bonus 150�/pe�a
		int numUnits = 30;
		Assert.assertTrue((150 * numUnits) == eB.getBonus(numUnits));
	}
	
	@Test    // teste para bonus do Departamento de montagem
	public void testGetBonus2ParamsBelowThreshould(){    //se o n� pe�as montadas for <= 250 (part-time), n�o recebe bonus
		int UNITS_PT = 250;              //se o n� pe�as montadas for <= 700 (full-time), n�o recebe bonus
		int UNITS_FT = 700;
		int numUnits = 200;
		Assert.assertTrue(0.0 == eB.getBonus(numUnits, UNITS_PT));
		Assert.assertTrue(0.0 == eB.getBonus(numUnits, UNITS_FT));	
	}
	
	@Test    // teste para bonus do Departamento de montagem
	public void testGetBonus2ParamAboveThreshould(){//se o n� pe�as montadas for > 250 (part-time), recebe bonus 0.10�/pe�a
		int UNITS_PT = 250;              //se o n� pe�as montadas for > 700 (full-time), recebe bonus 0.10�/pe�a
		int UNITS_FT = 700;
		int numUnits = 800;
		Assert.assertTrue((0.10 * numUnits)  == eB.getBonus(numUnits, UNITS_PT));
		Assert.assertTrue((0.10 * numUnits) == eB.getBonus(numUnits, UNITS_FT));
	}
}
