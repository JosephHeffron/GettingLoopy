public class Task5 { //class
    public static void main(String[] args) { //main
        for (int i = 1; i <= 5; i++) { //outer for loop with its conditions
            for (int j = 1; j <= i; j++) { //nested for loop with its conditions
                System.out.print("*"); //when conditions met, print '*'
            }
            System.out.println(); //when conditions met, loop print on new line
        }
    }
}
