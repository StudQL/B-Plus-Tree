import java.text.DecimalFormat;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {

        // long startTime = System.currentTimeMillis();
        BPlusTree test = new BPlusTree("data.csv", 4);
        // test.add_file("data.csv");
        // long endTime = System.currentTimeMillis();

        // NumberFormat formatter = new DecimalFormat("#0.00000");
        // System.out.println("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        // test.print_Tree();

        test = new BPlusTree("generated_data_sorted.csv", 4);
        test.bulk_loading("generated_data_sorted.csv", 0.7f);
        test.print_Tree();

        test.delete(9);
        test.print_Tree();

        test.delete(4);
        test.print_Tree();

        // startTime = System.currentTimeMillis();
        // Data result = test.search(543);
        // endTime = System.currentTimeMillis();
        // System.out.println("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        
        // System.out.println(result);

        

        // startTime = System.currentTimeMillis();
        // test = new BPlusTree("generated_data_sorted.csv", 4);
        // test.bulk_loading("generated_data_sorted.csv", 1f);
        // endTime = System.currentTimeMillis();

        
        // formatter = new DecimalFormat("#0.00000");
        // System.out.println("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        // test.print_Tree();


    }
}