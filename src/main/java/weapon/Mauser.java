package weapon;

public class Mauser extends Weapon {

    private String caliber;
    private int magazineСapacity;
    private boolean holsterButt;


    public Mauser(String modelName, String caliber, boolean holsterButt) {
        super(modelName);
        this.caliber = caliber;
        this.holsterButt = holsterButt;
    }


    public boolean isHolsterButtAttached() {
        return this.holsterButt;
    }

    @Override
    public void shot() {
        System.out.println("Тыщ! <пуля калибра " + this.caliber + " не оставила шанса вашему оппоненту>");
        if(isHolsterButtAttached()) {
            System.out.println("А кобура-приклад дает вам +10 к меткости :)");
        }
    }
}
