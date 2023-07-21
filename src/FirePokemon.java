public class FirePokemon extends Pokemon{



    public FirePokemon(String name, String type, double hp) {
        super(name, type, hp);
    }




    @Override
    public void enterBattle() {
        System.out.println("Fire and Smoke everywhere! Through the Flames appears: " + this.getName() + "!");
    }


}
