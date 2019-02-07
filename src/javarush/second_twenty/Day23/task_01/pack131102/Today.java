package javarush.second_twenty.Day23.task_01.pack131102;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Today implements Weather,WeatherType{
    private String type = "";

    @Override
    public String getWeatherType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Today day = new Today();
        day.setType(CLOUDY);
        System.out.println(day.getWeatherType());
        day.setType(FOGGY);
        System.out.println(day.getWeatherType());
        day.setType(FROZEN);
        System.out.println(day.getWeatherType());
    }
}
