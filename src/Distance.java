/**
 * Created by kevin_000 on 1/29/2016.
 */
public class Distance
{
            private int time;
            private int speed;

    public void setTime(int time) {
        this.time = time;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime() {
        return time;
    }

    public int getSpeed() {
        return speed;
    }
    public int calcDistance()
    {
        int distance = speed * time;
        return distance;

    }











}
