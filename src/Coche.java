public class Coche {

    private int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void incrementoPuertas(int n){
        n++;
        System.out.println(n);
    }


}
