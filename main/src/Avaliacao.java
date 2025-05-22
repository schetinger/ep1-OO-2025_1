import java.util.InputMismatchException;
import java.util.Scanner;

public class Avaliacao {
    

public static void aop (){
   int op=0;
   do{
    try{
    System.out.println("=======Bem vindo ao Modo Avaliação(em desenvolvimento)=======\n"+
                        "Selecione um modo\n"+
                        "-0-Lançar notas de uma turma\n"+
                        "-1-Lançar presença de uma turma\n"+
                        "-2-Calcular média final e frequência de um aluno\n"+
                        "-3-Informar situação final de um aluno\n"+
                        "-4-Exibir relatório de turma\n"+
                        "-5-Exbir relatório de disciplina\n"+
                        "-6-Exibir relatório de professor\n"+
                        "-7-Voltar para o menu principal");
     Scanner sc=new Scanner(System.in);                   
     op = sc.nextInt();
    switch (op) {
        case 0:
        System.out.println("Função em desenvolvimento");
            break;
        case 1:
        System.out.println("Função em desenvolvimento");
        break;
        case 2:
        System.out.println("Função em desenvolvimento");
        break;
        case 3:
        System.out.println("Função em desenvolvimento");
        break;
        case 4:
        System.out.println("Função em desenvolvimento");
        break;
        case 5:
        System.out.println("Função em desenvolvimento");
        case 6:
        System.out.println("Função em desenvolvimento");
        case 7:
        return;
        default:
        System.out.println("\nInsira um número entre as opções");
            break;
    }}catch(InputMismatchException e){
        System.out.println("\nResposta invalida insira novamente");
    }
   }while (true);
}













}

