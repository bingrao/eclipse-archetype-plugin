package ${package};
import ${package}.utils.Logging;

/**
 * @author 
 */
public class JavaApp {
    public static Log log = new Logging("JavaApp");
    public static void printHello(){
        log.info("Hello World from Java",true);
    }
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        printHello();
    }
}