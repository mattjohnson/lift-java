package com.sonatype.lift;

/**
 * Hello world!
 */
public class App
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
  }

  static class Data
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data that = (Data) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data1
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data that = (Data) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data2
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data that = (Data) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data3
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data that = (Data) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }
}
