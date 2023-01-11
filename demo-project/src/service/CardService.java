package service;

import model.Card;

import java.util.UUID;

public class CardService implements BaseService{

    private Card cardList[]=new Card[100];
    private int index=0;
    private  int sana=0;



//    public boolean addCard(final Card card){
//
//        return true;
//    }


    public int cntCards(UUID userId){
        int cnt=0;
        for (Card card : cardList) {
            if(card != null){
                if(card.getUserId().equals(userId)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public Card[] getUserCardList(final UUID userId){
       Card card[] = new Card[cntCards(userId)];
       int cnt=0;
        for (Card card1: card) {
            if(card1!=null){
                if(card1.getUserId().equals(userId)){
                 card[cnt++]=card1;
                }
            }
        }
        return card;
    }

    @Override
    public boolean add(Object object) {
        Card card= (Card) object;
        for (Card card1: cardList) {
            if(card1!=null){
                if(card1.getCardNumber().equals(card.getCardNumber())){
                    return  false;
                }
            }
        }
        cardList[index++]=card;
        return true;
    }
}
