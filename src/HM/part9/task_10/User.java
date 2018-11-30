package HM.part9.task_10;

public class User {
    String name;
    private char[] password;

    public User(String youname, char[] password) {
        name = youname;
        this.password = password;
    }

    public void setName(String aName)
    {
        name = aName;
    }

    public void setPassword(char[] aPassword)
    {
        password = aPassword;
    }

    public String getName() {
        return name;
    }

    public char[] getPassword() {
    return password;
    }
}
