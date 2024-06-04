import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            e.getMessage();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i<= contagem;i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}