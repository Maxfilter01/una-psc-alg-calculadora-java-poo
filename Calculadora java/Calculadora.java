import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        

        System.out.println("Calculadora");

        while(true){
        System.out.println("Qual operação deseja fazer? (+, -, *, /, ^, !)");
        String simbolo = scanner.next().toUpperCase();
        if(simbolo.equals("Q")){
            break;
        }
        System.out.println("Informe o primeiro número: ");
        operacoes.setNumeroUm(scanner.nextDouble());

        System.out.println("Informe o segundo número: ");
        operacoes.setNumeroDois(scanner.nextDouble());
        
        if(simbolo.equals("+")){
            double resultadosoma = operacoes.somar();
            System.out.println("O resultado da soma é: " + resultadosoma);

        }
        else if(simbolo.equals("-")){
            double resultadosubtrair = operacoes.subtrair();
            System.out.println("O resultado da subtração é: " + resultadosubtrair);
            
        }
        else if(simbolo.equals("*")){
            double resultadomultiplicar = operacoes.multiplicar();
            System.out.println("O resultado da multiplicação é: " + resultadomultiplicar);
            
        }
        else if(simbolo.equals("/")){
            if(operacoes.getNumeroDois() == 0){
                System.out.println("Impossível realizar divisão por zero.");
                break;
        }else{
            double resultadodividir = operacoes.dividir();
            System.out.println("O resultado da divisão é: " + resultadodividir);
        }
             
        }
        else if(simbolo.equals("^")){
            double resultadopotencia = operacoes.potencia();
            System.out.println("O resultado da potencia é: " + resultadopotencia);
            
        }
        else if(simbolo.equals("!")){
            if(operacoes.getNumeroUm() < 0){
            System.out.println("Não existe raiz de número negativo.");
            break;

        }else{
            double resultadoraiz = operacoes.raiz();
            System.out.println("O resultado da raiz é: " + resultadoraiz);
        }
            
        }
        
        }
        scanner.close();
    }
 }
