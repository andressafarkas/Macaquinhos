import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utils
{
    public static List<Coco> clone(Collection<Coco> collectionToBeCloned)
    {
        List<Coco> clone = new ArrayList<>(collectionToBeCloned.size());

        for (Coco coco : collectionToBeCloned)
        {
            clone.add(coco);
        }

        return clone;
    }
}
