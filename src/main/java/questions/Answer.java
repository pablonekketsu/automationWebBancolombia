package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FillPage;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question=question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(FillPage.MESSAGE_INIT).viewedBy(actor).asString();
        result=(question.equals(nameCourse))?true:false;
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
