import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;

public class GravarAluno extends Aluno{

        private static final String arquivo = "bancodados.csv";
    public static void addaluno(){
        int op =0;
        GravarAluno aluno = new GravarAluno();
    while (op ==0) {
        op=2;
        aluno.fromString(aluno.dados());
try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
                while ((linha = leitor.readLine())!= null) {
                    String[] partes = linha.split(",");
        if(aluno.getMatricula()==Integer.parseInt(partes[1])){
            System.out.println("Essa matricula ja existe deseja adicionar outra matricula ou sair?\n"+
                                "-0- Adicionar aluno novamente\n"+
                                "-1- Sair do cadastro de alunos");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            if(op==1){
            return;
            }
    }
} 



}catch (IOException e) {
        e.printStackTrace();
        }

}
                        try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(aluno.toString()+ "\n");
            System.out.println("Aluno adicionado ao banco de dados com sucesso");
            
        }catch (IOException e){
            System.out.println("Algo deu errado, tente novamente");
            }  
    }


public  String dados(){
    
    System.out.println("Insira o nome do aluno");
    Scanner sc = new Scanner(System.in);
    GravarAluno aluno = new GravarAluno();
    aluno.setNome(sc.nextLine());
    System.out.println("Insira a matrícula do aluno");
    aluno.setMatricula(sc.nextInt());
    System.out.println("Insira o curso do aluno");
    sc.nextLine();
    aluno.setCurso(sc.nextLine());
    System.out.println("Esse aluno é especial?");
    
    String a =sc.nextLine();
    if(a.equalsIgnoreCase("sim")){
        aluno.setEspecial(true);
    }else{
        aluno.setEspecial(false);
    }
    
    return aluno.toString();
}
}


    


