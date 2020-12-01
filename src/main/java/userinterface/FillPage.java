package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    public static final Target  INPUT_NAME=Target.the("where we write the name").located(By.id("firstName"));
    public static final Target  INPUT_LASTNAME=Target.the("where we write the lastname").located(By.id("lastName"));
    public static final Target  INPUT_EMAIL=Target.the("where we write the email").located(By.id("email"));
    public static final Target  INPUT_DAY=Target.the("where we write the day").located(By.xpath("//*[@id=\"birthDay\"]/option[18]"));
    public static final Target  INPUT_MONTH=Target.the("where we write the month").located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));
    public static final Target  INPUT_YEAR=Target.the("where we write the year").located(By.xpath("//*[@id=\"birthYear\"]/option[12]"));
    public static final Target  BUTTON_NEXT_LOCATION=Target.the("button to go to the next step:location").located(By.className("btn-blue"));
    public static final Target  INPUT_CITY=Target.the("select the city").located(By.id("city"));
    public static final Target  POSTAL_CODE=Target.the("write the postal code").located(By.id("zip"));
    public static final Target  BUTTON_NEXT_LOCATION_TWO=Target.the("button to go to the next step:devices").located(By.className("pull-right"));




}
