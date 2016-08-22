/**
 * Created by lindseyringwald on 8/22/16.
 */
public class Ancestors {
    private String name;
    private int yearBorn;
    private String origin;

    public Ancestors(String name, int yearBorn, String origin) {
        this.name = name;
        this.yearBorn = yearBorn;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



}
