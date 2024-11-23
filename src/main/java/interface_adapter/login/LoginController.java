package interface_adapter.login;

import use_case.login.LoginInputBoundary;
import use_case.login.LoginInputData;

public class LoginController {

    private final LoginInputBoundary interactor;

    public LoginController(LoginInputBoundary interactor) {
        this.interactor = interactor;
    }

    public void execute(String username, String password) {
        final LoginInputData data = new LoginInputData(
                username,
                password
        );
        interactor.execute(data);
    }
}
