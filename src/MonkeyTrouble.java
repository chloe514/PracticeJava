
public class MonkeyTrouble {
}

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // If both monkeys are smiling, we are in trouble.
    if (aSmile && bSmile){
        return true;
    }
    // If neither monkey is smiling, we are also in trouble.

    if (!aSmile && !bSmile){
        return true;
    }
    // If one monkey is smiling and the other is not, we are not in trouble.

    return false;
}
