public class Main{
 
 public static int[][] gerarMatriz(int a[], int b[]){
 int matriz[][] = new int[2][];
  matriz[0] = a;
  matriz[1] = b;
  return matriz;

 }
 
 public static void main(String args[]){
 int a[] = {1, 2, 3};
 int b[] = {4, 5, 6};
 int matriz[][] = gerarMatriz(a, b);
 for(int linha[] : matriz){
   for(int coluna : linha){
     System.out.println(coluna+" ");
   }
   System.out.println("");
 }
 }
 
}
