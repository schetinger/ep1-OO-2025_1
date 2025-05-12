import java.util.Scanner;

public class Disciplina {
    private String nome,codigo,prereq;
    private int carga;
    public static void dop (){
        Scanner sc = new Scanner(System.in);
        Boolean l= true;
        int opcao;
       do{
System.out.println("=======Bem vindo ao Modo Disciplinas=======\n"+"Escolha uma opção:\n"+
                            "-0- Cadastrar nova disciplina\n"+
                            "-1- Criar turmas de disciplinas existentes\n"+
                            "-2- Listar turmas de uma disciplina\n"+
                            "-3- Listar disciplinas\n"+
                            "-4- Voltar ao menu principal");
        opcao = sc.nextInt();
        switch (opcao) {
            case 0:
                GravarD.gravar();
            break;
            case 1:
            GravadT.gravar();
            case 3:
            LerDisciplinas.listarD();
            break;
            case 4:

            break;

            default:
                break;

       }
        
        }while(opcao!=4);
    }
}
