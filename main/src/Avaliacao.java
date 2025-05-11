import java.util.Scanner;

public class Avaliacao {
    

public static void aop (){
   int op=0;
   do{
  Scanner sc=new Scanner(System.in);
    System.out.println("=======Bem vindo ao Modo Avaliação=======\n"+
                        "Selecione um modo\n"+
                        "-0-Lançar notas de uma turma\n"+
                        "-1-Lançar presença de uma turma\n"+
                        "-2-Calcular média final e frequência de um aluno\n"+
                        "-3-Informar situação final de um aluno\n"+
                        "-4-Exibir relatório de turma\n"+
                        "-5-Exbir relatório de disciplina\n"+
                        "-6-Exibir relatório de professor\n"+
                        "-7-Voltar para o menu principal");
     op = sc.nextInt();
    switch (op) {
        case 0:
            
            break;
    
        default:
        System.out.println("Opção invalida selecione novamente");
            break;
    }
   }while (op!=7);
}













}

