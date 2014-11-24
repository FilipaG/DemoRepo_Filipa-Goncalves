package Lab11p2;

public class EmployeeBonus {
	double bonus = 0;
	public double getBonus(int pieces, int bonusLimit) {
		bonus = ((pieces > bonusLimit)?(0.10*pieces):(bonus));
		
		return bonus;
	}
	
	public double getBonus(int numUnits) {    // sistema de pagamento ao Departamento de Produção
		bonus = ((numUnits > 25)?(150*numUnits):(100*numUnits));
		return bonus;
	}
	
	public double getBonus(double sales) {    // sistema de pagamento ao Departamento de Vendas
		bonus = ((sales > 5000)?(0.05*sales):(bonus));
		return bonus;
	}

}
