package com.sonatype.lift;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App
{

  private static final Map<String, Integer> CAL_MAP = new HashMap<String, Integer>();

  static {
    CAL_MAP.put("year", Calendar.YEAR);
    CAL_MAP.put("month", Calendar.MONTH);
    CAL_MAP.put("date", Calendar.DATE);
    CAL_MAP.put("dayOfMonth", Calendar.DATE);
    CAL_MAP.put("hourOfDay", Calendar.HOUR_OF_DAY);
    CAL_MAP.put("minute", Calendar.MINUTE);
    CAL_MAP.put("second", Calendar.SECOND);
  }

  public static void set(Date self, Map<Object, Integer> updates) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(self);
    set(cal, updates);
    self.setTime(cal.getTimeInMillis());
  }

  public static void set(Calendar self, Map<Object, Integer> updates) {
    for (Map.Entry<Object, Integer> entry : updates.entrySet()) {
      Object key = entry.getKey();
      if (key instanceof String) key = CAL_MAP.get(key);
      if (key instanceof Integer) self.set((Integer) key, entry.getValue());
    }
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
