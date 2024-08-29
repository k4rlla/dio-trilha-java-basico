public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.err.println("A nossa condição é verdadeira");
            // se a condição fosse(numero1 == numero2) não imprimiria pois seria falsa!
        }

        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente ao numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior do que o numeroDois? " + simNao);

    }
}
