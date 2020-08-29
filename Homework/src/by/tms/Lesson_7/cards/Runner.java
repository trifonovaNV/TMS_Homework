package by.tms.Lesson_7.cards;

/*
Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Card alfaCard = new AlfabankCard("Trifonova Nadya");
        Card bpsCard = new BPSbankCard("Rahlina Anna");
        Card belCard = new BelarusbankCard("Berkovich Pavel");

        ForeignAlfaCard foreignAlfaCard = new ForeignAlfaCard("Volovich Artyom", "RUB");
        ForeignBPSCard foreigBPSCard = new ForeignBPSCard("Stashenko Ksusha", "EUR");
        ForeignBelarusCard foreignBelCard = new ForeignBelarusCard("Zalomov Daniil", "BYN");


        Card[] cards = {alfaCard, bpsCard, belCard, foreignAlfaCard, foreigBPSCard, foreignBelCard};
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
        System.out.println();

        alfaCard.withdrawMoney(150);
        bpsCard.withdrawMoney(100);
        belCard.withdrawMoney(200);

        foreigBPSCard.withdrawMoney(400);
        foreignAlfaCard.withdrawMoney(500);
        foreignBelCard.withdrawMoney(180);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        foreignAlfaCard.chooseCurrency(scanner);

        scanner.close();
    }
}
