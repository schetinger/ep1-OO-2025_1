import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EditarA {

    private static final String arquivo = "bancodados.csv";

    public static void pesquisar (String pesquisaA,ArrayList<String> dados){
        String linha;
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
          while ((linha=leitor.readLine())!= null) {
            if(linha.contains(pesquisaA)){
                dados.add(linha);
            }
            
          }
    }catch(IOException e){
            System.out.println("Erro ao listar os alunos tente novamente.");}
   
    }


    public static void editar(){
        ArrayList<String> lista = new ArrayList<>();
        Aluno aluno = new Aluno();
        while(true){
    System.out.println("Insira Nome, Matricula ou curso:");
            Scanner sc = new Scanner(System.in);   
            String pesquisaA = sc.nextLine();

            EditarA.pesquisar(pesquisaA,lista);
        if(lista.size()==0){
            System.out.println("nenhum resultado de pesquisa tente novamente ");}
            else{
                if(lista.size()==1){
            aluno.fromString(lista.toString());
            System.out.println("Deseja alterar os dados desse aluno?");
            System.out.println(lista);
            System.out.println("-0- Não, desejo pesquisar outro aluno\n"+
                                "-1- Sim, desejo alterar esse aluno\n"+
                                "-2- Cancelar busca e voltar pro modo aluno");
            int i=sc.nextInt();
            switch (i) {
                case 0:
                lista.clear();
                    break;
                case 1:
                aluno.fromString(lista.toString());
                editor(aluno);
                return;
                case 2:
                return;
                default:
                System.out.println("dado invalido");
                    break;
            }
        }else{
            for(String dados : lista){
                System.out.println(dados);
            }
            System.out.println("qual desses nomes deseja editar? responda com o numero de matricula.");
                int mat = sc.nextInt();
                LerAluno.listarAlunos(mat,aluno);
                    editor(aluno);
                    return;

            }
        }

    }   
   
}
        
            

       


    public static void editor (Aluno aluno){
        System.out.println(("oque deseja alterar?\n"+
                            "\n-0- Nome"+
                            "\n-1- Matrícula "+
                            "\n-2- Curso"));
    Scanner sc = new Scanner(System.in); 
    int op = sc.nextInt();
    sc.nextLine();
    Aluno ler = new Aluno();
    List<String> linhasED = new ArrayList<>();
        switch (op) {
            case 0:
                System.out.println("qual o nome novo?");
                aluno.setNome(sc.nextLine());
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
                while ((linha = leitor.readLine())!= null ) {
                        ler.fromString(linha);

                        if (aluno.getMatricula()==ler.getMatricula()){
                             linhasED.add(aluno.toString());

                        }else{
                            linhasED.add(linha);

                    }
}}catch (IOException e) {
                        e.printStackTrace();
                    }

try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
            for (String linha : linhasED) {
                escritor.write(linha);
                escritor.newLine();
            }

}catch (IOException e) {
            e.printStackTrace();
}
        System.out.println("nome alterado com sucesso");
break;
        case 1:
        System.out.println("Qual a nova matrícula?");
        int mat = sc.nextInt();

try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
    String linha;
        while ((linha = leitor.readLine())!= null ) {
                        ler.fromString(linha);
                if (aluno.getMatricula()==ler.getMatricula()){
                    aluno.setMatricula(mat);
                     linhasED.add(aluno.toString());
                }else{
                    linhasED.add(linha);
            }
        }
}catch (IOException e) {
                e.printStackTrace();
}
try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
            for (String linha : linhasED) {
                 escritor.write(linha);
                    escritor.newLine();
}
} catch (IOException e) {
    e.printStackTrace();
}  System.out.println("matricula alterado com sucesso");

break;
    case 2:
    System.out.println("Qual o novo curso?");
    aluno.setCurso(sc.nextLine());
try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
String linha;
    while ((linha = leitor.readLine())!= null ) {
                        ler.fromString(linha);
            if (aluno.getMatricula()==ler.getMatricula()){
                 linhasED.add(aluno.toString());
            }else{
                linhasED.add(linha);
        }
    }
}catch (IOException e) {
            e.printStackTrace();
        }
try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
            for (String linha : linhasED) {
            escritor.write(linha);
            escritor.newLine();
}
} catch (IOException e) {
e.printStackTrace();
    System.out.println("Curso alterado com sucesso.");
}   
break;

                default:
                System.out.println("lalala");
                break;
              
            
            
            
            
        
       
       
       
       
     }
    }
}




