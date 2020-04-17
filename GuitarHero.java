package Strategy_Pattern;
import Strategy_Pattern.GameCharacter.*;
import Strategy_Pattern.Guitar.*;
import Strategy_Pattern.SoloBehavior.*;

public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash(); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterAngus();
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();
        
        //add code below to show the swapping of behaviors
        System.out.println("\nAnd now we mix it up\n");
        
        player1.setGuitar(new GibsonFlyingV());
        player2.setSolo(new SoloBehaviorSmash());
        player3.setGuitar(new GibsonSG());
        player3.setSolo(new SoloBehaviorJump());
        
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();
    }
}