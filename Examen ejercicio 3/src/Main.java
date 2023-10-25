import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String nomb1, nomb2, nomb3;
        int año1, año2, año3, edad1, edad2, edad3;
            System.out.println("Escribeme el nombre de la 1º persona");
                nomb1 = in.nextLine();
            System.out.println("Escribeme el nombre de la 2º persona");
                nomb2 = in.nextLine();
            System.out.println("Necesito el nombre de la 3º persona");
                nomb3 = in.nextLine();
                System.out.println("A continuación necesito la fecha de nacimiento de " + nomb1);
                             año1 = in.nextInt();
                             System.out.println("Necesito ahora la fecha de nacimiento de " + nomb2);
                            año2 = in.nextInt();
                    System.out.println("Solo me falta la fecha de nacimiento de " + nomb3);
                        año3 = in.nextInt();
        edad1 = 2023 - año1;
        edad2 = 2023 - año2;
        edad3 = 2023 - año3;
        if(edad1 >= edad2 && edad2 >= edad3){
                System.out.println( nomb1 + edad1 + " años," + nomb2 + edad2 + " años," + nomb3 + edad3 + " años");
        }
        else if(edad2 >= edad1 && edad1 >= edad3){
                System.out.println( nomb2 + edad2 + " años," + nomb1 + edad1 + " años," + nomb3 + edad3 + " años.");
        }
        else if (edad3 >= edad1 && edad1 >= edad2) {
                System.out.println( nomb3 + edad3 + " años," + nomb1 + edad1 + " años," + nomb2 + edad2 + " años");

        }


    }
}