import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
    int N1 , N2 , N3 , N4 , Media;
// processamento
    System.out.println("digite a primeira Nota ?");
    N1 = console .nextInt();
    System.out.println("digite a segunda Nota ?");
     N2 = console .nextInt();
     System.out.println("digite a terceira Nota ?");
    N3 = console .nextInt();
     System.out.println("digite a quarta Nota ?");
    N4 = console .nextInt();
    Media = N1 + N2 + N3 + N4 /4;
  
// saida 
  System.out.println("\n a media das Notas e ! \t" + Media);
   
  }
}