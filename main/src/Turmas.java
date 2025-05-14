import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Turmas extends Disciplina{
     private static final String arquivo = "bancoturmas.csv";
    private String prof,avaliacao,hora,tipo;
    private int semestre,sala,capacidade;
    public String getTipo(){
        return tipo;
    }
    public String getprof(){
        return prof;
    }
        public String getavaliacao(){
        return avaliacao;
    }
        public String gethora(){
        return hora;
    }
    public int getSemestre(){
        return semestre;
    }
       public int getSala(){
        return sala;
    }
       public int getCapacidade(){
        return capacidade;
    }
    public void setProf(String prof){
        this.prof=prof;
    }
        public void setAvaliacao(String ava){
        this.avaliacao=ava;
    }
        public void setHora(String hora){
        this.hora=hora;
    }
    public void setSemestre(int sem){
        this.semestre=sem;
    }
        public void setSala(int sala){
        this.sala=sala;
    }
        public void setCapacidade(int capacidade){
        this.capacidade=capacidade;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    @Override
    public String toString(){
        return getcodigo()+","+prof+","+semestre+","+avaliacao+","+tipo+","+sala+","+hora+","+capacidade;
    }
    @Override
    public void fromString(String info){
       String[]  partes=info.split(",");
    setCodigo(partes[0]);
    this.prof=partes[1];
    this.semestre=Integer.parseInt(partes[2]);
    this.avaliacao=partes[3];
    this.tipo=partes[4];
    this.sala=Integer.parseInt(partes[5]);
    this.hora=partes[6];
    this.capacidade=Integer.parseInt(partes[7]);
    }
    public static void listarT(){
        Turmas turma = new Turmas();
        Scanner sc = new Scanner(System.in);
System.out.println("Insira o código ou o nome da disciplina desejada:");
        String pesquisa = sc.nextLine();
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine())!= null){
                turma.fromString(linha);
               if(linha.contains(pesquisa)){
                 System.out.println("Matéria: "+turma.getcodigo()+
                                    " Professor: "+turma.getprof()+
                                    " Semetre "+turma.getSemestre()+"°"+
                                    " Forma de avaliação: "+turma.getavaliacao()+
                                    " Aula "+ turma.getTipo()+
                                    " Sala "+turma.getSala()+
                                    " Horario: "+turma.gethora()+
                                    " Capacidade: "+ turma.getCapacidade());
               }
            }
        }
        catch(IOException e){
            System.out.println("Erro ao listar os alunos tente novamente.");
        }
}
}
