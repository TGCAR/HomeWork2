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
        byte allstudents = (byte) (ludmilaIvanovna + annaSergeevna +ekaterinaAndreevna);
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
        byte cansPaintWhite = (byte) (allClass / cansPaintWhiteUnit);
        byte cansPaintBrown = (byte) (allClass / cansPaintBrownUnit);
        System.out.println("В школе, где " + allClass + " классов, нужно " + cansPaintWhite + " банок белой краски и " + cansPaintBrown + " банок коричневой краски");



    }    }