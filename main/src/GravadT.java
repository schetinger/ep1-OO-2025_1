import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class GravadT extends Turmas {
    private static final String arquivo = "bancoturmas.csv";
    
    public static void gravar(){
      int op=0;
      Turmas turma= new GravadT();
      do{
 System.out.println("Insira o codigo da disciplina que deseja: ");
        Scanner sc=new Scanner(System.in);
        turma.setCodigo(sc.nextLine());
        if(LerDisciplinas.pesquisa(turma.getcodigo())==true){
         System.out.println("Insira o professor responsável:");
         turma.setProf(sc.nextLine());
         System.out.println("-1- Turma do primeiro semestre.\n"+
                            "-2- Turma do segundo semestre.");
        turma.setSemestre(sc.nextInt());
        System.out.println("-A- Tipo de avaliação A\n"+
                            "-B- Tipo de avaliação B");
        sc.nextLine();
        turma.setAvaliacao(sc.nextLine());
        System.out.println("Sala de aula presencial ou remota?");
        turma.setTipo(sc.nextLine());
        System.out.println("Insira o numero da sala(caso seja aula remota insira 0)");
        turma.setSala(sc.nextInt());
        System.out.println("Insira o horário da turma EX:6T23");
        sc.nextLine();
        turma.setHora(sc.nextLine());
        System.out.println("Insira a capacidade de alunos desta turma:");
        turma.setCapacidade(sc.nextInt());
        System.out.println(turma.toString());
        if(GravadT.conflito(turma.toString())==false){
    GravadT.escrever(turma.toString(),arquivo);
    return;
  }else{
    System.out.println("Já existe uma disciplina nesse horario:\n"+
                        "-0-Inserir dados novamente\n"+
                        "-1-Sair para o Modo Disciplina");
        op=sc.nextInt();
  }
}else{
    System.out.println("O codigo de matéria inserido não foi encontrado.\n"+
                        "-0-Inserir outro codigo de matéria\n"+
                        "-1-Sair para o modo avaliação");
    op=sc.nextInt();
    }
    
   

}while(op==0);
}

public static Boolean conflito( String info){
    Turmas turma = new Turmas();
    turma.fromString(info);
    Turmas teste = new Turmas();
     try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                teste.fromString(linha);
                if(turma.getcodigo().equals(teste.getcodigo())){
                    if(teste.gethora().equals(turma.gethora())){
                    return true;
                }
                }
                
            }
 }catch(IOException e){
            System.out.println("Erro ao listar os turmas tente novamente.");
    }
    return false;
}

public static void escrever(String turma,String arquivo){
    try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(turma+"\n");
            System.out.println("Adicionado ao banco de dados com sucesso");
        }catch (IOException e){
            System.out.println("Algo deu errado, tente novamente");
            }
}
}




