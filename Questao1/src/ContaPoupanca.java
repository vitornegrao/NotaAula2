public class ContaPoupanca extends ContaBancaria {
    private double selic;

    public ContaPoupanca(String titular, double selic) {
        super(titular);
        this.selic = selic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado: R$" + rendimento);
    }

    @Override
    public void exibirDadosConta() {
        super.exibirDadosConta();
        System.out.println("Taxa Selic: " + selic + "%");
    }
}
