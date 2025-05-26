import java.util.Scanner;

public class MatricularA {
    private static final String arquivo = "bancomatriculas.csv";
    public static void matricular(){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new GravarAluno();
        Turmas turma = new Turmas();
        int op =0;
    do{
        System.out.println("Insira a matricula do aluno que deseja matricular na disciplina:");
        aluno.setMatricula(sc.nextInt());
        if(LerAluno.listarAlunos(aluno.getMatricula(),aluno)==true){
            System.out.println("Insira codigo,horário:");
            sc.nextLine();
        String[] pesquisa = sc.nextLine().split(",");
        turma.setCodigo(pesquisa[0]);
        turma.setHora(pesquisa[1]);
            if(Turmas.listarT(pesquisa[0],pesquisa[1])==true){
                GravadT.escrever(aluno.getMatricula()+","+turma.getcodigo()+","+turma.gethora(),arquivo);
                return;
            }
            else{
                System.out.println("Turma não encontrada:\n"+
                                    "-0- Tentar matricular aluno novamente\n"+
                                    "-1- Sair para o modo disciplina");
            }
        }else{
            System.out.println("Aluno não encontrado:\n"+
                                "-0- Adicionar outro aluno\n"+
                                "-1- Sair para o modo disciplina");
            sc.nextLine();
            op=sc.nextInt();
        }
    }while(op==0);
        
        

    }
}
