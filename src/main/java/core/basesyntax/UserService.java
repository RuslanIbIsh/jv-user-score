package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        int userScore = -1;

        if (records == null) {
            throw new UserNotFoundException("User with given email doesn't exist");

        } else {
            for (String record : records) {
                String[] userRecord = record.split(":");

                if (email.equals(userRecord[0])) {
                    userScore = Integer.valueOf(userRecord[1]);
                }
            }

        }

        if (userScore < 0) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return userScore;
    }
}
