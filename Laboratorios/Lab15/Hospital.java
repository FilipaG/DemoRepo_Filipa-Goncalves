package lab15;

public  class Hospital implements HealthProfessional{
	private HealthProfessional[] professionalsList;   // cria um array do tipo HealthProfessional com tantos elementos quantos os indicados
	private int auxNum = 0; 
	
	/**
	 * Constructor
	 * @param i
	 */
	public Hospital(int i){
		professionalsList = new HealthProfessional[i];
	} 
		
	/**
	 * Adds a professional to one of the elements of professionalsList until it's full
	 * @param professional
	 * @return true  if the professional is in professionalsList, false if the professionalsList array is full
	 */
	public boolean addProfessional(HealthProfessional professional) {
		if (auxNum < professionalsList.length)
		{
			professionalsList[auxNum] = professional;
			auxNum++;
			return true;
		}
		else
			return false;
	}

/**
 * @return a string with the name of the professional and what  he/she is doing.
 */
	@Override
	public String care()
	{
		return null;
	}
}