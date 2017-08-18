/**
 * A GC micro benchmark  create  objects  and dereference them immediately
 *
 * @author IT-huang
 */
public class GarbageOnly {

    private static final int DEFAULT_OBJECTSIZE=100;
    private static int objectSize=DEFAULT_OBJECTSIZE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long i,j;
        int osize = objectSize;
        for(i=300000;i>0;i--)
        {
                for(j=10000;j>0;j--)
                {
                        // create character arrays 
                        char[] garbageObject = new char[osize];
                }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("cost time :" + (endTime - startTime) + "ms");
        System.exit(0);
    }

}
