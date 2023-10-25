import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v;
        System.out.println("Indica de 0 a 5 el grado de satisfacción en la casa rural :) ");
        v = in.nextInt();

        if (v == 0) {
            System.out.println("No vuelvo jamás");}
        else if (v == 1 || v == 2) {
            System.out.println("Ni fu ni fa");}
          else  if (v == 3) {
            System.out.println("Lo mismo de siempre");}
          else  if (v == 4) {
            System.out.println("La recomendaré");}
          else  if (v == 5) {
            System.out.println("Fántastico");}

         else  if (v > 5) {
            System.out.println("El valor que has introducido no es del 0 al 5 ");}
        }}

