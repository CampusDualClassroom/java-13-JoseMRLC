package com.campusdual.classroom;

public class FuelTank {

  public int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("No se puede establecer el combustible a un valor negativo. El valor actual permanece sin cambios.");
    } else {
      this.actualFuel = fuel;
    }
  }
}
