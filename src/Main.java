public class Main {
    public static void main(String[] args) {
        int myInt = 42;
        byte myByte = 10;
        short myShort = 30000;
        long myLong = 100000000;
        float myFloat = 3.14f;
        double myDouble = 2.718281828459045;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        //Задача 2
        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        int value4 = 569;
        int value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);
        System.out.println("value4: " + value4);
        System.out.println("value5: " + value5);
        System.out.println("value6: " + value6);
        System.out.println("value7: " + value7);
        //Задача 3
        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;

        int totalPaper = 480;

        double paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги ");
        //Задача 4
        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");

        int bottlesIn1Day = bottlesPerMinute * 1440;
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " штук бутылок.");

        int bottlesIn3Days = bottlesIn1Day * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");

        int bottlesIn1Month = bottlesIn1Day * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок.");
        //Задача 5
                int totalCans = 120;
                int whiteCansPerClass = 2;
                int brownCansPerClass = 4;

                int cansPerClass = whiteCansPerClass + brownCansPerClass;

                int classes = totalCans / cansPerClass;

                int totalWhiteCans = classes * whiteCansPerClass;
                int totalBrownCans = classes * brownCansPerClass;

                System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
                //Задача 6
                int bananas = 5 * 80;
                int milk = 200 / 100 * 105;
                int iceCream = 2 * 100;
                int eggs = 4 * 70;

                int totalWeightGrams = bananas + milk + iceCream + eggs;
                double totalWeightKilograms = totalWeightGrams / 1000.0;

                System.out.println("Вес завтрака: " + totalWeightGrams + " грамм (" + totalWeightKilograms + " кг).");
                //Задача 7
                double weightToLose = 7.0;
                double lossPerDayMin = 0.250;
                double lossPerDayMax = 0.500;

                int dayMin = (int) Math.ceil(weightToLose / lossPerDayMax);
                int dayMax = (int) Math.ceil(weightToLose / lossPerDayMin);
                double averageDays = (dayMin + dayMax) / 2.0;

                System.out.println("Если спортсмен будет терять 250 грамм в день, похудение займет " + dayMin + " дней.");
                System.out.println("Если спортсмен будет терять 500 грамм в день, похудение займет " + dayMax + " дней.");
                System.out.println("В среднем похудение займет " + averageDays + " дней.");
    }
}
