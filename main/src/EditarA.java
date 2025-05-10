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
        int i=0;
        while(i==0){
    System.out.println("Insira Nome, Matricula ou curso:");
            Scanner sc = new Scanner(System.in);   
            String pesquisaA = sc.nextLine();

            EditarA.pesquisar(pesquisaA,lista);
        if(lista.size()==0){
            System.out.println("nenhum resoltado de pesquisa tente novamente ");}else{
                if(lista.size()==1){
            System.out.println("Deseja alterar os dados desse aluno?");
            System.out.println(lista);
            System.out.println("-0- Não, desejo pesquisar outro aluno\n-1- Sim, desejo alterar esse aluno");
            i=sc.nextInt();
                if(i==0){
                    lista.clear();
                    }else{

                        editor(lista);
                        i=1;
    }
        }else{
            for(String dados : lista){
                System.out.println(dados);
            }
            System.out.println("qual desses nomes deseja editar? responda com o numero de matricula.");
                pesquisaA = sc.nextLine();
                EditarA.pesquisar(pesquisaA,lista);
                    editor(lista);
                    i=1;
            }
        }

    }   
   
}
        
            

       


    public static void editor (ArrayList<String> lista){
        System.out.println(("oque deseja alterar?\n"+
                            "\n-0- Nome"+
                            "\n-1- Matrícula "+
                            "\n-2- Curso"));
    Scanner sc = new Scanner(System.in); 
    int op = sc.nextInt();
    sc.nextLine();
    List<String> linhasED = new ArrayList<>();
        String info = lista.get(0);
        String[] mat = info.split(",");
        System.out.println(mat[1]);
        switch (op) {
            case 0:
                System.out.println("qual o nome novo?");
                String n;
                n = sc.nextLine();
                

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
                while ((linha = leitor.readLine())!= null ) {
                    String[] partes = linha.split(",");
                    String nome = partes[0];
                    String matricula = partes[1];
                    String curso = partes [2];
                        if (mat[1].equals(matricula)){
                            nome = n;
                             linhasED.add(nome+","+matricula+","+curso);
                        }else{

                            linhasED.add(linha);
                    }}}catch (IOException e) {
                        e.printStackTrace();
                    }
                     try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
            for (String linha : linhasED) {
                escritor.write(linha);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("nome alterado com sucesso");
        break;
        case 1:
        System.out.println("Qual a nova matrícula?");
        n = sc.nextLine();

try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
    String linha;
        while ((linha = leitor.readLine())!= null ) {
            String[] partes = linha.split(",");
            String nome = partes[0];
            String matricula = partes[1];
            String curso = partes [2];
                if (mat[1].equals(matricula)){
                    matricula = n;
                     linhasED.add(nome+","+matricula+","+curso);
                }else{

                    linhasED.add(linha);
            }}}catch (IOException e) {
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
    System.out.println("Qual a nova matrícula?");
    n = sc.nextLine();

try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
String linha;
    while ((linha = leitor.readLine())!= null ) {
        String[] partes = linha.split(",");
        String nome = partes[0];
        String matricula = partes[1];
        String curso = partes [2];
            if (mat[1].equals(matricula)){
                curso = n;
                 linhasED.add(nome+","+matricula+","+curso);
            }else{

                linhasED.add(linha);
        }}}catch (IOException e) {
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
}   break;

                default:
                System.out.println("lalala");
                break;
              
            
            
            
            
        
       
       
       
       
     }
    
    
    sc.close();
    }
}




