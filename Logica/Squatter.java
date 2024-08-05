package Logica;

import Interfaz.IAgua;

public class Squatter extends Pokemon implements IAgua{

  public Squatter() {
  }


  @Override
  protected void atacarPlacaje() {
   System.out.println("Hola soy Squatter y este es mi ataque placaje");
  }

  @Override
 protected void atacarRaspon() {
System.out.println("Hola soy Squatter y este es mi ataque raspon");
  }

  @Override
  protected void atacarMordisco() {
   System.out.println("Hola soy Squatter y este es mi ataque mordisco");
  }

  @Override
  public void atacarHidrobomba() {
  System.out.println("Hola soy Squatter y este es mi ataque hidrobomba");
  }

  @Override
  public void atacarBurbuja() {
    System.out.println("Hola soy Squatter y este es mi ataque burbuja");
  }

  @Override
  public void atacarPistolaAgua() {
System.out.println("Hola soy Squatter y este es mi ataque pistola de agua");
  }

}
