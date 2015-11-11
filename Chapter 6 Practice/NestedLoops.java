public class NestedLoops
{
    public static void nestedForLoops()
    {
        /*
         * 1 1
         * 1 2
         * 1 3
         * 1 4
         * 2 1
         * 2 2
         * 2 3
         * 2 4
         */
        
        for( int leftcolumn = 1; leftcolumn <= 2; leftcolumn++ )
        {
            for( int rightcolumn = 1; rightcolumn <= 4; rightcolumn++ )
            {
                System.out.println( leftcolumn + " " + rightcolumn );
            }
        }
    }
}