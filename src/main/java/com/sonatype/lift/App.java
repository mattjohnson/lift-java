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

  static class Data1
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data1 that = (Data1) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data2
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data2 that = (Data2) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data3
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data3 that = (Data3) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data4
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data4 that = (Data4) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data5
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data5 that = (Data5) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

  static class Data6
  {
    private int a;

    @Override
    public boolean equals(Object other) {
      Data6 that = (Data6) other; // BAD: This may throw ClassCastException.
      return a == that.a;
    }
  }

}
