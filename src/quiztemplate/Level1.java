package quiztemplate;

import java.util.Scanner;
import java.io.IOException;

public class Level1 {
    static Scanner sc = new Scanner(System.in);
    static char resposta;
    static int acertos = 0;

    //Questão 1
    public static void Q1()throws IOException{//Esta função pode ser repetida para quantas perguntas forem necessárias
        char correta = 'A';//modificar para a resposta correta
        System.out.println("Questão 1: Escrever Pergunta aqui.");//caso precisar de quebra de linha, fazer outro System.out
        System.out.println("A) Resposta A.");//colocar as alternativas desejadas
        System.out.println("B) Resposta B.");
        System.out.println("C) Resposta C.");
        System.out.println("D) Resposta D.");
        System.out.println("\nDigite apenas a letra da sua resposta: ");
        resposta = sc.next().charAt(0);
        resposta = Character.toUpperCase(resposta);
        if(resposta == correta){
            acertos++;
            System.out.println("Correto!");
        }
        else{
            System.out.println("Errado! A resposta correta era: " + correta);
        }
        System.out.println("Aperte enter para ir para a proxima pergunta");
        new Scanner(System.in).nextLine();
        Q2();//chama a função da próxima questão
    }
    
    public static void Q2()throws IOException{
        
    }

}
