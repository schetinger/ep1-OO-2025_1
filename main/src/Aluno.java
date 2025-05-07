import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {
    private String nome,curso;
    private int matricula, disciplinas;
 //   public void addaluno(String nome, String curso, int matricula){
 //       this.nome = nome;
 //       this.curso = curso;
 //       this.matricula = matricula;
// }
    public static String dados(){
        System.out.println("insira os dados do aluno no formato:nome,matricula,curso");
        Scanner sc = new Scanner(System.in);
        String dados = sc.nextLine();
        return dados;
    }
    public static void aop(int opcao){
        System.out.println("-Modo Aluno- escolha a função:\n"+
        "-0- Cadastrar alunos \n"+
        "-1- Editar alunos \n"+
        "-2- Listar alunos cadastrados \n"+
        "-3- Matricular Aluno \n"+
        "-4- Trancar disciplinas e semestre\n"+
        "-5- Salvar e carregar dados \n"+
        "-6- Verificar duplicidade de matricula\n");
        Scanner sc = new Scanner(System.in);
         opcao = sc.nextInt();
    switch (opcao) {
        case 0:
            GravarAluno.addaluno();
            break;
        case 1:
        
            break;
        case 2:
        LerAluno.listarAlunos();
    
        default:
            break;
    }

}
    }

