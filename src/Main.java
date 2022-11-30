public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1(){
        int a = 10000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 55;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 10000000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 44.22f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 125.78906;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2(){
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3(){
        short totalPaperAmount = 480;
        byte firstTeacherPupils = 23;
        byte secondTeacherPupils = 27;
        byte thirdTeacherPupils = 30;

        int totalPupils = firstTeacherPupils + secondTeacherPupils + thirdTeacherPupils;
        System.out.println("На каждого ученика рассчитано " + totalPupils + " листов бумаги" );
    }
    public static void task4(){
        short bottles = 16;
        byte minutes = 20;
        int day = 1440;
        int days = 4320;
        int mounth = 43200;
        System.out.println("За " + minutes + " машина произвела " + bottles * minutes + " штук бутылок");
        System.out.println("За " + day + " машина произвела " + bottles * day + " штук бутылок");
        System.out.println("За " + days + " машина произвела " + bottles * days + " штук бутылок");
        System.out.println("За " + mounth + " машина произвела " + bottles * mounth + " штук бутылок");
    }
    public static void task5(){
        int totalCans = 120;
        short whitePaintCans = 2;
        short brownPaintCans = 4;
        int classroomsAmount = totalCans/(whitePaintCans + brownPaintCans);
        int whitePaintRequired = classroomsAmount * whitePaintCans;
        int brownPaintRequired = classroomsAmount * brownPaintCans;
        System.out.println("В школе, где " + classroomsAmount + " классов, нужно " + whitePaintRequired + " банок белой краски и " + brownPaintRequired + " банок коричневой краски");
    }
    public static void task6(){
        short bananasAmount = 5;
        short bananaWeight = 80;
        short milkAmount = 2;
        short milkWeight = 105;
        short ice_creamAmount = 2;
        short ice_creamWeight = 100;
        short eggsAmount = 4;
        short eggsWeight = 70;
        int weightTotalInGramms = (bananasAmount * bananaWeight) + (milkAmount * milkWeight) + (ice_creamAmount * ice_creamWeight) + (eggsAmount * eggsWeight);
        double weightTotalInKillo = weightTotalInGramms * 1000;
        System.out.println("Общий вес в граммах: " + weightTotalInGramms + "г. Общий вес в киллограммах: " + weightTotalInKillo);
    }
    public static void task7(){
        short weightLossMin = 250;
        short weightLossMax = 500;
        short weightToLoseInKilo = 7;
        int weightToLoseInGramms = weightToLoseInKilo * 1000;
        int daysToLoseMin = weightToLoseInGramms/weightLossMin;
        int daysToLoseMax = weightToLoseInGramms/weightLossMax;
        int daysAvg = (weightLossMin + weightLossMax)/2;
        System.out.println("Минимальное кол-во дней для похудения: " + daysToLoseMax + "Максимальное кол-во дней для похудения: " + daysToLoseMin + "Среднее кол-во: " + daysAvg);
    }
    public static void task8(){
        int mashaSallary = 67760;
        int denSallary = 83690;
        int krisSallary = 76230;

        int mashaSallaryProcent = mashaSallary/10;
        int mashaSallaryIncreased = mashaSallary + mashaSallaryProcent;
        int denSallaryProcent = denSallary/10;
        int denSallaryIncreased = denSallaryProcent + denSallary;
        int krisSallaryProcent = krisSallary/10;
        int krisSallaryIncreased = krisSallary + krisSallaryProcent;
        System.out.println("Маша теперь получает " + mashaSallaryIncreased + " рублей. Годовой доход вырос на " + mashaSallaryProcent + " рублей");
        System.out.println("Деннис теперь получает " + denSallaryIncreased + " рублей. Годовой доход вырос на " + denSallaryProcent + " рублей");
        System.out.println("Кристина теперь получает " + krisSallaryIncreased + " рублей. Годовой доход вырос на " + krisSallaryProcent + " рублей");
    }
}