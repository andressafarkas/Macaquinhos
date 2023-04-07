public class Macaquinho
{

    int cocosPares;
    int cocosImpares;

    private final int macaquinhoId;
    private Macaquinho macaquinhoPar;
    private int macaquinhoParId;
    private Macaquinho macaquinhoImpar;
    private int macaquinhoImparId;


    public Macaquinho(int cocosPares, int cocosImpares, int macaquinhoId, int macaquinhoParId, int macaquinhoImparId)
    {
        this.cocosPares = cocosPares;
        this.cocosImpares = cocosImpares;
        this.macaquinhoId = macaquinhoId;
        this.macaquinhoParId = macaquinhoParId;
        this.macaquinhoImparId = macaquinhoImparId;
    }

    public void receberCocoPar(int cocos)
    {
        cocosPares += cocos;
    }

    public void receberCocoImpar(int cocos)
    {
        cocosImpares += cocos;
    }

    public void jogarCocos()
    {
        macaquinhoPar.receberCocoPar(cocosPares);
        macaquinhoImpar.receberCocoImpar(cocosImpares);

        this.cocosPares = 0;
        this.cocosImpares = 0;
    }

    public int getNumCocos()
    {
        return cocosImpares+cocosPares;
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