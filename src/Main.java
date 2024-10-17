import entidades.Produto;
import servicos.CarrinhoDeCompras;
import strategies.DescontoClienteNovo;
import strategies.DescontoClienteRegular;
import strategies.DescontoClienteVIP;

/*
* Atividade feita pelos alunos:
* Gabriel Rosa
* Luiz Flavio
* Rayani Sayuri
* (*NÃO FOI COPIA*)*/

public class Main {
    public static class LojaOnline {
        public static void main(String[] args) {

            // criar alguns produtos
            Produto produto1 = new Produto("camiseta", 50.0);
            Produto produto2 = new Produto("Calga", 100.0);
            Produto produto3 = new Produto("Tenis", 200.0);

            // Criar o carrinho de compras
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.addProduto(produto1);
            carrinho.addProduto(produto2);
            carrinho.addProduto(produto3);

            // Aplicar desconto para cliente novo
            try {

                carrinho.desconto(new DescontoClienteNovo());
                System.out.println("Total para cliente Novo: R$" + carrinho.getTotalProdutos());

                // Aplicar desconto para cliente regular
                carrinho.desconto(new DescontoClienteRegular());
                System.out.println("Total para Cliente Regular: R$" + carrinho.getTotalProdutos());

                // Aplicar desconto para cliente VIP
                carrinho.desconto(new DescontoClienteVIP());
                System.out.println("Total para Cliente VIP: R$" + carrinho.getTotalProdutos());

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}