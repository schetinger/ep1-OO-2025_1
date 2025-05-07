import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class GravarAluno {
    private static final String arquivo = "dadoalunos.csv";
    public static void addaluno(){
        try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(Aluno.dados()+ "\n");
            System.out.println("Aluno adicionado ao banco de dados com sucesso");
        }catch (IOException e){
            System.out.println("algo deu errado, tente novamente");
        }
    }

    
}
