import java.util.ArrayList;
import java.util.List;

public class Macaquinho
{

    private int numCocos;

    private List<Boolean> cocos;

    private final int macaquinhoId;
    private Macaquinho macaquinhoPar;
    private int macaquinhoParId;
    private Macaquinho macaquinhoImpar;
    private int macaquinhoImparId;


    public Macaquinho(List<Boolean> cocos, int macaquinhoId, int macaquinhoParId, int macaquinhoImparId)
    {
        this.cocos = cocos;
        this.macaquinhoId = macaquinhoId;
        this.macaquinhoParId = macaquinhoParId;
        this.macaquinhoImparId = macaquinhoImparId;
    }

    public void receberCoco(Boolean coco)
    {
        cocos.add(coco);
    }

    public void jogarCocos()
    {
        int size = cocos.size();
        Boolean choice;
        for (int i = 0; i < size; i++)
        {
            choice = cocos.get(i);

            if (choice) {
                macaquinhoPar.receberCoco(choice);
            } else
            {
                macaquinhoImpar.receberCoco(choice);
            }
        }
        cocos.clear();
    }

    public int getNumCocos()
    {
        return cocos.size();
    }

    public int getMacaquinhoId()
    {
        return macaquinhoId;
    }

    public void setMacaquinhoPar(Macaquinho macaquinhoPar) {
        this.macaquinhoPar = macaquinhoPar;
    }

    public void setMacaquinhoImpar(Macaquinho macaquinhoImpar) {
        this.macaquinhoImpar = macaquinhoImpar;
    }


    public int getMacaquinhoParId() {
        return macaquinhoParId;
    }


    public int getMacaquinhoImparId() {
        return macaquinhoImparId;
    }
}