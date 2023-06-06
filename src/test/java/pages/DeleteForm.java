package pages;

import static com.codeborne.selenide.Selenide.$;

public class DeleteForm {

    public void clearSpace () {

        $("[name=your-name]").clear();
        $("[name=your-surname]").clear();
        $("[name=your-email]").clear();
        $("[name=your-tel]").clear();
        $("[name=your-organization]").clear();
        $("[name=your-message]").clear();

    }
}
