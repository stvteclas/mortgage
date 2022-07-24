import java.text.NumberFormat;
import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
     final byte Meses_del_año= 12;
     final byte Porcentaje= 100;
     
     Scanner scanner= new Scanner(System.in);
     System.out.print("Monto solicitado:");
     int montoSolicitado = scanner.nextInt();

     System.out.print("Tasa de interes anual:");
     float interesAnual= scanner.nextFloat();
     float interesMensual= interesAnual/Porcentaje/Meses_del_año;

     System.out.print("Periodo (Años)");
     byte años= scanner.nextByte();
     int numeroDePagos= años*Meses_del_año;

     double hipoteca= montoSolicitado*(interesMensual*Math.pow(1+interesMensual, numeroDePagos)) /(Math.pow(1+interesMensual, numeroDePagos) -1);
     String formatoHipoteca =  NumberFormat.getCurrencyInstance().format(hipoteca);
     System.out.println("Hipoteca:" +formatoHipoteca);
    }
}
