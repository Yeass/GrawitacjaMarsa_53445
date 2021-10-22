package pl.vistula;

public class grawitacjazarnecki {
    public static void main(String[] args) {

        float earthWeightZarnecki = 70;
        float marsWeightZarnecki = earthWeightZarnecki * 0.38F;
        System.out.println("Moja waga na Marsie wynosi: " + marsWeightZarnecki);

        double resultmarsWeightZarnecki = marsWeightZarnecki;
        System.out.println("Moja waga na Marsie wynosi (double): " + resultmarsWeightZarnecki);

        System.out.println("Moja waga na Marsie wynosi (double, 4):");
        System.out.format("%.4f", resultmarsWeightZarnecki);

        int resultintmarsWeightZarnecki = (int) resultmarsWeightZarnecki;
        System.out.println("\nMoja waga na Marsie wynosi (int):" + resultintmarsWeightZarnecki);

        char resultcharmarsWeightZarnecki = (char) resultintmarsWeightZarnecki;
        System.out.println("Moja waga na Marsie wynosi (char):" + resultcharmarsWeightZarnecki);

        resultcharmarsWeightZarnecki += 'A';
        System.out.println("Dzialanie matematyczne ze zmienna + A: " + resultcharmarsWeightZarnecki);

        int wynikdzialania = resultcharmarsWeightZarnecki;
        System.out.println("Wynik dzialania matematycznego z char do int: " + wynikdzialania);
    }
}

