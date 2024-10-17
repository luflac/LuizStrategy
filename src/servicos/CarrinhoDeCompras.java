package servicos;

import entidades.Produto;
import strategies.DescontoStrategy;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> lista
            = new ArrayList<>();
    private DescontoStrategy descontoAplicado;

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }

    public void desconto(DescontoStrategy desconto){
        this.descontoAplicado= desconto;
    }

    public Double getTotalProdutos() throws Exception {
        final Double[] total = {0.0};

        this.lista
                .stream()
                .forEach(x -> total[0] += x.getPreco());

        return this.descontoAplicado.calcularDesconto(total[0]);
    }
}
