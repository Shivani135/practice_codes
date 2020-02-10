class AsgA0154 {
  public static String rotate_string(String str) {
    int count = str.length();
    String str1 = (str.substring(count - 1));
    String str2 = (str.substring(0, count - 1));
    return (str1 + str2);
  }
}
