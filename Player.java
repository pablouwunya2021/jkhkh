import greenfoot.*;

public class Player extends Actor {
    
    public void act() {
        move(4);
        if(Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if(isTouching(Coin.class)) {
            removeTouching(Coin.class);
        }
    }
}


