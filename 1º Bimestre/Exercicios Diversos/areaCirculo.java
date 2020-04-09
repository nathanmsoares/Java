public class areaCirculo{
	public static void main(String args []) {
	double diametro = 145.987;
	double d1 = diametro / 2;
	double d2 = 2;
	double raioResultado = Math.pow(d1, d2);
	//double raioResultado = (diametro / 2) * (diametro / 2);
	double resultado = raioResultado * 3.14159265359;
	System.out.println("Valor area " + resultado);
	}
}