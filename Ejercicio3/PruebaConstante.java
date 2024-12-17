public class PruebaConstante{
	
	public static void main(String[] args){
		int a = 5;
		System.out.println("El valor de a es " + a); //5
		int b =1;
		System.out.println("El valor de b es " + b); //1
		a=a+b;
		System.out.println("El valor de a es " + a); //6
		b=b+a;
		System.out.println("El valor de b es " + b); //6
		
		final double IVA =0.16;
		System.out.println("El valor de IVA es " + IVA); //6
		double resultado = a * IVA;
		
		System.out.println("El valor de resultado es " + resultado); //6
	}
}