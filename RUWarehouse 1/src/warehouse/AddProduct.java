package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        

	// Use this file to test addProduct

        int numberOfProducts = StdIn.readInt();

        System.out.println( "numberOfProducts = " + numberOfProducts );

        StdIn.readLine();

        Warehouse warehouse = new Warehouse();

        for ( int i = 0; i < numberOfProducts; i++ ){

            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();

            //System.out.println( "addProduct.java i = " + i );

            StdIn.readLine();

            warehouse.addProduct( id, name, stock, day, demand );

        }
        
        StdOut.print( warehouse );

    }
}
