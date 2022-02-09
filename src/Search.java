import java.util.ArrayList;

public class Search
{
    public static int linearSearchArrayList(ArrayList<Integer> elements, int target)
    {
        for(int n = 0; n < elements.size();n++)
        {
            if(elements.get(n) == target)
            {
                return n;
            }
        }
        return -1;
    }

    public static int linearSearch(String[] elements, String target)
    {
        for(int n = 0; n < elements.length;n++)
        {
            if(elements[n].equals(target))
            {
                return n;
            }
        }
        return -1;
    }
}
