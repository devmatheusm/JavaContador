import java.util.Scanner;

public class Contador {
    /**
     * @author Matheus Mendonça Morais
     * @since 15/07/2024
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Contador em Java!\n(O primeiro numero tem que ser menor que o segundo digitado!)");
        System.out.println("Digite o primeiro numero!");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite o segundo numero!");
        int segundoNumero = teclado.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex);
        }

        teclado.close();
    }
    /**
     * @param o segundo parametro sera subtraido pelo primeiro
     * @return o resultado ira resultar na quantidade de numeros do contador
     * @throws caso o segundo numero seja menor que o primeiro ira lançar o erro de "Parametro Invalido"
     */
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        int diferencaNumeros = segundoNumero - primeiroNumero;

        if(diferencaNumeros < 0){
            throw new ParametrosInvalidosException();
        }

        for(int indice = 1; indice <= diferencaNumeros; indice++){
            System.out.println("Imprimindo o número " + indice);
        } 
    }
}
