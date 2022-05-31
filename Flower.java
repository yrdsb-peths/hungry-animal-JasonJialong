import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the bee
 * 
 * @author Jason Chen
 * @version May 2022
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY()+2;
        setLocation(x, y);
        
        //When the bee misses the flower
        Meadows world = (Meadows) getWorld();
        if (getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createFlower();
        }
    }
}
