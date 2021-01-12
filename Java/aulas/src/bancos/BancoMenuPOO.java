package bancos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoMenuPOO {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		char op;// visivel em todo o programa - escopo
		char saida;
		int numeroConta = 0; // escopo global
		List<Conta> contas = new ArrayList<>();

		System.out.println("BANCO G2Bank");
		do {
			System.out.println("1 - Abertura de conta ");
			System.out.println("2 - Acesso a uma conta existente ");
			System.out.println("3 - Sair ");
			op = leia.next().charAt(0);
			if (op == '1') {
				System.out.println("1 - Conta Poupan�a");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.print("Digite o numero de sua op��o: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.print("Digite o seu CPF: ");
				String cpfConta = leia.next();
				switch (opconta) {
				case '1': {
					System.out.print("Digite a data de aniversario da conta: ");
					int dataAniversario = leia.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);
					contas.add(poupanca);
					System.out.println("Numero da conta criada: " + numeroConta);
				}
					break;

				case '2': {
					System.out.print("Digite a quantidade de tal�o de cheque: ");
					int numeroTalaoCheque = leia.nextInt();
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta, 3);
					contas.add(corrente);
					System.out.println("Numero da conta criada: " + numeroConta);
				}
					break;

				case '3': {
					System.out.print("Insira o valor do Limite do Cliente: R$ ");
					double valorLimite = leia.nextDouble();
					ContaEspecial especial = new ContaEspecial(numeroConta, cpfConta, valorLimite);
					especial.registraLimite();
					contas.add(especial);
					System.out.println("Numero da conta criada: " + numeroConta);
				}
					break;

				case '4': {
					System.out.print("Insira o valor do emprestimo disponivel: R$ ");
					double valorEmprestimo = leia.nextDouble();
					ContaEmpresarial empresarial = new ContaEmpresarial(numeroConta, cpfConta, valorEmprestimo);
					contas.add(empresarial);
					System.out.println("Numero da conta criada: " + numeroConta);
				
				}
					break;
				}

			} else if (op == '2') {
				System.out.println("Digite o numero da conta");
				numeroConta = leia.nextInt();
				Conta conta = null;
				try {
					conta = contas.get(numeroConta - 1);

					saudacao(conta);

					if (conta instanceof ContaEspecial) {
						menuContaEspecial((ContaEspecial) conta);
					} else if (conta instanceof ContaPoupanca) {
						menuContaPoupanca((ContaPoupanca) conta);
					} else if (conta instanceof ContaEmpresarial) {
						menuContaEmpresarial((ContaEmpresarial) conta);
					} else if (conta instanceof ContaCorrente) {
						menuContaCorrente((ContaCorrente) conta);
					} 

				} catch (Exception e) {
					System.out.println("Conta n�o encontrada!");
				}
			} else {

			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}

		} while (true);

	}


	private static void saudacao(Conta conta) {
		System.out.println("Seja bem vindo ao G2Bank!");
		System.out.printf("\nCPF: %s", conta.getCpf());
		System.out.printf("\nSeu saldo atual � de R$ %.2f", conta.getSaldo());
	}

	private static void menuContaEspecial(ContaEspecial conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Especial N� " + conta.getNumeroConta());
			System.out.println("Digite a op��o de transa��o");
			System.out.println("1 - Movimenta��o ");
			System.out.println("2 - Saldo ");
			System.out.println("0 - Sair");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
				System.out.printf("Valor do Limite: R$ %.2f%n", conta.getValorLimite());
				System.out.printf("Limite Usado: R$ %.2f%n", (conta.getValorCadastroLimite() - conta.getValorLimite()));
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();
						if(opcao == 1) {
							System.out.println("Digite o valor a ser creditado");
							conta.devolverLimite(leia.nextDouble());
							System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
							System.out.printf("Valor do Limite: R$ %.2f%n", conta.getValorLimite());
							System.out.printf("Limite Usado: R$ %.2f%n",(conta.getValorCadastroLimite() - conta.getValorLimite()));
						}
						else if(opcao == 2) {
							System.out.println("Digite o valor a ser debitado");
							conta.debito(leia.nextDouble()); 
							System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
							System.out.printf("Valor do Limite: R$ %.2f%n", conta.getValorLimite());
							System.out.printf("Limite Usado: R$ %.2f%n",(conta.getValorCadastroLimite() - conta.getValorLimite()));	
						}
						else if (opcao == 0) {
							return;
						}
			}
			else if (opcao == 2) {
				System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
				System.out.printf("Valor do Limite: R$ %.2f%n", conta.getValorLimite());
			} 
			else if (opcao == 0) {
				System.out.println("Encerrando acesso a conta");
				return;
			}
		}
	}

	private static void menuContaCorrente(ContaCorrente conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Corrente N� " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Tal�o de cheque");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo());
			} else if (opcao == 3) {
				
				conta.talao(conta.getTalao() , conta.getTotalTalao());
			} else {
				return;
			}
		}
	}	

	private static void menuContaPoupanca(ContaPoupanca conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Poupan�a N� " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Anivers�rio");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				System.out.printf("\nSaldo Atual: R$ %.2f", conta.getSaldo());
			} else if (opcao == 3) {
				System.out.println("\nDigite a data de hoje");
				int data = leia.nextInt();
				conta.correcaoPoupanca(data);
				System.out.printf("\nSaldo atual: R$ %.2f", conta.getSaldo());
			} else {
				return;
			}
		}
	}

	private static void menuContaEmpresarial(ContaEmpresarial conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			System.out.println("Conta Empresa N� " + conta.getNumeroConta());
			System.out.println("\n1 - Movimento");
			System.out.println("2 - Saldo");
			System.out.println("3 - Empr�stimo");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("Digite a op��o:");
			int opcao = leia.nextInt();
			if (opcao == 1) {
				menuMovimento(conta);
			} else if (opcao == 2) {
				conta.mostrarSaldos();
			} else if (opcao == 3) {
				conta.perguntarEmprestimo();
			} else {
				return;
			}
		}
	}

	private static void menuMovimento(Conta conta) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\nMovimento");
			System.out.println("1 - Cr�dito");
			System.out.println("2 - D�bito");
			System.out.println("0 - Sair");
			int opcaoMovimento = leia.nextInt();
			if (opcaoMovimento == 1) {
				System.out.print("\nQuanto deseja creditar: ");
				double valorCredito = leia.nextDouble();
				conta.credito(valorCredito);
				System.out.printf("Saldo atual: R$ %.2f", conta.getSaldo());
			} else if (opcaoMovimento == 2) {
				System.out.print("\nQuanto deseja debitar: ");
				double valorDebito = leia.nextDouble();
				if (conta.testarSaldo(valorDebito)) {
					conta.debito(valorDebito);
				} else {
					System.out.println("Valor Solicitado � maior que o saldo e valor de emprestimo disponivel");
				}
				System.out.printf("Saldo atual: R$ %.2f", conta.getSaldo());
			} else {
				System.out.println("Saindo da movimenta��o...");
				break;
			}
		}
	}

}