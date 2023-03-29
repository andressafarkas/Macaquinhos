import java.util.ArrayList;
import java.util.List;

public class Macaquinho
{

    private final List<Coco> cocos;
    private final int macaquinhoId;
    private Macaquinho macaquinhoPar;
    private int macaquinhoParId;
    private Macaquinho macaquinhoImpar;
    private int macaquinhoImparId;


    public Macaquinho(List<Coco> cocos, int macaquinhoId, int macaquinhoParId, int macaquinhoImparId)
    {
        this.cocos = cocos;
        this.macaquinhoId = macaquinhoId;
        this.macaquinhoParId = macaquinhoParId;
        this.macaquinhoImparId = macaquinhoImparId;
    }

    public void receberCoco(Coco coco)
    {
        this.cocos.add(coco);
    }

    public void jogarCocos()
    {
        int size = getNumCocos();
        for (int i = 0; i < size; i++) {
            Coco coco = cocos.get(i);
            if (coco.getPedrinhas() % 2 == 0) {
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

    public int getNumPedrinhas()
    {
        int pedrinhas = 0;
        for (Coco coco: cocos)
        {
            pedrinhas += coco.getPedrinhas();
        }
        return pedrinhas;
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

    public List<Coco> getCocos() {
        return cocos;
    }

    public Macaquinho getMacaquinhoPar() {
        return macaquinhoPar;
    }

    public int getMacaquinhoParId() {
        return macaquinhoParId;
    }

    public Macaquinho getMacaquinhoImpar() {
        return macaquinhoImpar;
    }

    public int getMacaquinhoImparId() {
        return macaquinhoImparId;
    }
}