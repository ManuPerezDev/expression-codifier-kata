import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodifierShould {
    /**
     * "1" -> "1"
     * "12" -> "*2"
     * "1234" -> "***4" && "123456" -> *****6
     * "ñ" -> throws exception
     */
}
