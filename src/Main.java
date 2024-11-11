public class Main {

    public static void main(String[] args) {
        byte a = 10;
        short b = 10000;
        int c = 40000000;
        long d = 1000000000L;
        float e = 1.2f;
        double f = 2.2;

        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);

        float i = 27.12f;
        System.out.println(i);
        long j = 987678965549L;
        System.out.println(j);
        byte m = 2;
        short m1 = 786;
        System.out.println(m + "," + m1);
        short l = 569;
        System.out.println(l);
        short l2 = -159;
        System.out.println(l2);
        short n = 27897;
        System.out.println(n);
        byte o = 67;
        System.out.println(o);

        byte ludmilaIvanovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        byte allstudents = (byte) (ludmilaIvanovna + annaSergeevna + ekaterinaAndreevna);
        short allSheets = 480;
        byte oneSheetsOneStudents = (byte) (allSheets / allstudents);
        System.out.println("На каждого ученика рассчитано " + oneSheetsOneStudents + " листов бумаги");

        byte quantityBottleUnit = 16;
        byte timeUnit = 2;
        short productivityDayUnit = 1440;
        short productivityMinUnit = 20;
        short productivityMin = (short) (productivityMinUnit / timeUnit * quantityBottleUnit);
        System.out.println("За 20 минут машина произвела " + productivityMin + " штук бутылок");
        short productivityDay = (short) (productivityDayUnit / timeUnit * quantityBottleUnit);
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        int productivityForDay = (productivityDayUnit * 3 / timeUnit * quantityBottleUnit);
        System.out.println("За 3 дня машина произвела " + productivityForDay + " штук бутылок");
        int productivityOneMonth = (productivityDayUnit * 30 / timeUnit * quantityBottleUnit);
        System.out.println("За месяц машина произвела " + productivityOneMonth + " штук бутылок");

        byte cansPaintUnit = 120;
        byte cansPaintWhiteUnit = 2;
        byte cansPaintBrownUnit = 4;

        byte allClass = (byte) (cansPaintUnit / (cansPaintWhiteUnit + cansPaintBrownUnit));
        byte cansPaintWhite = (byte) (allClass * cansPaintWhiteUnit);
        byte cansPaintBrown = (byte) (allClass * cansPaintBrownUnit);
        System.out.println("В школе, где " + allClass + " классов, нужно " + cansPaintWhite + " банок белой краски и " + cansPaintBrown + " банок коричневой краски");

        byte oneBananGr = 80;
        byte oneHundredMilkGr = 105;
        byte oneIceCreamGr = 100;
        byte oneEggGr = 70;
        short allBananGr = (short) (oneBananGr * 5);
        short allHundredMilkGr = (short) (oneHundredMilkGr * 2);
        short allIceCreamGr = (short) (oneIceCreamGr * 2);
        short allEggGr = (short) (oneEggGr * 4);
        short athletesBreakfastGr = (short) (allBananGr + allHundredMilkGr + allIceCreamGr + allEggGr);
        float athletesBreakfastKg = (athletesBreakfastGr * 0.001f);
        System.out.println("Завтрак спортсмена в граммах " + athletesBreakfastGr);
        System.out.println("Завтрак спортсмена в килограмах " + athletesBreakfastKg);

        byte loseWeightKg = 7;
        short loseWeightGr = (short) (loseWeightKg * 1000);
        short lostWeightInDayGr1 = 250;
        short lostWeightInDayGr2 = 500;
        byte onAverageDays1 = (byte) (loseWeightGr / lostWeightInDayGr1);
        byte onAverageDays2 = (byte) (loseWeightGr / lostWeightInDayGr2);
        System.out.println(onAverageDays1 + " дней");
        System.out.println(onAverageDays2 + " дней");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int increaseSalaryMasha = (int) (salaryMasha * 1.1);
        int salaryMashaAnnual = (int) (salaryMasha * 12);
        int increaseSalaryMashaAnnual = (int) (increaseSalaryMasha * 12);
        int differenceSalaryMashaAnnual = (int) (increaseSalaryMashaAnnual - salaryMashaAnnual);
        System.out.println("Маша теперь получает " + increaseSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMashaAnnual + " рублей");
        int increaseSalaryDenis = (int) (salaryDenis * 1.1);
        int salaryDenisAnnual = (int) (salaryDenis * 12);
        int increaseSalaryDenisAnnual = (int) (increaseSalaryDenis * 12);
        int differenceSalaryDenisAnnual = (int) (increaseSalaryDenisAnnual - salaryDenisAnnual);
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenisAnnual + " рублей");
        int increaseSalaryChristina = (int) (salaryChristina * 1.1f);
        int salaryChristinaAnnual = (int) (salaryChristina * 12);
        int increaseSalaryChristinaAnnual = (int) (increaseSalaryChristina * 12);
        int differenceSalaryChristinaAnnual = (int) (increaseSalaryChristinaAnnual - salaryChristinaAnnual);
        System.out.println("Кристина теперь получает " + increaseSalaryChristina + " рублей. Годовой доход вырос на " + differenceSalaryChristinaAnnual + " рублей");

    }
}