import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int i;


        //Ejercicio 1

       ejercicio1();

        //Ejercicio 2

        System.out.println("Ejercicio 2");

        System.out.println("Ingrese un numero: ");

         i =  scanner.nextInt();
        System.out.println("El numero es = " + i);
        System.out.println("------------------------------------------");

        //Ejercicio 3

        System.out.println("Ejercicio 3 - Suma de dos numeros");
        System.out.println("Ingrese el primer numero:");
        i = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2=scanner.nextInt();

        int total = i + num2;

        System.out.println("Total suma= " + total);
        System.out.println("------------------------------------------");

        //Ejercicio 4

        for (int bucle = 1; bucle<11; bucle ++)
        {
            System.out.println("El bucle se autogenera= " + bucle);
        }
        System.out.println("------------------------------------------");

        //Ejercicio 5

        System.out.println("Ejercicio 5 - Se calcula el area de un rectangulo");

        System.out.println("Ingrese la base del cuadrado rectangulo:");
        int base = scanner.nextInt();

        System.out.println("Ingrese la altura del cuadrado rectangulo:");
        int altura = scanner.nextInt();

        int areaC = base * altura;

        System.out.println("EL area del cuadrado rectangulo es = " + areaC);

        System.out.println("------------------------------------------");

        //Ejercicio 6

        System.out.println("Ejercicio 6 - se calcula si un numero es par o no");

        System.out.println("Ingrese le numero a evaluar:");
        int nump= scanner.nextInt();


        if (nump % 2 == 0)
        {
            System.out.println("EL NUMERO ES PAR");

        }else {

            System.out.println("EL NUMERO ES IMPAR");

        }
        System.out.println("------------------------------------------");

        //Ejercicio 7

        System.out.println("Ejercicio 7 - calculamos el factorial de un numero");

        System.out.println("Ingrese el numero deseado:");
        int numf = scanner.nextInt();
        System.out.println("El numero factorizado es = " + factorial(numf));



    }

    public static void ejercicio1(){

        System.out.println("Ejercicio 1");

        byte numero=78;
        System.out.println("Numero Entero = " + numero);

        float numerof= 3.543f;
        System.out.println("Numero Real = " + numerof);

        System.out.println("------------------------------------------");

    }


    public static int factorial(int num){

        if (num== 0 || num==1)
        {
            return 1;
        }else{

            return num * factorial(num-1);

        }


    }




}
