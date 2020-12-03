package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (String record : records) {
            String[] userRecord = record.split(":");
            if (email.equals(userRecord[0])) {
                return Integer.valueOf(userRecord[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
