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
   git clone https://github.com/devmatheusm/JavaContador.git
   ```

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

## Notas

- Certifique-se de ter o JDK instalado para compilar e executar o programa.
- Este projeto foi desenvolvido como parte de um desafio educacional e pode ser usado como base para projetos futuros.

## Autor

Matheus Mendonça Morais

## Licença

Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
