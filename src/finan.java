import java.util.Locale;
import java.util.Scanner;

public class finan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, porcentagem, valorFinanciado, conta, entrada;
		int prestacao, opcao;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Salario: ");
		salario = sc.nextDouble();
		while(salario < 0.0) {
			System.out.println("Digite um valor positivo para salário. Tente novamente: ");
			salario = sc.nextDouble();
		}
		
		System.out.println("Numero de prestacoes: ");
		prestacao = sc.nextInt();
		System.out.println("Porcentagem de entrada: ");
		porcentagem = sc.nextDouble();
		System.out.println("Valor total financiado: ");
		valorFinanciado = sc.nextDouble();
		conta = ( porcentagem/100.0 )*valorFinanciado;
		conta = ( valorFinanciado - conta ) / prestacao;
		while(conta > salario*0.30) {
			System.out.println("Numero de prestacoes: ");
			prestacao = sc.nextInt();
			System.out.println("Porcentagem de entrada: ");
			porcentagem = sc.nextDouble();
			System.out.println("Valor total financiado: ");
			valorFinanciado = sc.nextDouble();
			conta = ( porcentagem/100.0 )*valorFinanciado;
			conta = ( valorFinanciado - conta ) / prestacao;
		}
		
		boolean bol1 = true;
		while(bol1) {
			System.out.println(" ");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao = sc.nextInt();
			
			if(opcao == 4) {
				bol1 = false;
				System.out.println(" ");
				System.out.println("FIM DO PROGRAMA!");
			}else if(opcao == 1) {
				System.out.println(" ");
				entrada = ( porcentagem/100.0 )*valorFinanciado;
				System.out.printf("ENTRADA = R$ %.2f%n", entrada);
				entrada = 0.0;
			}else if(opcao == 2) {
				System.out.println(" ");
				entrada = ( porcentagem/100.0 )*valorFinanciado;
				entrada =  valorFinanciado - entrada;
				System.out.printf("VALOR FINANCIADO = R$ %.2f%n", entrada);
				entrada = 0.0;
			}else if(opcao == 3) {
				System.out.println(" ");
				entrada = ( porcentagem/100.0 )*valorFinanciado;
				entrada = (valorFinanciado - entrada) / prestacao;
				System.out.printf("VALOR FINANCIADO = R$ %.2f%n", entrada);
				entrada = 0.0;
			}
		}
		
		
		sc.close();
	}

}
