
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        if(in!=null)
       return in.trim().split(" ").length ;
     return 0;

        }
    }
        