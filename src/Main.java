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
        //task 3
        System.out.println("Task 3");
       int population = 12_000_000;
       int birthRate = 17;
       int mortality = 8;
       for (int j = 1; j <= 10; j++){
           population = population + (birthRate - mortality);
           System.out.println("Год " + j + ", численность населения составляет " + population);

       }
        //task 4
        System.out.println("Task 4");
       int summa = 15_000;
       int percent = 7;
       int monthPercent = 0;
       while (summa <= 12_000_000) {
           monthPercent = monthPercent +1;
           summa = (summa/100) * 7 + summa;
           System.out.println("Месяц " + monthPercent + " сумма накопления равна " + summa);
       }
}
}