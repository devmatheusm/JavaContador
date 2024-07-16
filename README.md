````
# Contador em Java

## Descrição
Este projeto é uma aplicação simples de um contador em Java, desenvolvida como parte de um desafio proposto pela [Digital Innovation One](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo). O programa solicita ao usuário dois números inteiros, onde o primeiro deve ser menor que o segundo, e então imprime uma contagem do primeiro número até o segundo.

## Funcionalidades
- Solicita dois números inteiros ao usuário.
- Valida se o primeiro número é menor que o segundo.
- Imprime uma contagem do primeiro número até o segundo.
- Lança uma exceção personalizada caso a validação falhe.

## Exceções
A classe `ParametrosInvalidosException` é usada para lançar uma exceção caso o segundo número digitado seja menor que o primeiro. Esta é uma exceção personalizada que estende `Exception`.

## Como usar
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
````

2. Navegue até o diretório do projeto:

   ```sh
   cd seu-repositorio
   ```

3. Compile o programa:

   ```sh
   javac Contador.java
   ```

4. Execute o programa:

   ```sh
   java Contador
   ```

5. Siga as instruções exibidas no console para digitar os números.

## Código

```java
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
            System.out.println("Paramentros invalidos, por favor digite os numeros corretamente.\nErro: " + ex);
        }

        teclado.close();
    }
    /**
     * @param o segundo parametro sera subtraido pelo primeiro
     * @return o resultado ira resultar na quantidade de numeros do contador
     * @throws caso o segundo numero seja menor que o primeiro ira lançar o erro de "Parametro Invalido"
     */
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        int diferencaNumeros = segundoNumero - primeiroNumero;

        if (diferencaNumeros < 0) {
            throw new ParametrosInvalidosException();
        }

        for (int indice = 1; indice <= diferencaNumeros; indice++) {
            System.out.println("Imprimindo o número " + indice);
        }
    }
}
```

## Exceção Personalizada

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo número deve ser maior que o primeiro.");
    }
}
```

## Notas

- Certifique-se de ter o JDK instalado para compilar e executar o programa.
- Este projeto foi desenvolvido como parte de um desafio educacional e pode ser usado como base para projetos futuros.

## Autor

Matheus Mendonça Morais

## Licença

Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

```

Este `README.md` fornece uma visão geral do projeto, instruções sobre como usá-lo, e inclui o código-fonte para fácil referência. Certifique-se de ajustar os detalhes do repositório, como o URL do clone, conforme necessário.
```
