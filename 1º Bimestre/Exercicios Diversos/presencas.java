public class presencas{
	public static void main(String args []){
	int semanas = 40;
	int aulasPorSemana = 4;
	float faltasPermitidas = 0.25f;
	float resultado = (semanas * aulasPorSemana) * faltasPermitidas;
	System.out.println("A quantidade de falta permitidas eh de " + resultado);
	}
}