public class Main {
    public static void main(String[] args) {
        sumaNumeros(3,4,5);
        Coche miCoche = new Coche();
        miCoche.setNumeroPuertas(1);
        miCoche.incrementoPuertas(miCoche.getNumeroPuertas());
    }
    public static void sumaNumeros(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }

}

