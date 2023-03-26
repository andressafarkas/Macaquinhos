public class Coco {

    private final int numPedrinhas;

    public Coco(int pedrinhas) {
        this.numPedrinhas = pedrinhas;
    }
    
    public boolean Par(int pedrinhas)
    {
        return pedrinhas % 2 == 0;
    }

    public int getPedrinhas()
    {
        return this.numPedrinhas;
    }
}
