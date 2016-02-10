import java.util.Scanner;
/*this class supports a fill-in-the-blank question where the answer is speacified in 
 * the questions thes 
 */
public class FillInQuestion extends Question
{
    /*
     * Extracts the answer from the specified question text.
     */
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "___________" + parser.next();
        
        super.setText( question );
        this.setAnswer( answer );
    }
}