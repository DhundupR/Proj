import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TokenSystem{
    private int token;
    private String question;
    private int answer;
    private int tokenEarned;
    public TokenSystem(int token){
        Scanner scan = new Scanner(System.in);
        int tokenEarned=0;
        this.token=token;
        question = null;
        answer = 0;
    }
    public void question(){
        int questionNum=randNum(6,1);
        if (questionNum==1){
            questionSetAddition();
        }
        else if(questionNum==2){
            questionSetSubtraction();
        }
        else if(questionNum==3){
            questionSetPower();
        }
        else if(questionNum==4){
            questionSetMulti();
        }
        else if(questionNum==5){
            questionSetWordLength();
        }
        else if (questionNum==6){
            questionSetQuestion();
        }
        else{
            System.out.print("Error");
        }

        System.out.println("--------------------------------------");
        System.out.print("Question: " +question);
        Scanner scan = new Scanner(System.in);
        int userAnswer = scan.nextInt();
        if (userAnswer == answer){
            tokenEarned = randNum(5,1);
            token+=tokenEarned;
            System.out.println("Correct, you earned "+ tokenEarned+ " token");
            System.out.println("--------------------------------------");
        }
        else{
            System.out.println("Wrong, no tokens");
            System.out.println("--------------------------------------");
        }

    }

    public void questionSetAddition(){
        int num1=randNum(1000,1);
        int num2=randNum(1000,1);
        question = "What is "+num1+" + "+num2+"?";
        answer=(num1+num2);
    }
    public void questionSetSubtraction(){
        int num1=randNum(1000,1);
        int num2=randNum(1000,1);
        question = "What is "+num1+" - "+num2+"?: ";
        answer=(num1-num2);
    }
    public void questionSetPower(){
        int num1=randNum(20,1);
        int num2=randNum(5,0);
        question = "What is "+num1+ " to the power of " + +num2+"?: ";
        answer=(int) Math.pow(num1,num2);
    }
    public void questionSetMulti(){
        int num1=randNum(1000,1);
        int num2=randNum(1000,1);
        question = "What is "+num1+" times "+num2+"?: ";
        answer=(num1*num2);
    }
    public void questionSetWordLength(){
        ArrayList<String> pigRelatedWords = new ArrayList<>(Arrays.asList(
                "Piglet", "Sow", "Boar", "Farrow", "Snout", "Trotter", "Grunt", "Oink",
                "Hogwash", "Mud", "Bacon", "Ham", "Pork", "Roast", "Muzzle", "Trough",
                "Sty", "Squeal", "Pen", "Tusk", "Curly tail", "Chop", "Pigskin",
                "Gristle", "Litter", "Tenderloin", "Piggyback", "Piggy bank", "Swill",
                "Slop","Farrowing"));
        String word=pigRelatedWords.get(randNum(30,0));
        question = "How many letters are in the word " + word +":";
        answer= word.length();




    }
    public void questionSetQuestion(){
        int  questionNum2=randNum(5,1);
        if (questionNum2==1){
            question = "What is the average body temperature of a pig?\n1)98.6°\n2)100°F\n3)102°F\n200°F ";
            answer=3;
        } else if(questionNum2==2){
            question = "Which sense is highly developed in pigs for finding food? \n1)Sight\n2)Hearing\n3)Taste\n4)Smell" ;
            answer = 4;

        }
        else if(questionNum2==3){
            question ="How does a pig send secret messages?\n1)Oinks in code\n2)Uses Morse Squeal\n3)English\n4)Writes in Pig Latin";
            answer=4;
        }else if(questionNum2==4){
            question = "In George Orwell's novel Animal Farm, which pig represents the Soviet Union's leader at the time? \n1)Squealer\n2)Old Major\n3)Snowball\n4)Napoleon";
            answer = 4;
        }
        else if(questionNum2==5){
            question = "What is the technical term for the study of pigs? \n1)Porcology\n2)Suiformology\n3)Porcineology\n4)Swinology";

            answer = 2;

        }
    }
    private int randNum(int max, int min){
        return (int)((Math.random()*(max-min+1)+min));
    }
    public int getTokenEarned(){return tokenEarned;}
}