import java.util.*;
public class Main {
    public static boolean isValidInput(int age, double income, int credit_score, char employment) {
        return (age >= 18 && age <= 65)
                && (income >= 5.0 && income <= 500.0)
                && (credit_score >= 300 && credit_score <= 850)
                && (employment == 'C' || employment == 'F');
    }

    public static String getRiskLevel(int credit_score) {
        if (credit_score >= 300 && credit_score <= 500) {
            return "High";
        } else if (credit_score <= 700) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    public static String decideLoan(int age, double income, int credit_score, char employment) {
        if (!isValidInput(age, income, credit_score, employment)) {
            return "Invalid Input";
        }

        String risk = getRiskLevel(credit_score);

        //Rule 1: high risk luon Reject
        if (risk.equalsIgnoreCase("High")) {
            return "REJECT";
        }

        //Rule 2: income < 15 trieu
        if (income < 15.0) {
            if (employment == 'F' || risk.equalsIgnoreCase("Medium")) {
                return "REJECT";
            } else if (employment == 'C' || risk.equalsIgnoreCase("Low")) {
                return "MANUAL REVIEW";
            }
        }

        //Rule 3: income >= 15 trieu
        if (income >= 15.0) {
            if (risk.equalsIgnoreCase("Medium") || risk.equalsIgnoreCase("Low")) {
                if (employment == 'C') {
                    return "APPROVE";
                } else {
                    return "MANUAL REVIEW";
                }
            }
        }
        return "Invalid Input";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("age: ");
        int age = sc.nextInt();

        System.out.print("income (million VND): ");
        double income = sc.nextDouble();

        System.out.print("credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("employment (C/F): ");
        char employment = sc.next().toUpperCase().charAt(0);

        String result = decideLoan(age, income, creditScore, employment);
        System.out.println("Decision: " + result);

        sc.close();
    }
}