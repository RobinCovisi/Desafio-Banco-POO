public class CoCo {

    protected int Agencia;
    protected int Numero;
    protected double Saldo;

    public void sacar(double valor) {
        if (valor > 0 && Saldo >= valor) {
            Saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void transferir(double valor, ContaCorrente destino) {
        if (valor > 0 && Saldo >= valor) {
            Saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public int getAgencia() {
        return Agencia;
    }

    public int getNumero() {
        return Numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.Agencia = 1234; // Definindo a agência
        conta.Numero = 56789; // Definindo o número da conta
        conta.depositar(1000); // Depositando 1000 na conta
        System.out.println("Extrato Bancário:");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
// guardando um modo de fazer