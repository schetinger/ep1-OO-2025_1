import java.util.Scanner;

public class GravadT {
    private static final String arquivo = "bancoturmas.csv";
    public static void gravar(){
      int op=0;
      do{
 System.out.println("Insira o codigo da disciplina que deseja: ");
        Scanner sc=new Scanner(System.in);
        String disc=sc.nextLine();
        if(LerDisciplinas.pesquisa(disc)==true){
         System.out.println("Formato Professor,semestre,forma de avaliação,presencial ou remota,sala(0 caso online),horário,capacidade");
}else{
    System.out.println("O codigo de matéria inserido não foi encontrado."+
                        "-0-Inserir outro codigo de matéria"+
                        "-1-Sair para o modo avaliação");
    op=sc.nextInt();
    }
}while(op==0);
}
}

