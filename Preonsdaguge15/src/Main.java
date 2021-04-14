import java.util.ArrayList;

public class Main {
  private ArrayList<Elev> elever;

  Main() {
    elever = new ArrayList<Elev>();
  }

  void elevListe() {
    System.out.println("\nElevers karakter liste:");
    for (int i = 0; i < elever.size(); i++) System.out.println("#" + i + ": " + elever.get(i));
  }


  public static void main(String[] args) {

  }
}
