import javax.swing.JOptionPane;
public class Ch1E_9DialogViewer3 
{

    public static void main(String[] args) 
    {
        String name;
    	name=JOptionPane.showInputDialog("What is your name?");
        //System.out.print("Hello, ");
        //System.out.print(name);
        //System.out.println("!");
    	JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        
    	String HALsGreeting;
    	String task;
        HALsGreeting="My name is HAL! What would you like me to do?";
        task=JOptionPane.showInputDialog(HALsGreeting);
        //System.out.print("I'm sorry, ");
        //System.out.print(name);
        //System.out.println(". I'm afraid I can't do that.");
        JOptionPane.showMessageDialog(null, "I am sorry " + name + " I can not " + task + ".");
    }

}
