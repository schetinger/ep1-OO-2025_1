import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int opcao=0;
        do{
try{
        System.out.println("=======Bem vindo=======\n escolha o modo:\n -0- Modo aluno\n -1- Modo disciplina \n -2- Modo Avaliação\n -3- Sair do app");
        Scanner sc = new Scanner(System.in);
         opcao = sc.nextInt();
    switch(opcao){
        case(0):
           Aluno.aop(opcao);
            break;
        case(1):
        Disciplina.dop();
        break;
        case(2):
        Avaliacao.aop();
        break;
        case(3):
        System.out.println("Muito obrigado por usar o app.");
        return;
        default:
        System.out.println("\nInsira um número entre as opções");
        break;
    }}catch(InputMismatchException e){
        System.out.println("\nResposta inválida insira novamente");
    }
    
}while(true);
}
}
