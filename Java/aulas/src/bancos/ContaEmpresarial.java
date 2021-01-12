package bancos;

import java.util.Scanner;

public class ContaEmpresarial extends Conta {

	private double emprestimoEmpresa;

	public ContaEmpresarial(int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void realizarEmprestimo(double valor) {
		if (this.emprestimoEmpresa == 0) {
			System.out.println("Saldo de empr�stimo zerado!");
			return;
		}
		if (this.emprestimoEmpresa < valor) {
			System.out.println("Valor de empr�stimo maior que o saldo");
		} else {
			this.emprestimoEmpresa -= valor;
			super.credito(valor);
		}
	}

	@Override
	public boolean testarSaldo(double valor) {

		boolean teste;
		if (valor <= super.getSaldo()) {
			teste = true;
		} else if (valor <= (this.emprestimoEmpresa + super.getSaldo())) {
			teste = true;
		} else {
			teste = false;
		}

		return teste;
	}

	@Override
	public void debito(double valorDebito) {
		mostrarSaldos();
		perguntarEmprestimo();
		if (valorDebito <= super.getSaldo()) {
			super.debito(valorDebito);
			mostrarSaldos();
		} else {
			System.out.println("N�o foi poss�vel realizar o d�bito!");
		}
	}

	@Override
	public void credito(double valorCredito) {
		perguntarEmprestimo();
		super.credito(valorCredito);
		mostrarSaldos();
	}

	public void perguntarEmprestimo() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Deseja realizar o empr�stimo? [S/N]");
		char opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'S') {
			System.out.println("\nQuanto deseja retirar do Empr�stimo?");
			double valor = leia.nextDouble();
			if (testarSaldo(valor)) {
				super.credito(valor);
				this.emprestimoEmpresa -= valor;
			} else {
				System.out.println("Empr�stimo n�o pode ser realizado!");
			}
		}
	}

	public void mostrarSaldos() {
		System.out.printf("\nSaldo Atual: R$ %.2f", super.getSaldo());
		System.out.printf("\nSaldo Empr�stimo: R$ %.2f\n", this.getEmprestimoEmpresa());
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
}