import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira sua senha:");
    int senha = 2022;
    int inserida = sc.nextInt();
  
    while (inserida != senha){
      System.out.println("Senha Incorreta.");
      inserida = sc.nextInt();
    }
    if (inserida == senha){
      System.out.println("Acesso Permetido");
    }


    sc.close();
  }

}