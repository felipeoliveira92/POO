package fatec.poo.model;
/**
 *
 * @author felipe rabelo
 */
public class Cliente extends Pessoa 
{
    private double limiteCredito;
    private double totalCompras;

    public Cliente(int codigo, String nome, double limiteCredito) 
    {
        super(codigo, nome);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() 
    {
        return limiteCredito;
    }

    public double getTotalCompras() 
    {
        return totalCompras;
    }
    
    public void addCompra(double valorCompra)
    {
        totalCompras += valorCompra;
    }
    
    public double calcLimiteDisponivel()
    {
        return getLimiteCredito() - getTotalCompras();
    }    
}