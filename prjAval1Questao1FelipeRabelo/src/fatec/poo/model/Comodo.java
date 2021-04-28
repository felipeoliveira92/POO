package fatec.poo.model;
/**
 *
 * @author felipe rabelo
 */
public class Comodo 
{
    private int tipo;
    private double medLarg;
    private double medComp;
    private double medAlt;
    private int potLampada;
    
    public Comodo(int tipo, int potLampada)
    {
        this.tipo = tipo;
        this.potLampada = potLampada;
    }
    
    public void setMedLarg(double medLarg)
    {
        this.medLarg = medLarg;
    }
    
    public void setMedComp(double medComp)
    {
        this.medComp = medComp;
    }
    
    public void setMedAlt(double medAlt)
    {
        this.medAlt = medAlt;
    }
    
    public int getTipo()
    {
        return tipo;
    }
    
    public int getPotLampada()
    {
        return potLampada;
    }
    
    public double calcQtdeLampada()
    {
        double medida = medLarg * medComp * medAlt;
        double qtdLamp = 0;
        
        if(getTipo() == 1)
        {
            qtdLamp = (medida * 20)/potLampada;
        }
        else if(getTipo() == 2)
        {
            qtdLamp = (medida * 25)/potLampada;
        }
        else if(getTipo() == 3)
        {
            qtdLamp = (medida * 18)/potLampada;
        }
        else if(getTipo() == 4)
        {
            qtdLamp = (medida * 15)/potLampada;
        }
        return qtdLamp;
    }
}
