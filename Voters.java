package Buffer;

public class Voters {
    private String name;
    private int ID;
    private int passcode;

    public Voters(int ID, int passcode, String name) {
        this.ID = ID;
        this.passcode = passcode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getPasscode() {
        return passcode;
    }
}
