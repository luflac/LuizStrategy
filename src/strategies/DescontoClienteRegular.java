package strategies;

public class DescontoClienteRegular implements DescontoStrategy{
    @Override
    public double calcularDesconto(double preco) {
        return preco - (preco * 0.1);
    }
}
