import java.util.Scanner;
 
public class Main{
 
 public static void main(String args[]){
 Scanner leitor = new Scanner(System.in);
 
 String palavra = "abacaxi";
 String palavraSecreta = "*******";
 int tentativas = 3;
 String letra = "";
 
 while(tentativas > 0){
  System.out.println("Palavra secreta: " +palavraSecreta);
  System.out.println("Tentativas restantes: "+tentativas);
  
  do{
    System.out.println("Digite uma letra: ");
    letra = leitor.nextLine();
    letra = letra.replace(letra, letra.toLowerCase());
    }while(letra.length() != 1);
  
  if(palavra.contains(letra)){
   if(letra.equals("a")){
     palavraSecreta = palavraSecreta.replace(palavraSecreta, letra + palavraSecreta.substring(1,2) + letra + palavraSecreta.substring(3, 4) + letra + palavraSecreta.substring(5));
   }
   if(letra.equals("b")){
     palavraSecreta = palavraSecreta.replace(palavraSecreta, palavraSecreta.substring(0,1) + letra + palavraSecreta.substring(2));
   }
   if(letra.equals("c")){
     palavraSecreta = palavraSecreta.replace(palavraSecreta, palavraSecreta.substring(0,3) + letra + palavraSecreta.substring(4));
   }
   if(letra.equals("x")){
     palavraSecreta = palavraSecreta.replace(palavraSecreta, palavraSecreta.substring(0,5) + letra + palavraSecreta.substring(6));
   }
   if(letra.equals("i")){
     palavraSecreta = palavraSecreta.replace(palavraSecreta, palavraSecreta.substring(0, 6) + letra);
   }
   if(palavraSecreta.equals(palavra)){
     break;
   }
  
  }else{
    System.out.println("Voce errroooouu =D ");
    //errou
    tentativas--;}
 }
 
  System.out.println("FIM DE JOGO"); 
 }
}