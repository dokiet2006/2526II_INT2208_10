public class Main {
    public static boolean isValidInput(int age, double income, int credit_ccore, char employment) {
        return (age >= 18 && age <= 65)
                && (income >= 5.0 && income <= 500.0)
                && (credit_ccore >= 300 && credit_ccore <= 850)
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
}