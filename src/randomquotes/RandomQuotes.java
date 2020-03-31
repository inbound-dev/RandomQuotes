/*
 * This Program was Created by Jordan on March 31, 2020
 * This Program takes quotes from a text documnet and stores in an array then prints a random one
 */
package randomquotes;
import java.util.*;
import java.io.*;

/**
 *
 * @author Jordan Hamilton
 */
public class RandomQuotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        File file = new File("E:\\Coding\\RandomQuotes\\src\\randomquotes\\Quotes.txt");
        
        String quotes[] = {"", "" ,"", "" ,"", "" ,"", "" ,"", ""};
        
        Random randint = new Random();
        int num = randint.nextInt(9);
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
        
            for(int i = 0; i < 9; i++){
                text = reader.readLine();
                quotes[i] = text;
            }
        System.out.println(quotes[num]);
        }
        catch(IOException ex){
            System.out.println("Sorry that file is not found");
        }
    }
    
}
