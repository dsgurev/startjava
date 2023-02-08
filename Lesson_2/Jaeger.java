public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private int speed;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.speed = speed;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Для " + modelName + " установлена скорость = " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void checkMoving(){
        if (speed != 0) {
            System.out.println(modelName + " перемещается!");
        } else {
            System.out.println(modelName + " стоит");
        }
    }

    public void checkSpeed(){
        System.out.println("Скорость " + modelName + " = " + speed);
    }
}