import java.io.FileNotFoundException;


public class JogoMacaquinhos
{

    public static void main(String[] args) throws FileNotFoundException
    {
        MacaquinhoManager macaquinhoManager = new MacaquinhoManager();
        macaquinhoManager.lerArquivo("0050macacos.txt");

        for (int i = 0; i < macaquinhoManager.getNumRodadas(); i++) 
        {
            macaquinhoManager.distribuirCocos();
        }

        Macaquinho vencedor = macaquinhoManager.getVencedor();
        System.out.println(String.format("O macaquinho %s é o vencedor com %d pedrinhas!!"
                , vencedor.getMacaquinhoId(), vencedor.getNumPedrinhas()));

    }

}
