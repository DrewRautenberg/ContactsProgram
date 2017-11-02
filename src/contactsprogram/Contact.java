/* PROJECT:  ContactsProgram
 * Author: Drew Rautenberg
 * Contact Class, referenced fom ContactsProgram.java
 ****************************************************************************/
package contactsprogram;

class Contact {
    private static String name;
    private static long phone;

    void setName(String pName) {
        name = pName;
    }

    void setPhone(long pPhone) {
        phone = pPhone;
    }

    String getName() {
        return name;
    }

    char getInitial() {
        return name.charAt(0);
    }

    long getPhone() {
        return phone;
    }

    int findAreaCode() {
        return (int) (phone / 10000000);
    }

    int findLocalNumber() {
        return (int) (phone % 10000000);
    }

    boolean is269AreaCode() {
        return findAreaCode() == 269;
    }

    String nicelyFormatPhone() {
        int areaCode = findAreaCode();
        int co = findLocalNumber() / 10000;
        int line = findLocalNumber() % 10000;
        return "(" + areaCode + ") " + co + "-" + line;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);

    }

    public String toString() {
        return name + " " + phone;
    }
}
