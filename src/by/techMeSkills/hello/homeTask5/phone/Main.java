package by.techMeSkills.hello.homeTask5.phone;

public class Main {
    public static void main(String[] args) {
        PhonesBean phonesBean = new PhonesBean("+375259468530","MEIZU 15");
        phonesBean.receiveCall("DIONIS");
        phonesBean.receiveCall("DIONIS","+375296666666");
        phonesBean.sendMessages("+3752966666666","+3752969696969");
        System.out.println(phonesBean.getNumber());

    }
}
