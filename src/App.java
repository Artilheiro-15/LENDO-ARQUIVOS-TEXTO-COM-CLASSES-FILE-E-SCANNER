import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    File file = new File(
      "C:\\Users\\Guest\\Documents\\projetos\\curso java\\Seçao 17\\LENDO ARQUIVOS TEXTO COM CLASSES FILE E SCANNER\\in.txt"
    );

    Scanner sc = null;

    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
