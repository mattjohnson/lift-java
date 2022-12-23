package com.sonatype.lift;

/**
 * Hello world!
 */
public class App
{
  public static void main(String[] args) {
    System.out.println("Hello, world!");

    System.out.println("Hello, universe!");

    System.out.println("¡Hola Mundo!");
  }

  static class Data1
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data1 that = (Data1) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }
}
