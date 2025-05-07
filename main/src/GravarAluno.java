import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
public class GravarAluno {
        public static String dados(){
        System.out.println("insira os dados do aluno no formato:nome,matricula,curso");
        Scanner sc = new Scanner(System.in);
        String dados = sc.nextLine();
        return dados;
    }
    private static final String arquivo = "dadoalunos.csv";
    public static void addaluno(){
        try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(dados()+ "\n");
            System.out.println("Aluno adicionado ao banco de dados com sucesso");
        }catch (IOException e){
            System.out.println("algo deu errado, tente novamente");
        }
    }

    
}
