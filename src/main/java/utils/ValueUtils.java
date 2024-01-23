package utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ValueUtils {

  private static ValueUtils INSTANCE = new ValueUtils();

  private ValueUtils() {
  }

  /**
   * Return the unique instance of Robot
   *
   */
  public static ValueUtils getInstance() {
    return INSTANCE;
  }


  /**
   * Return the current Time in text format
   *
   */
  public String getCurrentTimeInTextFormat() {
    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    Date date = new Date();
    return dateFormat.format(date);
  }

}
