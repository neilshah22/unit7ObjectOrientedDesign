import java.util.Calendar;
import java.util.GregorianCalendar;
public class driversLicence extends Card
{
    private int expirationYear;
    
    public driversLicence( String n, int expYear )
    {
        super(n);
        this.expirationYear = expYear;
    }
    public String format()
    {
        String str = super.format();
        str += "Expiration Year: " + expirationYear;
        return str;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (this.expirationYear < calendar.get(Calendar.YEAR))
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
}
