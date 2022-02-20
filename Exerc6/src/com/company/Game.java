package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Question> questionSet;

    public Game() {
        //Lista de questões declaradas para o Quizz
        questionSet = new ArrayList<Question>();
        String q = "Quem descobriu o Brasil?";
        String[] a = {"Pedro Alvares Cabral", "Ronaldinho Gaucho", "Barack Obama", "Sheila Mello"};
        questionSet.add(new Question(q, a, "Pedro Alvares Cabral"));
        q = "Qual a cor de uma uva?";
        a = new String[]{"Amarelo", "Azul", "Roxo", "Branca"};
        questionSet.add(new Question(q, a, "Roxo"));
        q = "Qual a capital do Brasil?";
        a = new String[]{"São Paulo", "Brasília", "Rio de Janeiro", "Salvador"};
        questionSet.add(new Question(q, a, "Brasília"));
        q = "Quantos lados tem um quadrado?";
        a = new String[]{"Um", "Dois", "Três", "Quatro"};
        questionSet.add(new Question(q, a, "Quatro"));
        Collections.shuffle(questionSet, new Random());
    }

    public void start(){
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        int numError = 0;
        //Listagem de questões na tela do usuário e comparação das respostas com a resposta correta
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();

            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + " :" + questionSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex + 1){
                System.out.println("Você acertou!");
                numCorrect++;
            }
            else{
                System.out.println("Você errou, leia com mais calma!");
                numError++;
            }
        }
        scan.close();
        //Mensagem final, mostrando o número de acertos e erros do Quizz
        System.out.println("Voce acertou " + numCorrect + " questõe(s) e errou " + numError + " questõe(s)");

    }
}