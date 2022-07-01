package quiztemplate;

import java.util.Scanner;
import java.io.IOException;

public class QuizTemplate {

    public static void main(String[] args) throws Exception{
        Scanner entry = new Scanner(System.in);
        Level1 l1 = new Level1();
        Level2 l2 = new Level2();
        int input = 0;
        while(input!=-1){
            System.out.println("Selecione um nivel de dificuldade: \nDigite o numero correspondente (1 ou 2)");
            input = entry.nextInt();
            switch(input){
                case 1:
                    l1.Q1();
                    System.out.println("Voce acertou " + l1.acertos + " questoes.");
                    l1.acertos = 0;
                    break;
                case 2:
                    l2.Q1();
                    System.out.println("Voce acertou " + l2.acertos + " questoes.");
                    l2.acertos = 0;
                    break;
            }

        }
    }

}
