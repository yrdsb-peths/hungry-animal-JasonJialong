import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main game world the user plays on
 * 
 * @author Jason Chen
 * @version May 2022
 */
public class Meadows extends World
{
    private boolean lose = false;
    public int score = 0;
    Label scoreLabel;
    
    public Meadows()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Create a new Bee object
        Bee hungryBoy = new Bee();
        addObject(hungryBoy, 100, 300);
        
        //Create a new Bomb object
        Bomb explodyBoy = new Bomb();
        addObject(explodyBoy, 200, 0);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        //Creates a flower
        createFlower();
    }
    
    /**
     * Ends the game and draws 'Game Over' on screen
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        lose = true;
    }
    
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    
    /**
     * Creates a new food at random location at top of the screen
     */
    public void createFlower()
    {
        if (lose == false)
        {
            Flower flower = new Flower();
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(flower, x, y);
        }
    }

}
