import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();



        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");;
        } finally {
            sc.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int resultado = parametroDois - parametroUm;
        int contador = 1;
        while (contador <= resultado) {
            System.out.println("Imprimindo número " + contador);
            contador++;
        }
    }
}
