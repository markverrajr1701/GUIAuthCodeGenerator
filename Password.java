import java.util.ArrayList;

/**
 * @author Mark Verra
 * @version May 2022
 */
public class Password {
    private String firstLetter;
    private String secondLetter;
    private int num;

    private java.util.List<String> GREEK_LETTERS;

    public Password(String firstLetter, String secondLetter, int num){
        this.firstLetter = firstLetter;
        this.secondLetter = secondLetter;
        this.num = num;
    }

    // ACCESSORS
    public String getFirstLetter()
    {
        return firstLetter;
    }

    public String getSecondLetter()
    {
        return secondLetter;
    }

    public int getNum()
    {
        return num;
    }

    // MUTATORS
    public void setFirstLetter(String newFirstLetter)
    {
        firstLetter = newFirstLetter;
    }

    public void setSecondLetter(String newSecondLetter)
    {
        secondLetter = newSecondLetter;
    }

    public void setNum(int newNum)
    {
        num = newNum;
    }

    @Override
    public String toString()
    {
        return firstLetter + num + secondLetter;
    }
}
