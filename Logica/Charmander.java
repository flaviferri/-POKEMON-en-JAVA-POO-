package Logica;

import Interfaz.IFuego;

public class Charmander extends Pokemon implements IFuego{

  public Charmander() {
  }

  @Override
  protected void atacarPlacaje() {
 System.out.println("Hola soy Charmander y este es mi ataque placaje");
  }

  @Override
  protected void atacarRaspon() {
   System.out.println("Hola soy Charmander y este es mi ataque raspon");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Charmander y este es mi ataque placaje");

}
@Override
public void atacarPunioFuego() {
System.out.println("Hola soy  Charmander  y este es mi ataque punio de fuego");
}

@Override
public void atacarLanzaLlamas() {
  System.out.println("Hola soy  Charmander  y este es mi ataque lanza llamas");
}

@Override
public void atacarAscuas() {
 System.out.println("Hola soy  Charmander  y este es mi ataque ascuas");
}

}
