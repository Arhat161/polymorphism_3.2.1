package weapon;

public class Pistol extends Weapon {

    int effectiveShootingDistance;

    public Pistol (String modelName, int effectiveShootingDistance) {
        super(modelName);
        this.effectiveShootingDistance = effectiveShootingDistance;
    }

    @Override
    public void shot() {
        System.out.println("Бух! <пистолет для самообороны только что спас вашу жизнь>");
        System.out.println("<жаль что он эффективен на дистанции не более " + effectiveShootingDistance + " метров...>");
    }
}
