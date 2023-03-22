public class Coco {

    private int pedrinhas;

    public Coco(int pedrinhas) {
        this.pedrinhas = pedrinhas;
    }
    
    public boolean Par(int pedrinhas){
        if (pedrinhas % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
