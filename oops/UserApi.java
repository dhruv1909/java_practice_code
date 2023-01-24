package org.practice.oops;

import java.util.HashMap;
import java.util.Map;

interface IUserApi {
    Map<String, String> loginUser(User user);
}

abstract class Api {
    protected final String validationString = "dkrocks@gmail.com";
}

public class UserApi extends Api implements IUserApi {

    @Override
    public Map<String, String> loginUser(User user) {
        Map<String, String> response = new HashMap<String, String>();

        if (user.getEmail().equals(this.validationString)) {
            response.put("token", "yes_i_rock");
        } else {
            response.put("message", "email is undefined");
        }

        return response;

    }
}
