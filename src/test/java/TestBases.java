import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBases {
    @BeforeAll
    static void openSite() {
        open("https://github.com/");
        Configuration.pageLoadStrategy = "eager";
    }
}
