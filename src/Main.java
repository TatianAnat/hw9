public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int contributionPercent = 29000;
        int percent = 0;
        for(int i = 1; i <= 12; i++) {
            percent =  contributionPercent +  contributionPercent / 100;
            contributionPercent = percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + contributionPercent + " рублей");
    }
}
}