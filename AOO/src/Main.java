import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int option;
		System.out.println("##################################");
		System.out.println("##################################");
		System.out.println("##################################");
		System.out.println("########CADASTRO DE ALUNOS########");
		System.out.println("##################################");
		System.out.println("##################################");
		System.out.println("##################################");
		System.out.println("ESCOLHA UMA OPÇÃO PARA ACESSAR");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Pesquisar Aluno");
		System.out.println("3 - Excluir Aluno");
		System.out.println("4 - Sair");

		
		do{
			option = in.nextInt();
			switch (option) {
			case 1:
				System.out.println("\nVOCÊ ESCOLHEU CADASTRAR ALUNO");
				cadastroAlunos();
				break;
			case 2:
				System.out.println("\nVOCÊ ESCOLHEU PESQUISAR ALUNO");
				pesquisaAluno();
				break;
			case 3:
				System.out.println("\nVOCÊ ESCOLHEU EXCLUIR ALUNO");
				excluirAluno();
				break;
	
			default:
				System.out.println("\nVOCÊ DIGITOU UM NÚMERO INVÁLIDO");
				break;
			}
		}while(option != 4);

	}

}
