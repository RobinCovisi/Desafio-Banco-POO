public abstract class Conta implements IConta {
   private static int proximoNumeroConta = 1;

   protected int agencia;
   protected int numero;
   protected double saldo;

   public Conta(int agencia) {
       this.agencia = agencia;
       this.numero = proximoNumeroConta++;
       this.saldo = 0.0;
   }

   public int getAgencia() {
       return agencia;
   }

   public int getNumero() {
       return numero;
   }

   public double getSaldo() {
       return saldo;
   }

   @Override
   public void sacar(double valor) {
       if (saldo >= valor) {
           saldo -= valor;
           System.out.println("Saque de " + valor + " realizado com sucesso.");
       } else {
           System.out.println("Saldo insuficiente para realizar o saque.");
       }
   }

   @Override
   public void transferir(double valor, IConta contaDestino) {
       if (saldo >= valor) {
           this.sacar(valor);
           contaDestino.depositar(valor);
           System.out.println("Transferência de " + valor + " realizada com sucesso.");
       } else {
           System.out.println("Saldo insuficiente para realizar a transferência.");
       }
   }

   @Override
   public void depositar(double valor) {
       saldo += valor;
       System.out.println("Depósito de " + valor + " realizado com sucesso.");
   }
}