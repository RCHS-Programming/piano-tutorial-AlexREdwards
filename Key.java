import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    /**
     * Create a new key.
     */
    public Key()
    {
        isDown = false;
    }
    public Key(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
         if ( !isDown && Greenfoot.isKeyDown (key))
         {
              setImage ("white-key-down.png"); 
              play ();
              isDown = true;
         }
         if(isDown && !Greenfoot.isKeyDown (key))
         {
               setImage ("white-key.png");
               isDown = false;
         }
    }
    public void play()
    {
        Greenfoot.playSound(sound);
    }
}