public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            savings = savings + 15_000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        //task 2
        System.out.println("Task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
        //task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int j = 1; j <= 10; j++) {
            population = population + (birthRate - mortality);
            System.out.println("Год " + j + ", численность населения составляет " + population);

        }
        //task 4
        System.out.println("Task 4");
        int summa = 15_000;
        int percent = 7;
        int monthPercent = 0;
        while (summa <= 12_000_000) {
            monthPercent = monthPercent + 1;
            summa = (summa / 100) * percent + summa;
            System.out.println("Месяц " + monthPercent + " сумма накопления равна " + summa);
        }
        //task 5
        System.out.println("Task 5");
        int summaNew = 15_000;
        int percentNew = 7;
        int monthPercentNew = 0;
        while (summaNew <= 12_000_000) {
            monthPercentNew = monthPercentNew + 1;
            summaNew = (summaNew / 100) * percentNew + summaNew;
            if (monthPercentNew % 6 == 0) {
                System.out.println("Месяц " + monthPercentNew + " сумма накопления равна " + summaNew);
            }
        }
        //task 6
        System.out.println("Task 6");
        int summaN = 15_000;
        int percentN = 7;
        float sixMonths= 0;
        while (sixMonths < 9) {
            sixMonths = sixMonths + 0.5f;
            summaN = (summaN / 100) * (percentN / 2) + summaN;
            System.out.println("Месяц " + sixMonths + " сумма накопления равна " + summaN);
            }
        //task 7
//        System.out.println("Task 7");
//        int friday = 4;
//        while (friday <= 31) {
//            System.out.println("Сегодня пятница, " + friday + "е число. Необходимо подготовить отчет");
//            friday = friday + 7;
//        }
        //task 7
        System.out.println("Task 7");
        int friday = 4;
        do {
            System.out.println("Сегодня пятница, " + friday + "е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);

        }
    }
