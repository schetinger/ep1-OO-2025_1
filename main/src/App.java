import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo, escolha o modo:\n -0- Modo aluno\n -1- Modo disciplina \n -2- Modo Avaliação");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
    switch(opcao){
        case(0):
           Aluno.aop(opcao);
    }
}
}
