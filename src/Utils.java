import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utils
{
    public static List<Coco> clone(Collection<Coco> collectionToBeCloned) {
        List<Coco> clone = new ArrayList<>(collectionToBeCloned.size());
        clone.addAll(collectionToBeCloned);
        return clone;
    }    
}
