public abstract class Pokemon {

    private final String name;
    private final String type;

    private double hp;

    public Pokemon(String name, String type, double hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public void speaks() {
        System.out.println(this.name + "!");
    }

    public void eats(String food, double amountOfHp) {
        System.out.println(this.name + " eats " + food + " and regains " + amountOfHp);
        this.hp += amountOfHp;
    }

    // default physical attack - no type/defense check
    public void pound(Pokemon enemy) {
        System.out.println(this.name + " hits " + enemy.getName() + " for 5 damage");
//        enemy.setHp((enemy.getHp()-5));
        enemy.hp -= 5;
    }

    public abstract void enterBattle();

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
