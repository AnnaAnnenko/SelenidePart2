package qa.annenko;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutions {

    String BaseURL = "https://github.com/";

    @Test
    public void checkNameOfPage() {
        open(BaseURL);
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg.mb-3").shouldHave(Condition.exactTextCaseSensitive("Build like the best"));
    }
}