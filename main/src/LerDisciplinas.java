import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerDisciplinas extends Disciplina {

       private static final String arquivo = "bancodisciplinas.csv";

    public static void listarD(){
        Disciplina dis = new Disciplina();
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                dis.fromString(linha);
                if(dis.getprereq().equals("0")){
                System.out.println("\nDisciplina:"+ dis.getNome() + ". Código:"+ dis.getcodigo()+ ". Créditos:"+ dis.getCredito()+". Sem pré-requisitos");
                }else{
                    System.out.println("\nDisciplina:"+ dis.getNome() + ". Código:"+ dis.getcodigo()+ ". Créditos:"+ dis.getCredito()+" Pré-requisitos:"+dis.getprereq());
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
                    codigo=linha;
                    return true;
                }
            }
 }catch(IOException e){
            System.out.println("Erro ao listar os disciplinas tente novamente.");
    }
    return false;
}
}
