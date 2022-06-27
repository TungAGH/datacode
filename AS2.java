import java.util.Scanner;

public class AS2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Messager m1 = new Messager("M1");
		Messager m2 = new Messager("M2");
		
		try {
			m1.connect(m2);
			System.out.println("Enter multiple sentences (enter an empty string to exit):");
			while (true) {
				String sentence = scanner.nextLine();
				if (sentence.isEmpty())
					break;
				m1.send(sentence);
			}
			
			m2.receive();
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		scanner.close();
		
		m2.printAll();
	}
}
