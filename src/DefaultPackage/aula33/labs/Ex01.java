package DefaultPackage.aula33.labs;

public class Ex01 {
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
    }
}