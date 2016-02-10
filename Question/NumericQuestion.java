public class NumericQuestion extends Question
{
    private double answer;
    
    //this is an example of method overloading 
    //This method overloads the setAnswer method of the Question class
    public void setAnswer(double correctResponse )
    {
    }
    
    //this is an example of method overriding
    //This method overrides the checkAnswer method of the question class
    public boolean checkAnswer( String response )
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer ) <= 0.1;    
    }
}
   