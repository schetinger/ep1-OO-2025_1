import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;

public class GravarAluno{

        private static final String arquivo = "bancodados.csv";
    public static void addaluno(){
        int op =0,x=1;
    while (op ==0) {
        x=1;
        String[] info = dados().split(",");
try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
                while ((linha = leitor.readLine())!= null && x==1 ) {
                    String[] partes = linha.split(",");

        if(info[1].equals(partes[1])){
            System.out.println("Essa matricula ja existe deseja adicionar outra matricula ou sair?\n"+
                                "-0- Adicionar aluno novamente\n"+
                                "-1- Sair do cadastro de alunos");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            x=0;
            if(op==1){
                return;
            }

            }else{
            try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(info[0]+","+info[1]+","+info[2]+ "\n");
            System.out.println("Aluno adicionado ao banco de dados com sucesso");
        }catch (IOException e){
            System.out.println("Algo deu errado, tente novamente");
            }
            return;
        }
    }
}   catch (IOException e) {
        e.printStackTrace();
        }
    }        
}


public static String dados(){
    System.out.println("Insira os dados do aluno no formato:nome,matricula,curso");
    Scanner sc = new Scanner(System.in);
    String dados = sc.nextLine();
    System.out.println("Esse aluno é especial?");
    String esp = sc.nextLine();
    return dados;
}









}

    


