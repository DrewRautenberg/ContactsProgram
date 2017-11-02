package contactsprogram;

class Contacts {
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
        return (int)(phone / 10000000);
    }

    int findLocalNumber() {
        return 2763101;
    }

    boolean is269AreaCode() {
        return findAreaCode() == 269;
    }

    String nicelyFormatPhone() {
        return "formatted phone";
    }

    void displayData() {

    }
    //String toString(){
    //   return "string";
    //}
}
