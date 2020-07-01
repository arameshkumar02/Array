public class SpecificValue
{
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 1;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
            }
        }

        if(found)
            System.out.println(toFind + " is Specific Value.");
        else
            System.out.println(toFind + " is not Specific Value.");
    }
}

