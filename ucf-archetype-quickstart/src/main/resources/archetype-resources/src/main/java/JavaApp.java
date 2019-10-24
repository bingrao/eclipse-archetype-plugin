package ${package};
import ${package}.utils.Log;

/**
 * @author 
 */
public class JavaApp {
    public static Log log = new Log("JavaApp");
    public static void printHello(){
        log.info("Hello World from Java");
    }
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        printHello();
    }
}