import fatec.poo.model.Comodo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author felipe rabelo
 */
public class Aplic 
{
    public static void main(String[] args) 
    {
        Comodo[] comodo = new Comodo[5];
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        int i, tipo, potLampada;
        double medLarg, medComp, medAlt;
        
        for (i = 0; i < comodo.length; i++) 
        {
            
            System.out.println("\n1 - Sala");
            System.out.println("2 - Quarto");
            System.out.println("3 - Cozinha");
            System.out.println("4 - Banheiro");
            System.out.println("\tInforme o tipo de Comodo:");
            tipo = entrada.nextInt();
            
            System.out.print("\nInforme a Medida da largura do cômodo: ");
            medLarg = entrada.nextDouble();
            
            System.out.print("\nInforme a Medida do comprimento do cômodo: ");
            medComp = entrada.nextDouble();
            
            System.out.print("\nInforme a Medida da altura do cômodo: ");
            medAlt = entrada.nextDouble();
            
            System.out.print("\nInforme a Potência da lâmpada em watts (Ex.: 60, 80, 100): ");
            potLampada = entrada.nextInt();            
            
            comodo[i] = new Comodo(tipo, potLampada);
            
            comodo[i].setMedLarg(medLarg);
            comodo[i].setMedComp(medComp);
            comodo[i].setMedAlt(medAlt);
        }
        
        System.out.println("\n\n\n");
        
        System.out.println("Tipo Comodo\tPotência\tNum Aprox Lampadas");
        for (i = 0; i < comodo.length; i++) 
        {            
            System.out.print(comodo[i].getTipo() + "\t\t");
            System.out.print(comodo[i].getPotLampada() +"\t\t");
            System.out.println(df.format(comodo[i].calcQtdeLampada()));
        }
    }    
}
