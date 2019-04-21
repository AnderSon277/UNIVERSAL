#include<iostream>
using namespace std;
int main(){
	
	int NumeroVentas;
	int i=0,a=0,b=0,c=0;
	float ValorVenta,valor_a=0,valor_b=0,valor_c=0;
	
	cout<<"Ingrese el numero de ventas del dia:  ";
	cin>>NumeroVentas;
		while(i!=NumeroVentas){
			i=i+1;
			cout<<"Ingrese el valor de la venta "<<i<<"  ";
			cin>>ValorVenta;
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
	cout<<"El numero de ventas del dia fue: "<<NumeroVentas<<endl<<endl;
	cout<<"Numero de ventas mayores a $1000: "<<a<<endl;
	cout<<"Con un monto acumulado de: "<<valor_a<<"$"<<endl<<endl;
	cout<<"Numero de ventas menores a $1000, pero mayores a $500: "<<b<<endl;
	cout<<"Con un monto acumulado de: "<<valor_b<<"$"<<endl<<endl; 
	cout<<"Numero de menores o iguales a $500: "<<c<<endl;
	cout<<"Con un monto acumulado de: "<<valor_c<<"$"<<endl<<endl;
	cout<<"Monto total acumulado del dia: "<<ValorVenta<<"$";
	
	return 0;
}