public String Stringtimes(String str, int n) {
    // Initialize an empty string to store the result.
    String result = "";

    // Loop n times to append the string str to the result.
    for (int i = 0; i < n; i++) {
        result = result + str; // Append the string str to the result.
    }

    // Return the final result string.
    return result;
}
