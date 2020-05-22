import java.util.Locale;
import java.util.Scanner;

public class finan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Salario: ");
		salario = sc.nextDouble();
		while(salario < 0.0) {
			System.out.println("Digite um valor positivo para salário. Tente novamente: ");
			salario = sc.nextDouble();
		}
		
		sc.close();
	}

}
