package warehouse;

/*
 * Use this class to test the betterAddProduct method.
 */ 
public class BetterAddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        
        // Use this file to test betterAddProduct
        
                int numberOfInputs = StdIn.readInt();
                int count = 0;
                Warehouse w = new Warehouse();
                while(count < numberOfInputs){
                    int day = StdIn.readInt();
                    int id = StdIn.readInt();
                    String name = StdIn.readString();
                    int stock = StdIn.readInt();
                    int demand = StdIn.readInt();
                    w.betterAddProduct(id, name, stock, day, demand);
                    count++;
                }
                StdOut.println(w);

    }
}
