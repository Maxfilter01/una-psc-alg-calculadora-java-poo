import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        

        System.out.println("Calculadora");

        while(true){
        System.out.println("Qual operação deseja fazer? (+, -, *, /, ^, !)");
        String simbolo = scanner.next();

        System.out.println("Informe o primeiro número: ");
        operacoes.setNumeroUm(scanner.nextDouble());

        System.out.println("Informe o segundo número: ");
        operacoes.setNumeroDois(scanner.nextDouble());
        
        if(simbolo.equals("+")){
            double resultadosoma = operacoes.somar();

        }
        else if(simbolo.equals("-")){
            double resultadosubtrair = operacoes.subtrair();
            
        }
        else if(simbolo.equals("*")){
            double resultadomultiplicar = operacoes.multiplicar();
            
        }
        else if(simbolo.equals("/")){
            double resultadodividir = operacoes.dividir();
            
        }
        else if(simbolo.equals("^")){
            double resultadopotencia = operacoes.potencia();
            
        }
        else if(simbolo.equals("!")){
            double resultadoraiz = operacoes.raiz();
            
        }
        
    
    
    }
        
            
    }
    
        

    }
