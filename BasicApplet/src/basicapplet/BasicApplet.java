package basicapplet;

//import Java Swing applet packages
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

/**
 * The Java applet must extend the JApplet class;
 * This is how it inherits the ability to be viewable in a Java-enabled
 * web browser
 * 
 * The Java applet does not need a "main" method
 * 
 * JApplet class has the best compatibility with the Swing packages,
 * according to the Oracle documentation
 */
public class BasicApplet extends JApplet{
    
    /*
    The Applet class has four main "milestone" methods for handling
    an applet's lifecycles. These are init(), start(), stop(), and destroy()
    */
    
    // the init() method is called when the applet is loaded into the browser
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
               public void run() {
                   JLabel label = new JLabel("Hello World");
                   add(label);
               } 
            });
        }
        catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
    
    // the start() method starts the execution of the applet, after init()
    public void start() {
        
    }
    
    // the stop() method suspends the applet's execution while it isn't
    // being interacted with (i.e. a user is not looking at it)
    public void stop() {
        
    }
    
    // the destroy() method shuts down the applet's execution
    public void destroy() {
        
    }
}
