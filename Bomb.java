import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    GreenfootSound beeSound = new GreenfootSound("vine-boom.mp3");
    
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY()+2;
        setLocation(x, y);
        Meadows world = (Meadows) getWorld();
        
        //If at bottom of the screen
        if (getY() >= world.getHeight())
        {
            int o = Greenfoot.getRandomNumber(600);
            int p = 0;
            setLocation(o, p);
        }
        
        //When the game is lost
        if (isTouching(Bee.class))
        {
            beeSound.play();
            removeTouching(Bee.class);
            world.gameOver();
            world.removeObject(this);
        }
    }
}
