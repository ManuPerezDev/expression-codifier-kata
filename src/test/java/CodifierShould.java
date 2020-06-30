import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodifierShould {
    /**
     * "1" -> "1"
     * "12" -> "*2"
     * "1234" -> "***4" && "123456" -> *****6
     * "ñ" -> throws exception
     */

    @Test
    public void single_digit_return_same_digit(){
        Codifier codifier = new Codifier();

        assertThat(codifier.codify("1")).isEqualTo("1");
    }
}
