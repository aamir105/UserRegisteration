//import org.example.M
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

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



}
