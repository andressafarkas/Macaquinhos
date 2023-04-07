import java.io.IOException;

public class JogoMacaquinhos
{
    public static void main(String[] args) throws IOException
    {
        MacaquinhoManager macaquinhoManager = new MacaquinhoManager();
        macaquinhoManager.lerArquivo("files/1000macacos.txt");

        for (int i = 0; i < macaquinhoManager.getNumRodadas(); i++) 
        {
            macaquinhoManager.distribuirCocos();
        }

        Macaquinho vencedor = macaquinhoManager.getVencedor();
        System.out.printf("O macaquinho %s é o vencedor com %d cocos!!",
                vencedor.getMacaquinhoId(), vencedor.getNumCocos());

    }

}
