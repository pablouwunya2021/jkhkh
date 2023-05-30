import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {    
        super(600, 400, 1); 
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);

        for(int i = 0; i < 10; i++) {
            Coin coin = new Coin();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(coin, x, y);
        }
    }
}
