import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacaquinhoManager
{
    private List<Macaquinho> macaquinhos;

    private int numRodadas;

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


    public void lerArquivo(String caminhoArquivoComExtensao) throws FileNotFoundException
    {
        // Lê o arquivo de entrada
        File file = new File(caminhoArquivoComExtensao);
        Scanner scanner = new Scanner(file);

        List<String> inputText = new ArrayList<>(10);


        String linhaNumRodadas;
        linhaNumRodadas = scanner.nextLine();
        Pattern patternRodadas = Pattern.compile("\\d+");
        Matcher matcherRodadas = patternRodadas.matcher(linhaNumRodadas);
        numRodadas = Integer.parseInt(matcherRodadas.find() ? matcherRodadas.group() : "0");
        System.out.println("Rodadas: " + numRodadas);


        while (scanner.hasNext())
        {
            inputText.add(scanner.nextLine());
        }

        List<Coco> cocos = new ArrayList<>(20);
        for (String linha : inputText)
        {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(linha);

            int idMacaco = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int idMacaquinhoPar = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int idMacaquinhoImpar = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int numCocos = Integer.parseInt(matcher.find() ? matcher.group() : "0");

            for (int i = 0; i < numCocos; i++) {
                cocos.add(new Coco(Integer.parseInt(matcher.find() ? matcher.group() : "0")));
            }

            System.out.println("Macaquinho " + idMacaco + " distribui " + numCocos + " cocos entre macaquinho " + idMacaquinhoPar + " e macaquinho " + idMacaquinhoImpar);
            macaquinhos.add(new Macaquinho(cocos, idMacaco, getMacaquinhoById(idMacaquinhoPar), getMacaquinhoById(idMacaquinhoImpar)));
        }

    }
        public Macaquinho getVencedor()
        {
            int maxPedrinhas = macaquinhos.get(0).getNumPedrinhas();
            for (Macaquinho macaquinho: macaquinhos)
            {
                if (macaquinho.getNumPedrinhas() > maxPedrinhas)
                {
                    maxPedrinhas = macaquinho.getNumPedrinhas();
                }
            }

            for (Macaquinho macaquinho: macaquinhos)
            {
                if (macaquinho.getNumPedrinhas() == maxPedrinhas) return macaquinho;
            }

            return macaquinhos.get(0);
        }

    public int getNumRodadas()
    {
        return numRodadas;
    }

    public List<Macaquinho> getMacaquinhos()
    {
        return macaquinhos;
    }
}
