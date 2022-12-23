package com.sonatype.lift;

import java.util.Objects;

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
      if (!(other instanceof Data1)) { return false; }Data1 that = (Data1) other;
      return a == that.a;
    }

    @Override
    public int hashCode() {
      return Objects.hash(a);
    }
  }
}
