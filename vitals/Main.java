package vitals;

public class Main {

     static boolean isTemperatureOk(float temperature) {
        return temperature >= 0 && temperature <= 45;
    }

    static boolean isSocOk(float soc) {
        return soc >= 20 && soc <= 80;
    }

    static boolean isChargeRateOk(float chargeRate) {
        return chargeRate <= 0.8;
    }

    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        boolean tempOk = isTemperatureOk(temperature);
        boolean socOk = isSocOk(soc);
        boolean chargeRateOk = isChargeRateOk(chargeRate);

        if (!tempOk) System.out.println("Temperature is out of range!");
        if (!socOk) System.out.println("State of Charge is out of range!");
        if (!chargeRateOk) System.out.println("Charge Rate is out of range!");

        return tempOk && socOk && chargeRateOk;
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f));
        assert(!batteryIsOk(50, 85, 0.0f));
        System.out.println("All tests passed");
    }
}
