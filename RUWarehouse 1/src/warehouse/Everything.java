// package warehouse;

// /*
//  * Use this class to put it all together.
//  */ 
// public class Everything {
//     public static void main(String[] args) {
//         StdIn.setFile(args[0]);
//         StdOut.setFile(args[1]);

// 	// Use this file to test all methods

//     int numberOfLines = StdIn.readInt();

//     System.out.println( "numberOfLines = " + numberOfLines );

//     StdIn.readLine();

//     Warehouse warehouse = new Warehouse();

//     for ( int i = 0; i < numberOfLines; i++ ){

//         String method = StdIn.readString();

//         if ( method.equals( "add" ) ){

//             int day = StdIn.readInt();
//             int id = StdIn.readInt();
//             String name = StdIn.readString();
//             int stock = StdIn.readInt();
//             int demand = StdIn.readInt();

//             System.out.println( "AddProduct i = " + i );

//             warehouse.addProduct( id, name, stock, day, demand );

//         } else if ( method.equals( "purchase" ) ){
            
//             int day = StdIn.readInt();
//             int id = StdIn.readInt();
//             int amount = StdIn.readInt();

//             System.out.println( "Purchase i = " + id + " amount = " + amount );

//             warehouse.purchaseProduct( id , day , amount );

//         } else if ( method.equals( "delete" ) ){

//             int id = StdIn.readInt();

//             System.out.println( "Delete i = " + id + " amount = " );

//             warehouse.deleteProduct( id );

//         } else if ( method.equals( "restock" ) ){

//             int id = StdIn.readInt();
//             int amount = StdIn.readInt();

//             System.out.println( "Restock i = " + id + " amount = " + amount );

//             warehouse.restockProduct( id , amount );

//         }
//         StdIn.readLine();
//     }
    
//     StdOut.print( warehouse );

//     }
// }


package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        int numberOfInputs = StdIn.readInt();
        int count = 0;
        Warehouse w = new Warehouse();
        while(count < numberOfInputs){
            String type = StdIn.readString();
            if(type.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            }
            else if(type.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                w.restockProduct(id, amount);
            }
            else if(type.equals("delete")){
                int id = StdIn.readInt();
                w.deleteProduct(id);
            }
            else{ //purchase
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                w.purchaseProduct(id, day, amount);
            }
            count++;
        }
        StdOut.println(w);

	// Use this file to test all methods
    }
}
