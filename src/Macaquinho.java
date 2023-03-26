import java.util.ArrayList;
import java.util.List;

public class Macaquinho
{

    private List<Coco> cocos;
    private final int macaquinhoId;
    private Macaquinho macaquinhoPar;
    private Macaquinho macaquinhoImpar;

    public Macaquinho(List<Coco> cocos, int macaquinhoId, Macaquinho macacoPar, Macaquinho macacoImpar)
    {
        this.cocos = new ArrayList<>(20);
        this.macaquinhoId = macaquinhoId;
        this.macaquinhoPar = macacoPar;
        this.macaquinhoImpar = macacoImpar;
    }

    public void receberCoco(Coco coco)
    {
        this.cocos.add(coco);
    }

    public void jogarCocos()
    {
        for (Coco coco : cocos)
        {
            if (coco.getPedrinhas() % 2 == 0)
            {
                macaquinhoPar.receberCoco(coco);
            } else
            {
                macaquinhoImpar.receberCoco(coco);
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

    public void setMacaquinhoPar(Macaquinho macaquinhoPar)
    {
        this.macaquinhoPar = macaquinhoPar;
    }

    public void setMacaquinhoImpar(Macaquinho macaquinhoImpar)
    {
        this.macaquinhoImpar = macaquinhoImpar;
    }



}