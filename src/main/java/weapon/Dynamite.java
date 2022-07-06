package weapon;

public class Dynamite extends Weapon {

    public Dynamite(String modelName) {
        super(modelName);
    }

    @Override
    public void shot() {
        System.out.println("Поджигаем... Бросаем!... 3... 2.. 1. БАБАХ !!! <комментарии излишни, все противники уничтожены>");
    }
}