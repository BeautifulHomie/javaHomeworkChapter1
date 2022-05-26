import javax.swing.JOptionPane;
public class Ch1E_8DialogViewer2 
{

    public static void main(String[] args) 
    {
    	String name;
        name = JOptionPane.showInputDialog("What is your name?");
        //System.out.print("Hello, ");
        //System.out.print(name);
        //System.out.print("!");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }

}
