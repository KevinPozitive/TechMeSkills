package by.techMeSkills.hello.homeTwo.Task8;

public class Task {
    public static void main(String[] args) {
    int m = 5;
    int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i>0&&j<i)
                 System.out.print(" ");
                else
                    System.out.print("*");
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
