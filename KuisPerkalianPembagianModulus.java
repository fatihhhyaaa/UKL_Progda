import java.util.Random;
import java.util.Scanner;

public class KuisPerkalianPembagianModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean continueQuiz = true;

        
        while (continueQuiz) {
            
            int bilanganPertama = random.nextInt(100);
            int bilanganKedua = random.nextInt(100) + 1; 
            String operator = getRandomOperator(random);
            
            
            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ");
            double jawabanUser  = scanner.nextDouble();
            
           
            double jawabanBenar = calculate(bilanganPertama, bilanganKedua, operator);
            
          
            if (jawabanUser  == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah! Jawaban yang benar adalah: " + jawabanBenar);
            }
            
           
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("tidak")) {
                continueQuiz = false;
            }
        }
        
        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
    
    private static String getRandomOperator(Random random) {
        String[] operators = { "*", "/", "%" };
        int index = random.nextInt(operators.length);
        return operators[index];
    }
    
    private static double calculate(int a, int b, String operator) {
        switch (operator) {
            case "*":
                return a * b;
            case "/":
                return (double) a / b; 
            case "%":
                return a % b;
            default:
                throw new IllegalArgumentException("Operator tidak dikenal: " + operator);
        }
    }
}