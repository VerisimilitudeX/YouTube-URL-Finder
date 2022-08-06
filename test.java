// This class provides methods for accessing a web page. You can create a URLResource by giving it a complete 
// URL, or web address (note, it must start with either http:// or https://):
import edu.duke.URLResource;
import java.util.Dictionary;
import java.util.Hashtable;

// This class finds all the YouTube videos in a web page and returns the URLs of the videos.
public class test {
    public static void testDict() {
        Hashtable<String, Integer> d = new Hashtable<String, Integer>();
        
        d.put("a", 1);
        d.put("b", 2);
        d.put("c", 3);

        for (String key : d.keySet()) {
            System.out.println(key + " " + d.get(key));
        }
        
    }
    public static void main(String[] args) {
         testDict();
    }
}