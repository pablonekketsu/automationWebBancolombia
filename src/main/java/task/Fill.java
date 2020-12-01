package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FillPage.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.FillPage.*;

public class Fill implements Task {
    private String name,lastName,email,day,month,year,city,zip_code,user,password;

    public Fill(String name, String lastName, String email, String day, String month, String year, String city
            ,String zip_code,String user, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.city = city;
        this.zip_code = zip_code;
        this.user = user;
        this.password = password;
    }

    public static Fill the(String name, String lastName, String email, String day, String month, String year,
                           String city,String zip_code, String user, String password ) {
        return Tasks.instrumented(Fill.class,name,lastName,email,day,month,year,city,zip_code,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(lastName).into(INPUT_LASTNAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Click.on(INPUT_MONTH),
                Click.on(INPUT_DAY),
                Click.on(INPUT_YEAR),
                Click.on(BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(INPUT_CITY),
                Click.on(INPUT_CITY),
                Enter.theValue(zip_code).into(POSTAL_CODE),
                Click.on(BUTTON_NEXT_LOCATION_TWO)
                );

    }
}
