package DefaultPackage.aula24.labs;

public class Ex05 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.saldo = 500.00;
        contaCorrente.statusEspecial = true;
        contaCorrente.limite = 1000.00;

        System.out.println("Saldo da conta " + contaCorrente.numero + " = " + contaCorrente.saldo);
    }
}