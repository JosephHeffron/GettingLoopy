public class Task7 { //class
    public static void main(String[] args) { //main
        for (int i = 1; i <= 5; i++) { //outer for loop with its conditions
            for (int j = 1; j <= 5; j++) { //nested loop with its conditions
                System.out.print("*"); //print '*' whenever conditions are met
            }
            System.out.println(); //loop print on new line when conditions of outer loop are met
        }
    }
}
