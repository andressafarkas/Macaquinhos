import java.io.FileNotFoundException;


public class JogoMacaquinhos
{

    public static void main(String[] args) throws FileNotFoundException
    {
        MacaquinhoManager macaquinhoManager = new MacaquinhoManager();
        macaquinhoManager.lerArquivo("input.txt");

        for (int i = 0; i < macaquinhoManager.getNumRodadas(); i++) 
        {
            macaquinhoManager.jogarCocos();
        }

        System.out.println(macaquinhoManager.getVencedor().getMacaquinhoId());

    }

}
