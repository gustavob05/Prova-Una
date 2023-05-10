import java.util.Scanner;
// Gustavo de Souza Bernardo
public class Prova1 {
    public static void main(String[] args) {

    
    Scanner scanner = new Scanner(System.in); 


    System.out.println("\nInforme a placa do veículo: ");
    String placa =  scanner.nextLine();

    System.out.println("\nInforme o valor do litro do combustível: ");
    double valorLitro = scanner.nextDouble();

    System.out.println("\nA quantidade de quilômetros rodados a 60 KM/H: ");
    Double km60 = scanner.nextDouble();

    System.out.println("\nA quantidade de quilômetros rodados a 80 KM/H: ");
    Double km80 = scanner.nextDouble();

    System.out.println("\nA quantidade de quilômetros rodados a 100 KM/H: ");
    Double km100 = scanner.nextDouble();

    System.out.println("\nA quantidade de quilômetros rodados a 120 KM/H: ");
    Double km120 = scanner.nextDouble();

    System.out.println("\nA quantidade de quilômetros rodados a 140 KM/H: ");
    Double km140 = scanner.nextDouble();



    Double combustivel60 = km60 / 30.7;
    Double combustivel80 = km80 / 26.8;
    Double combustivel100 = km100 / 22.4;
    Double combustivel120 = km120 / 18.1;
    Double combustivel140 = km140 / 14.5;


    Double combustivelTotal = combustivel60 + combustivel80 + combustivel100 + combustivel120 + combustivel140;


    Double distanciaTotal = km60 + km80 + km100 + km120 + km140;


    Double mediaPonderada = ((km60 * 60) + (km80 * 80) + (km100 * 100) + (km120 * 120) + (km140 * 140)) / distanciaTotal;


    Double custoTotal = combustivelTotal * valorLitro;


    System.out.println("\nPlaca do veículo: " + placa);
    System.out.printf("\nCusto total da viagem: R$ %.2f\n ", custoTotal);
    System.out.printf("\nVelocidade média ponderada da viagem: %.4f km/h\n", mediaPonderada);
    System.out.printf("\nQuantidade total de combustivel: %.4f litros\n\n", combustivelTotal);
    

    scanner.close();


 }
}