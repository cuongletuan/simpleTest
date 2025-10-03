package scripts;

import org.junit.jupiter.api.Test;
import pages.AuthPage;

public class SignUp extends BaseTest{

    @Test
    public void signUp(){
        AuthPage signUp = new AuthPage(page);
        signUp.linkLogin();
        signUp.linkSignUp();
    }
}
