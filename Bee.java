import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A very hungry bee
 * 
 * @author Chen
 * @version May 2022
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            
            Meadows world = (Meadows) getWorld();
            world.createFlower();
            
            world.increaseScore();
        }
    }
}
