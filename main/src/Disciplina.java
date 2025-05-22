import java.util.InputMismatchException;
import java.util.Scanner;

public class Disciplina {
    private String nome,codigo,prereq;
    private int credito;

 public int getCredito(){
    return credito;
 }
 public String getNome(){
    return nome;
}
 public String getcodigo(){
    return codigo;
}
 public String getprereq(){
    return prereq;
}
public void setNome(String nome){
    this.nome = nome;
}
public void setCodigo(String codigo){
    this.codigo = codigo;
}
public void setPrereq(String prereq){
    this.prereq=prereq;
}
public void setCredito(int credito){
    this.credito=credito;
}
@Override
public String toString(){
    return nome+","+codigo+","+credito+","+prereq;
}
public void fromString(String dados){
    String[] partes= dados.split(",");
    this.nome=partes[0];
    this.codigo=partes[1];
    this.credito=Integer.parseInt(partes[2]);
    this.prereq=partes[3];
}
    public static void dop (){
        
        int opcao;
       do{
        try{


System.out.println("=======Bem vindo ao Modo Disciplinas=======\n"+"Escolha uma opção:\n"+
                            "-0- Cadastrar nova disciplina\n"+
                            "-1- Criar turmas de disciplinas existentes\n"+
                            "-2- Listar turmas de uma disciplina\n"+
                            "-3- Listar disciplinas\n"+
                            "-4- Voltar ao menu principal");
        Scanner sc = new Scanner(System.in);                    
        opcao = sc.nextInt();
        switch (opcao) {
            case 0:
                GravarD.gravar();
            break;
            case 1:
            GravadT.gravar();
            break;
            case 2:
            Turmas.listarT();
            break;
            case 3:
            LerDisciplinas.listarD();
            break;
            case 4:
            return;

            default:
            System.out.println("\nInsira um número entre as opções");
                break;

       }
    }catch(InputMismatchException e ){
        System.out.println("\nResposta inválida insira novamente");
    }
        }while(true);
    }
}
