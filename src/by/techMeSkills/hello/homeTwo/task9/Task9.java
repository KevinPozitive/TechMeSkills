package by.techMeSkills.hello.homeTwo.task9;

public class Task9 {
    public static void main(String[] args) {
        Print print = new Print();
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {

                    print.getParam(i, j);

                //System.out.print("*");
            }

            System.out.println();
        }


//    for (int i = 5; i > 0; i--) {
//            for (int j = i; j <= 5; j++) {
//            }
//        if(i<=3)
//            System.out.println();
//        }
    }
}
