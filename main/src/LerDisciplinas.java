import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerDisciplinas extends Disciplina {

       private static final String arquivo = "bancodisciplinas.csv";

    public static void listarD(){
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                String[] partes = linha.split(",");
                if(partes[3].equals("0")){
                System.out.println("\nDisciplina:"+ partes[0] + ". Código:"+ partes[1]+ ". Créditos:"+ partes[2]+". Sem pré-requisitos");
                }else{
                    System.out.println("\nDisciplina:"+ partes[0] + ". Código:"+ partes[1]+ ". Créditos:"+ partes[2]+" Pré-requisitos:"+partes[3]);
                }
                
            }
        }
        catch(IOException e){
            System.out.println("Erro ao listar os alunos tente novamente.");
        }
         
    }
    public static Boolean pesquisa (String codigo){
        Disciplina disciplina= new Disciplina();
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                disciplina.fromString(linha);
                if(codigo.equals(disciplina.getcodigo())){
                    System.out.println("Adicione os dados para criar uma turma de "+disciplina.getNome());
                    return true;
                }
            }
 }catch(IOException e){
            System.out.println("Erro ao listar os disciplinas tente novamente.");
    }
    return false;
}
}
