import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        char[][] Matriz = new char[10][10];

        int vidas = 10;
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                Matriz[fila][columna] = '*' ;

            }

        }

        char YODA = 'Y';
        Matriz[0][0]= YODA;

        char CASILLA_FINAL = 'F';
        Matriz [9][9]= CASILLA_FINAL;

        Random aleatorios = new Random();
         int filaRandom = aleatorios.nextInt(10);
         int columnaRandom = aleatorios.nextInt(10);

         Matriz[filaRandom][columnaRandom] = 'M';


        for (int fila = 0; fila < 5; fila++) {

                do {
                    filaRandom = aleatorios.nextInt(10);
                    columnaRandom = aleatorios.nextInt(10);
                } while ( Matriz[filaRandom][columnaRandom] != '*');

                Matriz[filaRandom][columnaRandom] = 'P';






        }

        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println(" Y te puedes desplazar con las letras W A S D ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Diem una letra: ");
        char DESPLAZAMIENTO = sc.next() .charAt(0);

        System.out.println("LA letra elegida es: " + DESPLAZAMIENTO);

        int filaYoda = 0;
        int columnaYoda =0;
        Matriz[filaYoda][columnaYoda] = YODA;
        if (DESPLAZAMIENTO == 'D') {
            columnaYoda = columnaYoda + 1;
            Matriz[filaYoda][columnaRandom] = YODA;

        }
        
        System.out.println();








        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(Matriz[fila][columna] + " ");

            }
            System.out.println(" ");

        }




    }
}


