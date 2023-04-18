import java.util.Arrays;

public class Strands
{
    // Suggested helper method that prints a character array except the spaces at the end
    public static void printCharArray(char [] array)
    {
        int lastKnownCharIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != ' ')
                lastKnownCharIndex = i;
        }

        for (int i = 0; i <= lastKnownCharIndex; i++)
            System.out.print(array[i]);

        System.out.println();
    }

    public static void straightAndNarrow(String str)
    {
        if (str == null)
        {
            System.out.println("Pshh!");
            return;
        }

        int tmp = str.length();

        if (tmp == 0)
        {
            System.out.println("Pshh!");
            return;
        }

        for (int i = 0; i < tmp; i++)
        {
            if (str.charAt(i) == ' ')
                System.out.println();
            
            else
            {
                System.out.print("  ");
                System.out.println(str.charAt(i));
            }
        }
    }

    public static void straightAndNarrow(String str, int n)
    {
        if (str == null)
        {
            System.out.println("Pshh!");
            return;
        }

        int tmp = str.length();

        if (tmp == 0)
        {
            System.out.println("Pshh!");
            return;
        }

        for (int i = 0; i < tmp; i++)
        {
            if (str.charAt(i) == ' ')
                System.out.println();
            
            else
            {
                for (int k = 0; k < n; k++)
                    System.out.print(" ");

                System.out.println(str.charAt(i));
            }
        }
    }

    public static void meanderingPath(String str)
    {
        if (str == null)
        {
            System.out.println("Pshh!");
            return;
        }

        int tmp = str.length();

        if (tmp == 0)
        {
            System.out.println("Pshh!");
            return;
        }

        String [] meanderingSpaces = new String [] {"  ", "  ", "  ", "   ", "    ", "     ", "     ", "     ", "    ", "   "};

        System.out.print("   ");
        System.out.println(str.charAt(0));

        int k = 1;

        for (int i = 1; i < tmp; i++)
        {
            if (str.charAt(i) == ' ')
            {
                System.out.println();
                k++;

                // Reset k to 0 since the length of the input string
                // might be longer than our meanderingSpaces array
                if (k == meanderingSpaces.length)
                    k = 0;

                continue;
            }

            System.out.print(meanderingSpaces[k]);
            k++;

            if (k == meanderingSpaces.length)
                k = 0;

            System.out.println(str.charAt(i));
        }
    }

    public static int getMaxLength(String [] strings)
    {
        int result = 0;

        for (int i = 0; i < strings.length; i++)
        {
            if (result < strings[i].length())
                result = strings[i].length();
        }

        return result;
    }

    public static double difficultyRating()
    {
        double difficulty = 3.6;
        return difficulty;      
    }

    public static double hoursSpent()
    {
        double hours = 6.8;
        return hours;
    }
}