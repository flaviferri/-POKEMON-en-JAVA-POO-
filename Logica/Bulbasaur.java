package Logica;

import Interfaz.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

  public Bulbasaur() {
  }

  @Override
  protected void atacarPlacaje() {
  System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
  }

  @Override
  protected void atacarRaspon() {
  System.out.println("Hola soy Bulasour y este es mi ataque raspon");
  }

  @Override
  public void atacarMordisco() {
  System.out.println("Hola soy Bulasour y este es mi ataque mordisco");
  }

  @Override
  public void atacarDrenaje() {
   System.out.println("Hola soy Bulasour y este es mi ataque drenaje");
  }

  @Override
  public void atacarParalizar() {
   System.out.println("Hola soy Bulasour y este es mi ataque paralizar");
  }


}
