public class ElectricPokemon extends Pokemon{
    public ElectricPokemon(String name, String type, double hp) {
        super(name, type, hp);
    }

    @Override
    public void enterBattle() {
        System.out.println("Lightning strikes! From the Smoke appears: " + this.getName() + "!");
    }
}
