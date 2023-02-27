import javax.swing.plaf.synth.SynthOptionPaneUI;

import javafx.scene.effect.Light.Spot;

// interface Inner
interface Eatable
{
    void eat();
}
class testinterface
{
    public static void main(String[] args) 
    {
        Eatable e = new Eatable() 
        {
            public void eat()
            {
                System.out.println("nice");
            }    
        };
        e.eat();    
    }
}

// nice