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
        //task 2
        System.out.println("Task 2");
       int i = 0;
       while (i< 10) {
           i++;
           System.out.print(i + " ");
       }
        System.out.println();

       for(int k = 10; k > 0; k--){
           System.out.print(k + " ");
                 }
}
}