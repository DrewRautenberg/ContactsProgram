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
        return 'a';
    }

    long getPhone() {
        return phone;
    }

    int findAreaCode() {
        return 269;
    }

    int findLocalNumber() {
        return 2763101;
    }

    boolean is269AreaCode() {
        return true;
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
