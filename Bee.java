import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A very hungry bee
 * 
 * @author Chen
 * @version May 2022
 */
public class Bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound("Scream+22.mp3");
    
    public void act()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(4);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            move(-4);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            int x = getX();
            int y = getY()+2;
            setLocation(x, y);
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            int x = getX();
            int y = getY()-2;
            setLocation(x, y);
        }
        
        eat();
    }
    
    public void eat()
    {
        if (isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            beeSound.play();
            
            Meadows world = (Meadows) getWorld();
            world.createFlower();
            
            world.increaseScore();
        }
    }
}
