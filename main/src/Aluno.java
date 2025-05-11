import java.util.Scanner;


public class Aluno {
    private String nome,curso;
    private int matricula, disciplinas;
 //   public void addaluno(String nome, String curso, int matricula){
 //       this.nome = nome;
 //       this.curso = curso;
 //       this.matricula = matricula;
// }

    public static void aop(int opcao){
       Scanner sc = new Scanner(System.in);
        do{ System.out.println("=======Modo Aluno=======\n escolha a função:\n"+
        "-0- Cadastrar alunos \n"+
        "-1- Editar alunos \n"+
        "-2- Listar alunos cadastrados \n"+
        "-3- Matricular Aluno \n"+
        "-4- Trancar disciplinas e semestre\n"+
        "-5- Voltar para o menu principal \n");
         opcao = sc.nextInt();
    switch (opcao) {
        case 0:
            GravarAluno.addaluno();
            break;
        case 1:
        EditarA.editar();
            break;
        case 2:
        LerAluno.listarAlunos();
            break;
        case 5:
        return;
        default:
        System.out.println("Opção inválida");
            break;
        }

    }while (true); 
}
}