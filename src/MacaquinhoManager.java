import java.util.ArrayList;
import java.util.List;

public class MacaquinhoManager
{
    List<Macaquinho> macaquinhos;

    public MacaquinhoManager()
    {
        macaquinhos = new ArrayList<>(10);
    }

    public Macaquinho getMacaquinhoById(int macaquinhoId)
    {
        for (Macaquinho macaquinho : macaquinhos)
        {
            if (macaquinho.getMacaquinhoId() == macaquinhoId)
            {
                return macaquinho;
            }
        }
        return null;
    }

    public void jogarCocos()
    {
        for (Macaquinho macaquinho : macaquinhos)
        {
            macaquinho.jogarCocos();
        }
    }

    public void adicionarMacaquinho(Macaquinho macaquinho)
    {
        macaquinhos.add(macaquinho);
    }

}
