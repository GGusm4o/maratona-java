package academy.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Os Oeradores Aritméticos são:
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);

        // %
        int modulo = 10 % 3;
        System.out.println(modulo);

        // Os Oeradores Relacionais são:
        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 > 20;
        boolean isTenGreaterThanTwenty = 10 < 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 >= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 <= 20;
        boolean isTenDifferentThanTwenty = 10 != 10;
        boolean isTenEqualsThanTen = 10 == 10;

        System.out.println(isTenLowerThanTwenty);
        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLowerOrEqualsThanTwenty);
        System.out.println(isTenGreaterOrEqualsThanTwenty);
        System.out.println(isTenEqualsThanTen);
        System.out.println(isTenDifferentThanTwenty);

        // Os Oeradores Lógicos são:
        // && (AND) || (OR) ! (NOT)

        int age = 18;
        float salary = 3500F;
        boolean isLegalOlderThatThirty = age > 30 && salary >= 4612;
        boolean isLegalYoungerThatThirty = age < 30 && salary >= 3381;

        System.out.println("isLegalYoungerThatThirty "+isLegalOlderThatThirty);
        System.out.println("isLegalYoungerThatThirty "+isLegalYoungerThatThirty);

        double currentAccount = 200;
        double savingsAccount = 10000;
        float playstationFivePrice = 5000F;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;
        System.out.println("PlaystationCincoCompravel "+canBeBought);

        // Os Oeradores de Atribuição são:
        // = += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Bonus "+bonus);

        // Os Oeradores de incremento e decremento são:
        // ++ --

        int count = 0;
        count += 1; // count = count + 1;
        count++;
        count--;
        ++count;
        --count;
        int count2 = 0;
        System.out.println(++count2);


    }
}
