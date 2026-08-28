package day3;

public class BreakVsContinue {
    public static void main(String[] args){
        for (int i=1;i<=10;i++){
            System.out.println(i);
            if (i == 5 || i == 7) {

                continue;
            }
        }
    }

}

