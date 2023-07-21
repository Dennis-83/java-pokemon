public class Main {
    public static void main(String[] args)
    {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "electric", 100);
        FirePokemon charmander = new FirePokemon("Charmander", "fire", 120);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", "water", 90);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", "grass", 150);



        pikachu.speaks();
        charmander.speaks();
        squirtle.speaks();
        bulbasaur.speaks();

        pikachu.enterBattle();
        charmander.enterBattle();

        System.out.println(charmander.getHp());
        pikachu.pound(charmander);
        System.out.println(charmander.getHp());
        charmander.eats("Bananas", 20);
        System.out.println(charmander.getHp());



    }
}