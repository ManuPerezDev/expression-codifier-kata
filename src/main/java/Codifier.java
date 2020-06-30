public class Codifier {

    public String codify(String expression) {
        if (expression.length() > 1){
            expression = getReplacedCharactersWithAsterisk(expression);
        }
        return expression;
    }

    private String getReplacedCharactersWithAsterisk(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            boolean notFinalChar = i != expression.length() - 1;
            if (notFinalChar) {
                String charToReplace = String.valueOf(expression.charAt(i));
                expression = expression.replaceFirst(charToReplace, "*");
            } else {
                break;
            }
        }
        return expression;
    }
}

