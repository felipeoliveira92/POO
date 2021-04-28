package fatec.poo.model;
/**
 *
 * @author felipe rabelo
 */
public class Vendedor extends Pessoa
{
    private double taxaComissao;
    private double totalVendas;

    public Vendedor(double taxaComissao, int codigo, String nome)
    {
        super(codigo, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao()
    {
        return taxaComissao;
    }

    public double getTotalVendas()
    {
        return totalVendas;
    }
    
    public void addVenda(double valorVenda)
    {
        totalVendas += valorVenda;
    }
    
    public double calcValorComissao()
    {
        return ((getTaxaComissao() * getTotalVendas())/100);
    }
    
}
