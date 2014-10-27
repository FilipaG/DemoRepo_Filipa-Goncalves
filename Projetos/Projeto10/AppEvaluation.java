

public class AppEvaluation {

	public static void main(String[] args) {
		Evaluation test1 = new Simple("First Test", 12);
		Evaluation test2 = new Simple("Second Test", 16);
		System.out.println(test1);
		System.out.println("------");
		test2.list("->");
				
		Complex allTests = new Average("Test Grades", 2); // 2 testes inseridos
		allTests.add(test1);
		allTests.add(test2);
		System.out.println(allTests);
		System.out.println("------");
		allTests.list("-> ");
	}

}
