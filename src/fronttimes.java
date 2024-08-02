public class fronttimes

public String frontTimes(String str, int n) {
    // Define the length of the substring to be used, which is the first three characters.
    int frontLen = 3;

    // If the string is shorter than three characters, adjust the length to match the string length.
    if (frontLen > str.length()) {
        frontLen = str.length();
    }

    // Extract the substring from the beginning of the string up to the calculated frontLen.
    String front = str.substring(0, frontLen);

    // Initialize an empty string to store the result.
    String result = "";

    // Loop n times to concatenate the front substring to the result.
    for (int i = 0; i < n; i++) {
        result = result + front; // Append the substring front to the result.
    }

    // Return the final concatenated string.
    return result;
}{
}
