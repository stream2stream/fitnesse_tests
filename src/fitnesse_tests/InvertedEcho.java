/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fitnesse_tests;

/**
 *
 * @author selvyn
 */
public class InvertedEcho
{
    private String  itsOriginalText;
    //private String  itsInvertedText = "NIL";

    public  InvertedEcho()
    {

    }

    public  void setOriginalText( String text )
    {
        itsOriginalText = text;
    }

    public  String InvertedText()
    {
        StringBuilder result = new StringBuilder();

        for( int i = itsOriginalText.length()-1; i >= 0; i-- )
            result.append( itsOriginalText.charAt(i) );

        return result.toString();
    }

}
