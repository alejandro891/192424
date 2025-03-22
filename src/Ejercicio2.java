import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        final int numMINIMO=3;

        Scanner scanner = new Scanner(System.in);

        float numTotalNotas=0;
        float numTotalAprovados=0;
        float numTotalReprovados=0;
        float numEstudiantes=0;
       

        System.out.println("ingresa notas de 4 estudiantes");

        for (int i = 1; i <=4; i++) {

            System.out.println("ingrese notas del estudiante  " +i);

            System.out.println("ingrese la primera nota");
            float numNota1 = scanner.nextFloat();
            System.out.println("ingrese la segunda nota");
            float numNota2 =scanner.nextFloat();
            System.out.println("ingrese la tercera nota");
            float numNota3 = scanner.nextFloat();
            

            numTotalNotas=numNota1+numNota2+numNota3; 
            float numPromedio = numTotalNotas/numMINIMO;

            if (numPromedio >= numMINIMO) {
                System.out.println("aprobo");
                numTotalAprovados++;
                
            } else{
                System.out.println("reprobo");
                numTotalReprovados++;
            }
           
        }
        System.out.println("los aprobados son: " + numTotalAprovados);
        System.out.println("los reprovados son: " + numTotalReprovados);
      
    }
}
