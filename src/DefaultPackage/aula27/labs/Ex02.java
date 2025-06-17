package DefaultPackage.aula27.labs;

public class Ex02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.saldo = -10;
        contaCorrente.statusEspecial = true;
        contaCorrente.limite = 100.00;

        System.out.println("Saldo da conta " + contaCorrente.numero + " = " + contaCorrente.saldo);

        boolean saqueEfetuado = contaCorrente.realizarSaque(10);
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           contaCorrente.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente"); 
        }
        
        saqueEfetuado = contaCorrente.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais"); 
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           contaCorrente.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente"); 
        }
        
        System.out.println("Depósito de 500 reais"); 
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();
        
        if (contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
        
        contaCorrente.realizarSaque(600);
        contaCorrente.consultarSaldo();
        if (contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
    }
}