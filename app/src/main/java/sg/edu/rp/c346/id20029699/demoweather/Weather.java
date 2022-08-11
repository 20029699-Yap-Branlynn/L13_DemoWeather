package sg.edu.rp.c346.id20029699.demoweather;

public class Weather {
    String area;
    String forecast;

    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString(){

        String result = String.format("%s\n %s: %s\n %s: %s", "WEATHER", "Area", area, "Forecast", forecast);
        return result;
    }
}
