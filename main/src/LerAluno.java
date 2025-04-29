import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LerAluno {
    private static final String arquivo = "dadoalunos.csv";

    public static void listarAlunos(){
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                String[] partes = linha.split(",");
            if(partes.length==3){
                System.out.println("Nome:"+ partes[0] + ". Matrícula:"+ partes[1]+ ". Curso:"+ partes[2]);
            }
            
            }
            

        }
        catch(IOException e){
            System.out.println("Erro ao listar os alunos tente novamente.");
        }
    }
}

