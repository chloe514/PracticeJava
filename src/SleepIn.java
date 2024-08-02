public boolean SleepIn(boolean weekday, boolean vacation)
// If it is not a weekday or we are on vacation, we can sleep in.
    if (!weekday || vacation){
        return true;

        // Otherwise, we cannot sleep in.
    return false;}
