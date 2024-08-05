package Logica;
public class EjercicioIntegrador{
public static void main(String[] args) {
  
  Pokemon squatter = new Squatter();
  Charmander chacha = new Charmander();
  Pikachu pika = new Pikachu();
  Bulbasaur bulba = new Bulbasaur();


squatter.atacarRaspon();
((Squatter) squatter).atacarHidrobomba();
chacha.atacarRaspon();
chacha.atacarLanzaLlamas();
bulba.atacarMordisco();
bulba.atacarParalizar();
pika.atacarRaspon();
pika.punioElectico();

}
}