public class Codifier {

    public String codify(String digits) {
        if (digits.length() > 1){
            digits = getReplacedDigitsWithAsterisk(digits);
        }
        return digits;
    }

    private String getReplacedDigitsWithAsterisk(String digits) {
        for (int i = 0; i < digits.length(); i++) {
            if(i == digits.length() - 1){
                break;
            }

            digits = digits.replace(String.valueOf(digits.charAt(i)), "*");
        }
        return digits;
    }
}

