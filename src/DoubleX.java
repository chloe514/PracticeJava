public boolean doubleX(String str) {
    // Find the index of the first occurrence of the character 'x'.
    int i = str.indexOf("x");

    // If there is no 'x' in the string, return false.
    if (i == -1) return false; // no "x" at all

    // Check if the index i+1 is within bounds of the string.
    // If i+1 is not within bounds, there cannot be a double 'x'.
    if (i + 1 >= str.length()) return false; // check i+1 in bounds?

    // Check if the character at index i+1 is also 'x'.
    // If so, return true; otherwise, return false.
    return str.substring(i + 1, i + 2).equals("x");

    // Alternative approach:
    // String x = str.substring(i);
    // return x.startsWith("xx");
}
