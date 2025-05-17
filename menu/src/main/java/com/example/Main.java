package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

//ciclo do while para el menú
        do{
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    ejercicio1(sc);
                    break;
                case 2:
                    ejercicio2(sc);
                    break;
                case 3:
                    ejercicio3(sc);
                    break;
                case 4:
                    ejercicio4(sc);
                    break;
                case 5:
                    ejercicio5(sc);
                    break;
                case 6:
                    ejercicio6(sc);
                    break;
                case 7:
                    ejercicio7(sc);
                    break;
                case 8:
                    ejercicio8(sc);
                    break;
                case 9:
                    ejercicio9(sc);
                    break;
                case 10:
                    ejercicio10(sc);
                    break;
                case  0:
                    System.out.println("Hasta luego."); 
                    break;               
            
                default:
                    System.out.println("Opción invalida.");
            }



        } while (opcion != 0); {
        sc.close();    
        }
    }

    // Metodo para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n---- MENÚ DE EJERCICIOS ----");
        System.out.println("1. Control de precios en una tienda");
        System.out.println("2. Registro de horas de trabajadores");
        System.out.println("3. Análisisde notas escolares");
        System.out.println("4. Simulacion de retiro en cajero automático");
        System.out.println("5. Revisión de ventas diarias");
        System.out.println("6. Priorización de pacientes en un centro de salud");
        System.out.println("7. Evaluación de productos fabricados");
        System.out.println("8. Horarios de transporte público");
        System.out.println("9. Clasificación de compras de un mercado");
        System.out.println("10.Monitoreo de temperatura ambiental");
        System.out.println("0. Salir");
        System.out.println("---Seleccione una opción---");

    }

    // 1. Metodo para: Control de precios en una tienda.
    public static void ejercicio1(Scanner sc) {
        String[] nombres = new String[5];
        double[] precios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del producto " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
            System.out.println("Precio del producto " + (i + 1) + ":");
            precios[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Productos con precio mayor a 50.000 COP:");
        for (int i = 0; i < 5; i++) {
            if (precios[i] > 50000) {
                System.out.println(nombres[i] + ": $" + precios[i]);
            }
        }
    }

    // 2. Metodo para:Registro de horas de trabajadores.
    public static void ejercicio2(Scanner sc) {
        double[][] horas = new double[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("Trabajador " + (i + 1));
            for (int b = 0; b < 5; b++) {
                System.out.println("Horas trabajadas el día " + (b + 1) + ": ");
                horas[i][b] = sc.nextDouble();
            }

        }

        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int b = 0; b < 5; b++) {
                total += horas[i][b];
            }
            System.out.println("Total de horas del trabajador " + (i + 1) + ":" + total);
        }
    }

    // 3. Metodo para:Análisisde notas escolares.
    public static void ejercicio3(Scanner sc) {
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese nota del estudiante " + (i+1) + ": ");
            notas.add(sc.nextDouble());
        }

        double suma = 0;
        int aprobados = 0;

        for (double nota : notas) {
            suma += nota;
            if (nota >= 3.5) {
                aprobados++;
            }
        }

        double promedio = suma / notas.size();
        System.out.printf("Promedio general: %.2f\n", promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
    }


    //4. metodo para:Simulación de retiro en cajero automático.
    public static void ejercicio4(Scanner sc) {
        int[] billetes = {10000, 50000, 20000, 10000};

        System.out.println("Ingrese el monto a retirar: ");
        int monto = sc.nextInt();

        for (int b : billetes) {
            int cantidad = monto / b;
            if (cantidad > 0) {
                System.out.println("Billetes de " + b + ": " + cantidad);
                monto = monto % b;
            }
        }

    }


    //5. Metodo para:Revisión de ventas diarias.
    public static void ejercicio5(Scanner sc) {
        double[] ventas = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ventas del día " + (i+1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        double mayor = ventas [0];
        double menor = ventas [0];
        int diaMayor = 1;
        int diaMenor = 1;


        for (int i = 1; i < 7; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                diaMayor = i + 1;
            }
            if (ventas[i] < menor) {
                menor = ventas[i];
                diaMenor = i + 1;
            }
        }
    }

    //6. Metodo para Priorización de pacientes en un centro de salud.
    public static void ejercicio6(Scanner sc) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> prioridades = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {
            System.out.println("Nombre del paciente " + (i+1) + ": ");
            nombres.add(sc.nextLine());
            System.out.println("Prioridad (1=alta, 2=media, 3=baja): ");
            prioridades.add(sc.nextInt());
            sc.nextLine();
        }

        for (int prioridad = 1; prioridad <= 3; prioridad++) {
            System.out.println("\nPacientes con prioridad " + prioridad + ": ");
            for (int i = 0 ; i < 5; i++) {
                if (prioridades.get(i) == prioridad) {
                    System.out.println(nombres.get(i));
                }
            }
        }
    }

    //7. Metodo para: Evaluación de productos fabricados.
    public static void ejercicio7(Scanner sc) {
        int[] estado = new int[50];
        int buenos = 0, defectuosos = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Estado del producto " + (i+1) + "(1=bueno, 0=defectuoso): ");
            estado[i] = sc.nextInt();
            if (estado[i] == 1) buenos++;
            else defectuosos++;
        }

        double porcentajeDefectuosos = (defectuosos * 100.0) / 50;

        System.out.println("Productos buenos: " + buenos);
        System.out.println("Productos defectuosos: " + defectuosos);
        System.out.printf("Porcentaje de defectuosos: %.2f%%\n", porcentajeDefectuosos);
    }

    //8. Metodo para:Horarios de transporte público
    public static void ejercicio8(Scanner sc) {
        double[] horarios = {7.00, 9.30, 12.00, 14.30, 17.00, 19.30};

        System.out.println("Ingrese el horario actual (formato 24h, ejemplo 15.30):");
        double hora = sc.nextDouble();

        for (double salida : horarios) {
            if (salida > hora) {
                System.out.println("Proximo bus disponible: " + salida);
                return;
            }
        }

        System.out.println("No hay más buses disponibles hoy.");

    }

    //9. Metodo para:Clasificación de compras en un mercado.
    public static void ejercicio9(Scanner sc) {
        ArrayList<Double> compras = new ArrayList<>();
        int p = 0;
        int m = 0;
        int g = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Monto de la compra del cliente " + (i+1) + ": ");
            double monto = sc.nextDouble();
            compras.add(monto);

            if (monto < 50000) p++;
            else if (monto <= 100000) m++;
            else g++;
        }

        System.out.println("Clientes con compra pequeña: " + p);
        System.out.println("Clientes con compra mediana: " + m);
        System.out.println("Clientes con compra grande: " + g);
    }

   //10.Metodo para:Monitoreo de temperatura ambiental.
    public static void ejercicio10(Scanner sc) {
        double[] temperaturas = new double[12];
        int calientes = 0, frias = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Temperatura en hora " + (i+1) + ": ");
            temperaturas[i] = sc.nextDouble();

            if (temperaturas[i] > 35) calientes++;
            else if (temperaturas[i] < 20) frias++;
        }

        System.out.println("Horas con temperatura mayor a 35°C: " + calientes);
        System.out.println("Horas con temperatura menor a 20°C: " + frias);
    }
}
