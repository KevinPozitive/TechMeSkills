package by.techMeSkills.hello.homeTwo.Task1;

public class Task {
    public static void main(String[] args) {
        int dist = 10;
        for(int i = 0;i<=7;i++){
            System.out.println(dist+" before");
            dist += dist*10/100;
            System.out.println(dist);
        }
    }
}
