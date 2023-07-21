public class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, String type, double hp) {
        super(name, type, hp);
    }

    @Override
    public void enterBattle() {
        System.out.println("Raging Water fills the ground! Out of the Waves appears: " + this.getName() + "!");
    }


}
