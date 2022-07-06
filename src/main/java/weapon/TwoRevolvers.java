package weapon;

public class TwoRevolvers extends Weapon {

    String historicalName;

    public TwoRevolvers(String modelName, String historicalName) {
        super(modelName);
        this.historicalName = historicalName;
    }

    public void rotateRevolvers() {
        System.out.println("<вы демонстративно крутите револьверы, охлаждая пыл местных наглецов>");
    }

    @Override
    public void shot() {
        System.out.println("Бах-бах! <два '" + this.historicalName + "' в ваших руках дергаются, отправляя пули в цель!>");
        this.rotateRevolvers();
    }
}
