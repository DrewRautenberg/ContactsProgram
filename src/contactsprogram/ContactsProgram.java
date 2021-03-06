/* PROJECT:  ContactsProgram
 * AUTHOR:  Kaminski   Modified: Drew Rautenberg
 *      Add code to THIS module, and uncomment the appropriate code here in
 *      THIS controller program/class to make the project work.
 * IMPORTANT:  See ContactUML.txt in project folder.
 ****************************************************************************/
package contactsprogram;

import javax.swing.JOptionPane;

public class ContactsProgram {

    public static void main(String[] args) {

        // DECLARE TWO OBJECT, person1 and person2, of Contact CLASS TYPE
        Contact person1 = new Contact();
        Contact person2 = new Contact();

        //GET DATA & STORE IT
        String name;
        long phone;

        //person 1
        name = JOptionPane.showInputDialog("Enter name");
        phone = Long.parseLong(JOptionPane.showInputDialog("Enter phone for " + name + " (just 10 digits)"));
        person1.setName(name);
        person1.setPhone(phone);

        //person 2
        name = JOptionPane.showInputDialog("Enter name");
        phone = Long.parseLong(JOptionPane.showInputDialog("Enter phone for " + name + " (just 10 digits)"));
        person2.setName(name);
        person2.setPhone(phone);

        //TEST CLASS'S METHODS
        testClassMethods(person1);
        testClassMethods(person2);
        //FINISH UP
        System.out.println("\nTHE END");
        System.exit(0);
    }

    //TEST CLASS'S METHODS
    private static void testClassMethods(Contact personOut) {

        System.out.printf("name is %s (starts with %c), phone (plain) is %d\n",
                personOut.getName(), personOut.getInitial(), personOut.getPhone());

        System.out.printf("area code is %d, local number is %d\n",
                personOut.findAreaCode(), personOut.findLocalNumber());

        System.out.printf("%s's phone number (nicely formatted) is : %s\n",
                personOut.getName(), personOut.nicelyFormatPhone());

        // <<WRITE THE METHOD BELOW BEFORE UNCOMMENTING THE FOLLOWING>>
        if (personOut.is269AreaCode())
            System.out.println("The phone number is IN SW MICHIGAN");
        else
            System.out.println("The phone number is NOT IN SW MICHIGAN");

        // Call the method to have OBJECT SHOW ITS OWN stored data values
        personOut.displayData();

        System.out.println(personOut);
    }
}
