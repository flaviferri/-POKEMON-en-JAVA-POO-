package Logica;

import Interfaz.IElectrico;


public class Pikachu extends Pokemon implements IElectrico{

  public Pikachu() {
  }

  @Override
  protected void atacarPlacaje() {
  System.out.println("Hola soy Pikachu y este es mi ataque placaje");
  }

  @Override
  protected void atacarRaspon() {
   System.out.println("Hola soy Pikachu y este es mi ataque raspon");
  }

  @Override
  protected void atacarMordisco() {
  System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
  }

  @Override
  public void atacarImpactrueno() {
   System.out.println("Hola soy Pikachu y este es mi ataque trueno");
  }

  @Override
  public void punioElectico() {
  System.out.println("Hola soy Pikachu y este es mi ataque electrico");


}
}
