public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, String type, double hp) {
        super(name, type, hp);
    }

    @Override
    public void enterBattle() {
        System.out.println("A huge Field of Grass pops up out of nowhere! Through the Blades appears: " + this.getName() + "!");
    }
}
