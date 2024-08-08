//import org.example.M
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    @Test
    public void fNameTest(){
        String fname= Main.fNameValidate("Aamir");
        Assert.assertEquals("HAPPY",fname);

    }
    @Test
    public void lNameTest(){
        String lname= Main.fNameValidate("Aamir");
        Assert.assertEquals("HAPPY",lname);

    }

    @Test
    public void emailTest(){
        String email= Main.emailValidate("saq.aam@blz.ami.zs");
        Assert.assertEquals("HAPPY",email);
    }

    @Test
    public void phoneNumberTest(){
        String phoneno= Main.phoneNumberValidate("91 9897198971");
        Assert.assertEquals("HAPPY",phoneno);
    }
    @Test
    public void passwordTest(){
        String password= Main.passwordValidate("asA!1asa");
        Assert.assertEquals("HAPPY",password);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk",
            "invalid-email@",
            "@example.com",
            "user@.com.my"
    })
    void validEmail (String mail){
        String result= Main.emailValidate(mail);
        Assert.assertEquals("HAPPY",result);
    }
}
