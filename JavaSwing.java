// Now that you know the fundamental of Java, let's look into a commonly
// used library in Java: Swing!
// Firstly, what is Java Swing?
// It's a library that will allow us to create a user interface!
// Graphics!
// Similar to importing Scanner, we will import the Swing API
import javax.swing.*;
// Now let's add our usual header
public class JavaSwing
{
    public static void main(String[] args)
    {
        // We now get access to things like JFrame and JButton!
        // Let's demonstrate
        // Similar to Scanner, we are creating a new instance of JFrame
        JFrame jframe = new JFrame();
        // Let's do that for JButton as well
        JButton jbutton = new JButton();

        // JFrame is what holds elements of the screen
        // JButton is one of the elements of the screen
        // This means we need to place JButton into JFrame!
        jbutton.setBounds(50, 50, 100, 50);
        // JButton has a variety of methods, so look into it to see what you can
        // come up with
        
        // Now we want to actually add the button to the frame
        jframe.add(jbutton);

        // JButton is only the beginning
        // Let's try something a little more advanced, as we'll get you on a task!
        JSlider jslider = new JSlider(0, 5);
        jframe.add(jslider);
        jslider.setBounds(100, 100, 100, 100);

        // Wait, this is easy! Why did I classify this as advanced?
        // The reason is, we only looked at the tip of the iceberg
        // There is so much to do with JSlider, and since it is more "functional"
        // as compared to JButton, with it comes many ways to manipulate its
        // functions
        // For example, you can get the value the user sets for the slider, and separate
        // the functions of JSlider into different Java functions
        // You can change how JSlider reacts and the consequences of setting
        // JSlider to a certain value
        // Since there's so much to explore, let's put you on a task
        
        // Task: create a button that activates a JSlider when the user clicks
        // on it. Once the slider is activated, turn the button green if the slider's
        // value is set to 5.

        // Before we run the program, we need to set some properties of the frame
        jframe.setSize(500, 500);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}