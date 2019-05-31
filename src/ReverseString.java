public class ReverseString extends Thread {
    String myText;
    String reversedString = "";
    static String[] arr = new String[4];
    int startString;
    int endString;
    static int counter = 3;
    String getFullReversed = "";

    public ReverseString() {

    }

    public ReverseString(String myText, int startString, int endString) {
        this.myText = myText;
        this.startString = startString;
        this.endString = endString;
    }

    public void run() {
        myText = myText.substring(startString, endString);
        reversedString = reverseString(myText);
        arr[counter] = reversedString;
        counter--;
    }

    public String reversedFullString() {
        for (int i = 0; i < arr.length; i++) {
            getFullReversed += arr[i];
        }
        return getFullReversed;
    }

    public  String reverseString(String myStr) {
        if (myStr.isEmpty()) {
            return myStr;
        }
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}
