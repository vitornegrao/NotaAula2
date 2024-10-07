public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (valor > 0 && valor <= chequeEspecial) {
            saldo -= valor;
            chequeEspecial -= valor;
            System.out.println("Uso do cheque especial de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido ou limite de cheque especial excedido.");
        }
    }

    @Override
    public void exibirDadosConta() {
        super.exibirDadosConta();
        System.out.println("Cheque Especial disponível: R$" + chequeEspecial);
    }
}
