package weapon;

public abstract class Weapon {
    String modelName;
    String shortDescription;

    public Weapon() {
    }

    public Weapon(String modelName) {
        this.modelName = modelName;
    }

    public Weapon(String modelName, String shortDescription) {
        this.modelName = modelName;
        this.shortDescription = shortDescription;
    }


    // вернуть название модели
    public String getModelName() {
        return this.modelName;
    }

    // вернуть короткое описание
    public String getShortDescription() {
        return this.shortDescription;
    }

    // изменить короткое описание
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    // выстрел
    public void shot() {
        System.out.println("Бах-бах!");
    }

    @Override
    public String toString() {
        return "Модель: " + this.modelName + ", краткое описание: " + this.shortDescription;
    }
}