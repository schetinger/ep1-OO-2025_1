import java.util.InputMismatchException;
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
    if(especial== true){
       return nome+","+matricula+","+curso+","+"especial";
    }else{
       return nome+","+matricula+","+curso+","+"normal";
    }

    
}
public void fromString(String linha){
    String[] partes= linha.split(",");
    this.nome = partes[0];
    this.matricula = Integer.parseInt(partes[1]);
    this.curso = partes[2];
    if(partes[3].equals("normal")){
    this.especial= false;
    }else{
        this.especial=true;
    }
}

    public static void aop(int opcao){
    
        do{ 
            try{
            System.out.println("=======Modo Aluno=======\n escolha a função:\n"+
        "-0- Cadastrar alunos \n"+
        "-1- Editar alunos \n"+
        "-2- Listar alunos cadastrados \n"+
        "-3- Matricular Aluno em disiplina\n"+
        "-4- Trancar disciplinas e semestre\n"+
        "-5- Voltar para o menu principal \n");
        Scanner sc = new Scanner(System.in);
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
        case 3:
       MatricularA.matricular();
        break;
        case 5:
        return;

        default:
        System.out.println("Insira um número entre as opções");
            break;
        }}catch(InputMismatchException e){
            System.out.println("Resposta inválida insira novamente");
        }

    }while (true); 
}
}