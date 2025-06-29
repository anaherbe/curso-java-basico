package DefaultPackage.aula46.labs;

public class Cubo extends Figura3D {
    
    private int lado;

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado*lado);
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
        //return Math.pow(lado, 3);
    }
}