package domain.user;

import domain.Game;
import domain.card.Card;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends User{
    private final String name;
    private final double bettingMoney;
    private final List<Card> cards = new ArrayList<>();

    public Player(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
    }



    // TODO 추가 기능 구현

    public void addCard(Card card){
        cards.add(card);
    }

    public void printNameAndCards(){
        List<String> list = new ArrayList<>();
        String result;

        for(Card card : cards){
            list.add(card.toString());
        }
        result = String.join(",", list);
        System.out.println(name+"카드: "+ result);
    }
    public void printNameAndCardsAndSum(){
        List<String> list = new ArrayList<>();
        String result;

        for(Card card : cards){
            list.add(card.toString());
        }
        result = String.join(",", list);
        System.out.println(name+"카드: "+ result+" - 결과: "+getMinimumSum());
    }
    public int getMinimumSum(){
        int sum = 0;
        for(Card card : cards){
            sum += card.getSymbolValue();
        }
        return sum;
    }
    public String toString(){
        return name;
    }


}
