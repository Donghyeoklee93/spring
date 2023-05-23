package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        //as-is
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();


        //to-be
        String password = passwordGenerator.generatePassword();
        /**
         * password must be between 8 and 12 characters
         */

        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
