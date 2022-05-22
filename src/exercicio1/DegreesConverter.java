package exercicio1;

public class DegreesConverter {
    private double convertToFahrenheit(double degree) {
        //F = C * 1.8 + 32
        double fahrenheit = (degree * 1.8) + 32;
        return fahrenheit;
    }


    private double convertToKelvin(double degree) {
        //K = C + 273.15
        double kelvin = (degree + 273.15);
        return  kelvin;
    }

    private double convertToReamur(double degree) {
        //Re = C * 0.8
        double reamur = (degree * 0.8);
        return reamur;
    }

    private double convertToRankine(double degree) {
        //Ra = C * 1.8 + 32 + 459.67
        double Rankine = (degree * 1.8) + 32 + 459.67;
        return Rankine;
    }

    void convertDegrees(double degree) {
        DegreesConverter degreesConverter = new DegreesConverter();
        System.out.println(degree + " ºC equivale á: ");
        System.out.println(String.format("%.2f", degreesConverter.convertToFahrenheit(30))+ " ºF");
        System.out.println(String.format("%.2f",degreesConverter.convertToKelvin(30)) + " ºK");
        System.out.println(String.format("%.2f", degreesConverter.convertToReamur(30))+ " ºRe");
        System.out.println(String.format("%.2f", degreesConverter.convertToRankine(30)) + " ºRa");

    }

}
