import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int NumeroVentas;
    int i=0,a=0,b=0,c=0;
    float ValorVenta,valor_a=0,valor_b=0,valor_c=0;

    System.out.println("Ingrese el numero de ventas del dia:  ");
    NumeroVentas=s.nextInt();

      while(i!=NumeroVentas){
			i=i+1;
			System.out.println("Ingrese el valor de la venta "+i+" ");
			ValorVenta=s.nextFloat();
				if(ValorVenta > 1000){
					a++;
					valor_a=valor_a+ValorVenta;
				}else if(ValorVenta > 500){
					b++;
					valor_b=valor_b+ValorVenta;
				}else{
					c++;
					valor_c=valor_c+ValorVenta;
				}
		}    
    ValorVenta = valor_a+valor_b+valor_c;
    System.out.println("El numero de ventas del dia fue: "+NumeroVentas+"\n\n");
    System.out.println("Numero de ventas mayores a $1000: "+a+"\n");
    System.out.println("Con un monto acumulado de: "+valor_a+"$\n\n");
    System.out.println("Numero de ventas menores a $1000, pero mayores a $500: "+b+"\n");
    System.out.println("Con un monto acumulado de: "+valor_b+"$\n\n");
    System.out.println("Numero de menores o iguales a $500: "+c+"\n");
    System.out.println("Con un monto acumulado de: "+valor_c+"$\n\n");
    System.out.println("Monto total acumulado del dia: "+ValorVenta+"$");

  }
}