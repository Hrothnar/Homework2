public class Main {
    public static void main(String[] args) {
        byte one = 45;
        short two = -354;
        int three = 12;
        long four = 333L;

        float five = 13.45f;
        double six = 88.926;

        char seven = 202;
        boolean eight = five < six;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        float difference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Вместе бойцы весят - " + totalWeight + " кг.");
        System.out.println("Разница в весе между бойцами - " + difference + " кг.");

        short bananas = 5;
        short milk = 2;
        short iceCream = 2;
        short eggs = 4;
        int bananasWeight = bananas * 80;
        int milkWeight = milk * 105;
        int iceCreamWeight = iceCream *100;
        int eggsWeight = eggs * 70;
        int productsWeightG = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float productsWeightKg = productsWeightG /1000f;
        System.out.println("Вес всех продуктов для завтрака - " + productsWeightKg + " кг.");

        byte weightKg = 7;
        short perDaySlow = 250;
        short perDayFast = 500;
        int weightG = weightKg * 1000;
        int weightLossSlow = weightG / perDaySlow;
        int weightLossFast = weightG / perDayFast;
            float perDayAverage = perDaySlow + perDayFast;
            perDayAverage = perDayAverage / 2;
        float weightLossAverage = weightG / perDayAverage;
        System.out.println("Количество дней при медленном похудении - " + weightLossSlow);
        System.out.println("Количество дней при быстром похудении - " + weightLossFast);
        System.out.println("Потребуется дней для похудения в среднем - " + weightLossAverage);

        int masha = 67760;
        int denis = 83690;
        int cristine = 76230;
        float salaryIncreaseMasha = masha * 1.1f;
        float salaryIncreaseDenis = denis * 1.1f;
        float salaryIncreaseCristine = cristine * 1.1f;
        int perYearMashaBefore = masha * 12;
        int perYearDenisBefore = denis * 12;
        int perYearCristineBefore = cristine * 12;
        float perYearMashaAfter = salaryIncreaseMasha * 12;
        float perYearDenisAfter = salaryIncreaseDenis * 12;
        float perYearCristineAfter = salaryIncreaseCristine * 12;
        float differenceMasha = perYearMashaAfter - perYearMashaBefore;
        float differenceDenis = perYearDenisAfter - perYearDenisBefore;
        float differenceCristine = perYearCristineAfter - perYearCristineBefore;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей в месяц." + " Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей в месяц." + " Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryIncreaseCristine + " рублей в месяц." + " Годовой доход вырос на " + differenceCristine + " рублей.");


    }
}