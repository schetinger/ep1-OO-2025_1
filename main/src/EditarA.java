import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class EditarA {

    private static final String arquivo = "dadoalunos.csv";

    public static void pesquisar (ArrayList lista, String pesquisaA, String linha){

        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            while((linha = leitor.readLine())!= null){

                if(linha.contains(pesquisaA)){
                    lista.add(linha);
            }
        
         }
         if(lista.size()==0){
            linha = String.join(",",lista);
         }
    }catch(IOException e){
            System.out.println("Erro ao listar os alunos tente novamente.");}
    }


    public static void editar(){
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Insira Nome, Matricula ou curso:");
        Scanner sc = new Scanner(System.in); 
        String linha= "";   
        String pesquisaA = sc.nextLine();

        EditarA.pesquisar(lista,pesquisaA,linha);
        if(lista.size()==1){
            System.out.println(linha);
            editor(linha);
        }else{
            for(String dados : lista){
                System.out.println(dados);
            }
            System.out.println("qual desses nomes deseja editar? responda com o numero de matricula.");
        pesquisaA = sc.nextLine();
        EditarA.pesquisar(lista,pesquisaA,linha);
        editor(linha);
        }
            

       

    }
    public static void editor (String info){
        System.out.println(("oque deseja alterar?\n"+
                            "\n-0- Nome"+
                            "\n-1- Matrícula "+
                            "\n-2- Curso"));
    Scanner sc = new Scanner(System.in); 
    int op = sc.nextInt();
        String[] dados = info.split(",");

        switch (op) {
            case 0:
                System.out.println("qual o nome novo?");
                String n;
                n = sc.nextLine();
                 List<String> linhasED = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
                while ((linha = leitor.readLine())!= null ) {
                    String[] partes = linha.split(",");
                    String nome = partes[0];
                    String matricula = partes[1];
                    String curso = partes [2];
                        if (nome.equalsIgnoreCase(dados[0])){
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
        }break;
            
                default:
                System.out.println("lalala");
                break;
              
            
            
            
            
        }
       
       
       
       
     }
    
    
    
}




