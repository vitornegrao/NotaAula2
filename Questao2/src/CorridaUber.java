import java.util.Scanner;

public class CorridaUber {
    // Atributos
    private double distancia; // em quilômetros
    private int tempoEspera; // em minutos
    private double tarifaBase; // valor cobrado pela corrida
    private double fatorDemanda; // fator de demanda para horários de pico

    // Construtor
    public CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    // Método para calcular o valor da corrida
    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    // Método para exibir os detalhes da corrida
    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Detalhes da Corrida:");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Tempo de espera: " + tempoEspera + " minutos");
        System.out.println("Tarifa base: R$ " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.printf("Valor final da corrida: R$ %.2f%n", valorFinal);
    }

    // Método main para executar o sistema
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite a tarifa base (em R$): ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

        // Criar uma nova corrida
        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);

        // Exibir os detalhes da corrida
        corrida.exibirDetalhesCorrida();

        // Fechar o scanner
        scanner.close();
    }
}
