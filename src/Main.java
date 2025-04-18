public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int savings = 0;
        int month = 0;
       while (savings < 2_459_000) {
           savings =  savings +  15_000;
           month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
    }
}
}