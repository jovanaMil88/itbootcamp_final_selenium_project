package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Forbids visits to home url if not authenticated")
    public void forbidsVisitsToHomeUrlIfNotAuthenticated() {

//        Ucitati /home stranu
//        Verifikovati da se u url-u stranice javlja ruta /login

        navPage.getWantedPage("/home");
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

    @Test(priority = 2)
    @Description("TC-2: Forbids visits to profile url if not authenticated")
    public void forbidsVisitsToProfileUrlIfNotAuthenticated() {

//        Ucitati /profile stranu
//        Verifikovati da se u url-u stranice javlja ruta /login

        navPage.getWantedPage("/profile");
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

    @Test(priority = 3)
    @Description("TC-3: Forbids visits to admin cities url if not authenticated")
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated() {

//        Ucitati /admin/cities stranu
//        Verifikovati da se u url-u stranice javlja ruta /login

        navPage.getWantedPage("/admin/cities");
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

    @Test(priority = 4)
    @Description("TC-4: Forbids visits to admin users url if not authenticated")
    public void forbidsVisitsToAdminUsersUrlIfNotAuthenticated() {

//        Ucitati /admin/users stranu
//        Verifikovati da se u url-u stranice javlja ruta /login

        navPage.getWantedPage("/admin/users");
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

}


