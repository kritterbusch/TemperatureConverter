
package temperatureconverter;

/**
 * Service class
 * @author kritterbusch
 */
public class TemperatureConverterService {

    private double num;
    private double ansCelsius;
    private double ansFahrenheit;

    public TemperatureConverterService(double num, double ansCelsius, double ansFahrenheit) {
        this.num = num;
        this.ansCelsius = ansCelsius;
        this.ansFahrenheit = ansFahrenheit;
    }

    public TemperatureConverterService() {
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getAnsCelsius() {
        ansCelsius = ((num - 32) * (.555555556));
        return ansCelsius;
    }

    public double getAnsFahrenheit() {
        ansFahrenheit = (num * 1.8) + 32;
        return ansFahrenheit;
    }

}
