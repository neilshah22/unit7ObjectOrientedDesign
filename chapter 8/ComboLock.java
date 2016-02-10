public class ComboLock
{
    private int num1;
    private int num2;
    private int num3;
    private int currNum;
    private boolean opened;
    public ComboLock( int secret1, int secret2, int secret3) 
    {
        this.num1 = secret1;
        this.num2 = secret2;
        this.num3 = secret3;
        this.currNum = 0;
    }
    public void reset()
    {
        this.currNum = 0;
    }
    public void turnLeft( int ticks ) 
    {
        this.currNum += ticks;
        while (this.currNum > 40)
        {
            this.currNum -= 40;
        }
    }
    public void turnRight( int ticks ) 
    {
        this.currNum -= ticks;
        while (this.currNum < 0)
        {
            this.currNum += 40;
        }
    }
    public boolean open()
    {
        return opened;
    }
    public int getCurrNum()
    {
        return this.currNum;
    }
}

    