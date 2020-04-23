public class Main{
 
 public static double desvioPadrao(double... vetor){
 double desvio = 0;
 double media = 0;
 
 for(double d : vetor){
 media += d;
 }
 media /= vetor.length;
 
 double variancia = 0;
 for(double d : vetor){
 variancia = variancia + Math.pow(d - media,2);
 }
 variancia /= vetor.length;
 
 desvio = Math.sqrt(variancia);
 return desvio;
 }
 
 public static void main(String args[]){
 double desvio = desvioPadrao(1.55, 1.70, 1.80);
 System.out.println("Desvio padrao = "+desvio);
 }
 
}
