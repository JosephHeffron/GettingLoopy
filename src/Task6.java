public class Task6 { //class
    public static void main(String[] args) { //main
        for (int i = 5; i >= 1; i--) { //outer for loop with its conditions
            for (int j = 1; j <= i; j++) { //nested loop with its conditions
                System.out.print("*"); //print '*' whenever conditions are met
            }
            System.out.println(); //loop print on new line when conditions are met
        }
    }
}
