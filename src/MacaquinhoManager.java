import java.util.List;

public class MacaquinhoManager
{
    List<Macaquinho> macaquinhos;

    public MacaquinhoManager(List<Macaquinho> macaquinhos)
    {
        this.macaquinhos = macaquinhos;
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
}
