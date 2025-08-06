package day17;
import java.util.List;

public class Theater {
    private List<String> showTimes;

    // Getters and Setters
    public List<String> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<String> showTimes) {
        this.showTimes = showTimes;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "showTimes=" + showTimes +
                '}';
    }
}