import java.util.Scanner;

public class GravadT extends Turmas {
    private static final String arquivo = "bancoturmas.csv";
    public static void gravar(){
      int op=0;
      do{
 System.out.println("Insira o codigo da disciplina que deseja: ");
        Scanner sc=new Scanner(System.in);
        Turmas turma= new Turmas();
        turma.setCodigo(sc.nextLine());
        if(LerDisciplinas.pesquisa(turma.getcodigo())==true){
         System.out.println("Formato Professor,semestre,forma de avaliação,presencial ou remota,sala(0 caso online),horário,capacidade\n");
         turma.setProf(sc.nextLine());
         System.out.println("-1- Turma do primeiro semestre.\n"+
                            "-2- Turma do segundo semestre.");
        turma.setSemestre(sc.nextInt());
        System.out.println("-A- Tipo de avaliação A\n"+
                            "-B- Tipo de avaliação B\n");
        turma.setAvaliacao(sc.nextLine());
        System.out.println("Sala de aula presencial ou remota?\n");
        turma.setTipo(sc.nextLine());
        System.out.println("Insira o numero da sala(caso seja aula remota insira 0)\n");
        turma.setSala(sc.nextInt());
        System.out.println("Insira o horário da turma EX:6T23\n");
        turma.setHora(sc.nextLine());
        System.out.println("Insira a capacidade de alunos desta turma:\n");
        turma.setCapacidade(sc.nextInt());
        
}else{
    System.out.println("O codigo de matéria inserido não foi encontrado."+
                        "-0-Inserir outro codigo de matéria"+
                        "-1-Sair para o modo avaliação");
    op=sc.nextInt();
    }
}while(op==0);
}
}

