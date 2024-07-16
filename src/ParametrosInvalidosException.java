/**
 * @exception Essa exceção ira informar quando o usuario informar os parametros fora das instruções dadas.
 */
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("O segundo número deve ser maior que o primeiro.");
    }
}
