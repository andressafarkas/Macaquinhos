import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacaquinhoManager
{
    private final List<Macaquinho> macaquinhos;

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

     public void distribuirCocos()
    {
        int size = macaquinhos.size();
        for (int i = 0; i < size; i++) {
            Macaquinho macaquinho = macaquinhos.get(i);
            macaquinho.jogarCocos();
        }
    }

    public void lerArquivo(String caminhoArquivoComExtensao) throws FileNotFoundException
    {
        File file = new File(caminhoArquivoComExtensao);
        Scanner scanner = new Scanner(file);
        List<String> inputText = new ArrayList<>();

        String linhaNumRodadas = scanner.nextLine();
        Pattern patternRodadas = Pattern.compile("\\d+");
        Matcher matcherRodadas = patternRodadas.matcher(linhaNumRodadas);
        numRodadas = Integer.parseInt(matcherRodadas.find() ? matcherRodadas.group() : "0");
        System.out.println("Rodadas: " + numRodadas);

        while (scanner.hasNext())
        {
            inputText.add(scanner.nextLine());
        }

        for (String linha : inputText)
        {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(linha);

            int idMacaco = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int idMacaquinhoPar = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int idMacaquinhoImpar = Integer.parseInt(matcher.find() ? matcher.group() : "0");
            int numCocos = Integer.parseInt(matcher.find() ? matcher.group() : "0");

            int cocosPares = 0;
            int cocosImpares = 0;

            for (int i = 0; i < numCocos; i++)
            {
                int numPedrinhas = Integer.parseInt(matcher.find() ? matcher.group() : "0");

                if (numPedrinhas % 2 == 0)
                    cocosPares++;
                else
                    cocosImpares++;
            }

            System.out.println("Macaquinho " + idMacaco + " distribui " + numCocos + " cocos entre macaquinho " + idMacaquinhoPar + " e macaquinho " + idMacaquinhoImpar);
            macaquinhos.add(new Macaquinho(cocosPares, cocosImpares, idMacaco, idMacaquinhoPar, idMacaquinhoImpar));

        }
        for (Macaquinho macaquinho: macaquinhos)
        {
            macaquinho.setMacaquinhoPar(getMacaquinhoById(macaquinho.getMacaquinhoParId()));
            macaquinho.setMacaquinhoImpar(getMacaquinhoById(macaquinho.getMacaquinhoImparId()));
        }

        System.out.println("Arquivo lido com sucesso!");
    }
        public Macaquinho getVencedor()
        {
            return Collections.max(macaquinhos, Comparator.comparing(Macaquinho::getNumCocos));
        }

    public int getNumRodadas()
    {
        return numRodadas;
    }
}
