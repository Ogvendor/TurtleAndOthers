import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Phonebook {

    public static void main(String[] args) {

        ArrayList<String> contactName = new ArrayList<String>();
        ArrayList<String> address    = new ArrayList<String>();
        ArrayList<String> phoneNumber = new ArrayList<String>();
        ArrayList<String> email = new ArrayList<String>();

        String quit = "";

        while(quit.isBlank()){
            String name = JOptionPane.showInputDialog("Enter contactName");
            contactName.add(name);

            String caddress = JOptionPane.showInputDialog("Enter address:");
            address.add(caddress);

            String pNumber = JOptionPane.showInputDialog("Enter PhoneNumber:");
            phoneNumber.add(pNumber);

            String emailid = JOptionPane.showInputDialog("Email:");
            email.add(emailid);

            quit =  JOptionPane.showInputDialog("Enter X to Quit");

        }

        System.out.println("Name: " + contactName + "\n" +
                "Address: " + address +"\n" +
                "PhoneNumber: " + phoneNumber + "\n" +
                "Email: " + email + "\n");
    }
}
