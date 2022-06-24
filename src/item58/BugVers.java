package item58;

import java.util.*;

enum Suit{
    CLUB, DIAMOND, HEART, SPADE
}

enum Rank{
    ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

enum Face{
    ONE, TWO, THREE, FOUR, FIVE, SIX
}

class Card{
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}

public class BugVers {
    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());
    static Collection<Face> faces = EnumSet.allOf(Face.class);

    public static void main(String[] args){
        List<Card> deck = new ArrayList<>();
        /**
         * 버그 발생.
         * @throws NoSuchElementException (next 로 인한 범위 초과)
         */
        for(Iterator<Suit> i = suits.iterator(); i.hasNext();){
            for(Iterator<Rank> j = ranks.iterator(); j.hasNext();){
                deck.add(new Card(i.next(), j.next()));
            }
        }

        /**
         * 예외를 던지지 않지만, 원하는 값을 출력할 수 없다.
         */
        for(Iterator<Face> i = faces.iterator(); i.hasNext();){
            for(Iterator<Face> j = faces.iterator(); j.hasNext();){
                System.out.println(i.next() + " " + j.next());
            }
        }

        /**
         * 컬렉션이나 배열의 중첩 반복을 위한 권장 관용구
         */
        for(Suit suit : suits){
            for (Rank rank : ranks){
                deck.add(new Card(suit, rank));
            }
        }
    }
}
