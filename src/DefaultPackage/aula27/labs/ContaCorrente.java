package DefaultPackage.aula27.labs;

public class ContaCorrente {
    String numero;
    String agencia;
    double saldo;
    boolean statusEspecial;
    double limite;
    double valorEspecialUsado;

    boolean realizarSaque(double quantiaASacar){
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {
            if (statusEspecial) {
                double limiteEspecial = limite + saldo;
                if (limiteEspecial >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false; 
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }

}