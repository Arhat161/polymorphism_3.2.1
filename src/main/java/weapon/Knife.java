package weapon;

public class Knife extends Weapon {
    String steelName;
    int length;

    public Knife(String modelName, String steelName, int length) {
        super(modelName);
        this.steelName = steelName;
        this.length = length;
    }

    public void shot () {
        System.out.println("Хрясь! <лезвие вашего '" + this.getModelName() + "' длинной " + this.length +
                "см из материала '" + this.steelName + "' отсекло кусок плоти противника!>");
    }
}

