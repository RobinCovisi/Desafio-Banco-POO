public class CriaçaoConta {
    public static void main(String[] args) {
       
        ContaCorrente contaCorrente = new ContaCorrente(123);
        ContaPoupança contaPoupança = new ContaPoupança(456);

        contaCorrente.depositar(1000.0);
        contaCorrente.transferir(500.0, contaPoupança);

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupança.getSaldo());
    }
}


