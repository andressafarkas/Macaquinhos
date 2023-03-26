import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JogoMacaquinhos
{

    public static void main(String[] args) throws FileNotFoundException
    {
        MacaquinhoManager macaquinhoManager = new MacaquinhoManager();
        macaquinhoManager.lerArquivo("input.txt");
    }

}
