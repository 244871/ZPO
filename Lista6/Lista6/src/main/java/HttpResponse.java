import java.util.ArrayList;

public class HttpResponse {

    private Coord coord;
    private ArrayList <Weather> weather = new ArrayList<Weather>();
    private String base;
    private Main main;
    private float visibility;
    private Wind wind;
    private Clouds clouds;
    private float dt;
    private Sys sys;
    private float timezone;
    private float id;
    private String name;
    private float cod;

    // Getter Methods
    public Coord getCoord() {
        return coord;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public float getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public float getTimezone() {
        return timezone;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }
    public ArrayList<Weather> getWeather() {
        return weather;
    }

    // Setter Methods
    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }
    public void setCoord(Coord coordObject) {
        this.coord = coordObject;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main mainObject) {
        this.main = mainObject;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWind(Wind windObject) {
        this.wind = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.clouds = cloudsObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSys(Sys sysObject) {
        this.sys = sysObject;
    }

    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }
}

