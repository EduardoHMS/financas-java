import java.util.Locale;
import java.util.Scanner;

public class finan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, porcentagem, valorFinanciado, conta;
		int prestacao;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Salario: ");
		salario = sc.nextDouble();
		while(salario < 0.0) {
			System.out.println("Digite um valor positivo para salário. Tente novamente: ");
			salario = sc.nextDouble();
		}
		
		boolean bol = true;
		while(bol) {
			System.out.println("Numero de prestacoes: ");
			prestacao = sc.nextInt();
			System.out.println("Porcentagem de entrada: ");
			porcentagem = sc.nextDouble();
			System.out.println("Valor total financiado: ");
			valorFinanciado = sc.nextDouble();
			
			conta = ( porcentagem/100.0 )*valorFinanciado;
			conta = ( valorFinanciado - conta ) / prestacao;
			if(conta <= salario*0.30) {
				bol = false;
			}
		}
		
		
		sc.close();
	}

}
