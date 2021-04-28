import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;

/**
 *
 * @author felipe rabelo
 */
public class Aplic 
{
    public static void main(String[] args) 
    {
        Vendedor vendedor = new Vendedor(5, 100, "Carlos Silva");        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        vendedor.addVenda(300);
        vendedor.addVenda(500);
        vendedor.addVenda(600);
        vendedor.addVenda(700);
        
        System.out.print("Código\tNome\t\tTaxa de Comissão\tVendas Realizadas\tValor da Comissão\n");
        System.out.print(vendedor.getCodigo() + "\t");
        System.out.print(vendedor.getNome() + "\t");
        System.out.print(vendedor.getTaxaComissao() + "%\t\t\t");
        System.out.print(df.format(vendedor.getTotalVendas()) + "\t\t");
        System.out.print(df.format(vendedor.calcValorComissao()) + "\t");
        
        System.out.println("\n\n");
        
        Cliente[] cliente = new Cliente[3];
        
        cliente[0] = new Cliente(111, "Amelia Souza", 1000);
        cliente[1] = new Cliente(222, "Antonio Vieira", 2000);
        cliente[2] = new Cliente(333, "FabioSilva ", 3000);

        cliente[0].addCompra(300);
        cliente[1].addCompra(500);
        cliente[2].addCompra(700);
        
        int i =0;
        System.out.println("Código\tNome\t\tLimite Credito\tCompras Realizadas\tLimite Disponivel");
        while (i < cliente.length)
        {
            System.out.print(cliente[i].getCodigo() + "\t");
            System.out.print(cliente[i].getNome() + "\t");
            System.out.print(cliente[i].calcLimiteDisponivel() + "\t\t");
            System.out.print(df.format(cliente[i].getTotalCompras()) + "\t\t\t");            
            System.out.print(df.format(cliente[i].calcLimiteDisponivel()) + "\n");
            i++;
        }
        
    }    
}
