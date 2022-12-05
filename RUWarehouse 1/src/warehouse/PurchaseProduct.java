package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test purchaseProduct

    int numberOfLines = StdIn.readInt();

    System.out.println( "numberOfLines = " + numberOfLines );

    StdIn.readLine();

    Warehouse warehouse = new Warehouse();

    for ( int i = 0; i < numberOfLines; i++ ){

        String method = StdIn.readString();

        if ( method.equals( "add" ) ){

            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();

            System.out.println( "AddProduct i = " + i );

            warehouse.addProduct( id, name, stock, day, demand );

        } else if ( method.equals( "purchase" ) ){
            
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            int amount = StdIn.readInt();

            System.out.println( "Purchase i = " + id + " amount = " + amount );

            warehouse.purchaseProduct( id , day , amount );

        }

        StdIn.readLine(); 
    }
    
    StdOut.print( warehouse );

    }
}
