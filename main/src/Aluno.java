import java.util.Scanner;


public class Aluno {
    private String nome,curso;
    private int matricula;
    private boolean especial;

    public int getMatricula(){
    return matricula;
}
public String getNome(){
    return nome;
}
public String getcurso(){
    return curso;
}
public boolean getEspecial(){
    return especial;
}
public void setMatricula(int matricula){
    this.matricula=matricula;
}
public void setNome(String nome){
    this.nome=nome;
}
public void setCurso(String curso){
    this.curso =curso;
}
public void setEspecial(boolean especial){
    this.especial=especial;
}
public String toString(){
 String resumo = nome+","+matricula+","+curso;
    return resumo;
}
public void fromString(String linha){
    String[] partes= linha.split(",");
    this.nome = partes[0];
    this.matricula = Integer.parseInt(partes[1]);
    this.curso = partes[2];
}

    public static void aop(int opcao){
       Scanner sc = new Scanner(System.in);
        do{ System.out.println("=======Modo Aluno=======\n escolha a função:\n"+
        "-0- Cadastrar alunos \n"+
        "-1- Editar alunos \n"+
        "-2- Listar alunos cadastrados \n"+
        "-3- Matricular Aluno em disiplina\n"+
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