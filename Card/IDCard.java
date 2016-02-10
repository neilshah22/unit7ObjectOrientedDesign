public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard (String n, String id)
    {
        super(n);
        this.idNumber = id;
    }
    
    public String format()
    {
        String str = super.format();
        str += ", ID Number: " + idNumber;
        return str;
    }
    
    public boolean equals( IDCard otherCard )
    {
        if (this.getClass() == other.getClass())
        {
        IDCard other IDCard
        boolean is equal = super.equals( otherCard );
        return isEqual && this.idNumber.equals( otherCard.idNumber );
    }
}
