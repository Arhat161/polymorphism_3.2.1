import weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new TwoRevolvers("Парочка револьверов", "Colt 1873 Peacemaker"),
                new Pistol("Короткоствольный пистолет Sharps 4 barrel", 15),
                new Rifle("Винтовка Winchester Model 1873", true),
                new Mauser("Пистолет-карабин Mauser C96", "7.62", true),
                new Dynamite("Связка динамита"),
                new Knife("Нож Боуи", "stainless steel", 25)
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void showPlayerWeapon() {
        if(this.getSlotsCount() > 0 ) {
            System.out.println();
            for (int i = 0; i < this.getSlotsCount(); i++) {
                System.out.println(i+1 + ". " + this.weaponSlots[i].getModelName());
            }
        } else {
            System.out.println("У вас нет оружия в слотах вооружения!");
        }
    }

    public void shotWithWeapon(int slot) {
        int slotsCount = this.getSlotsCount();
        if(slot < 0 || slot > slotsCount - 1) {
            System.out.println("В вашем арсенале нет такого оружия! Всего доступно для выбора слоты с 1-го по " + slotsCount +"-ой!");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}