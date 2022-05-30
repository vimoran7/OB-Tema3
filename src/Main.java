

public class Main {

    public static void main(String[] args) {
        int param1 = 5;
        int param2 = 3;
        int param3 = 6;
        var valor = suma(param1, param2, param3);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es " + miCoche.numeroDePuertas);

    }

    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
        return resultado;
    }
}

class Coche {
    public int numeroDePuertas = 2;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}
