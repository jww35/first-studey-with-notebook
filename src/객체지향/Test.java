package 객체지향;

public class Test {

    public static void main(String[] args) {


        UserInfo Lee = new UserInfo();

        Lee.height = 180;
        Lee.weight = 70;
        Lee.name = "정원우";
        Lee.age = 23;

        System.out.printf(Lee.showInfo());
    }


}
