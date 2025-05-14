import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GravarD extends Disciplina {
     
private static final String arquivo = "bancodisciplinas.csv";
    public static void gravar(){
      int op=0;
      do{
 System.out.println("Insira a disciplina no formato: nome,código,créditos,pré-requisitos (código da matéria,caso nao tenha pré-requesitos coloque 0) ");
        Scanner sc=new Scanner(System.in);
        String disc=sc.nextLine();
        String[] teste=disc.split(",");
        if(teste[3].equals("0")){
          op= duplicidade(disc);
        switch (op) {
            case 0:
                
                break;
            case 1:
            return;
            case 2:
            escrever(disc);
            break;
            default:
                break;
        }
}else{
    op=prereq(disc);
    switch (op) {
        case 0:
            
            break;
        case 1:
        return;
        case 2:
        escrever(disc);
        default:
            break;
    }
}

}while(op==0);
}

 public static int duplicidade(String disc){
    String[] teste=disc.split(",");
    Scanner sc = new Scanner(System.in);
    int op=2;
    try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                String[] partes = linha.split(",");
                if(teste[1].equals(partes[1])){
                    System.out.println("Esse codigo de disciplina ja existe.\n"+
                                        "-0- Inserir outra disciplina\n"+
                                        "-1- Sair para modo disciplina");
                        op = sc.nextInt();
                }
            }
 }catch(IOException e){
            System.out.println("Erro ao listar os disciplinas tente novamente.");
        }
        return op;
}

public static void escrever(String disc){
    try(BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo,true))){
            escrever.write(disc+"\n");
            System.out.println("Disciplina adicionado ao banco de dados com sucesso");
        }catch (IOException e){
            System.out.println("Algo deu errado, tente novamente");
            }
}
public static int prereq(String disc){
String[] teste=disc.split(",");
    Scanner sc = new Scanner(System.in);
    try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                String[] partes = linha.split(",");
                if(teste[3].equals(partes[1])){
                    return 2;
                }
            }
 }catch(IOException e){
            System.out.println("Erro ao listar os disciplinas tente novamente.");
        } 
        System.out.println("Pré-requisito não encontrado.\n"+
                            "-0- Adicionar outra disciplina\n"+
                            "-1- Sair para o modo disciplinas");
            int op = sc.nextInt();
        return op;
        
}
}







