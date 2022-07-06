package weapon;

public class Rifle extends Weapon {

    boolean hasOptic;

    public Rifle (String modelName, boolean hasOptic) {
        super(modelName);
        this.hasOptic = hasOptic;
    }

    @Override
    public void shot() {
        System.out.println("Бзыньк! <где-то вдалеке стало одним негодяем меньше>");
        if(this.hasOptic) {
            System.out.println("<отличная штука, этот оптический прицел!>");
        }
    }
}
