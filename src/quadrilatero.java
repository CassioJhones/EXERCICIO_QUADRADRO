public class quadrilatero { //--CLASEE PUBLICA QUADRILATERO

    public static void area(double lado) {
         //--METODO QUE CALCULA AREA DO QUADRADO
        System.out.println("-Area do Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        //--METODO QUE CALCULA AREA DO QUADRADO
        System.out.println("-Area do Retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        //--METODO QUE CALCULA AREA DO QUADRADO
        System.out.println("-Area do Trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        //--METODO QUE CALCULA AREA DO QUADRADO
        System.out.println("-Area do Losango: " + ( diagonal1 * diagonal2) / 2 );
    }
    
}
