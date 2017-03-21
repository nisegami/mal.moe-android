package moe.mal.waifus.model;

/**
 * Authorization Level Enum
 * Created by Arshad on 21/03/2017.
 */

public enum AuthLevel {
    USER(1, "User"), WEEB(2, "Weeb"), MOD(3, "Mod"), ADMIN(4, "Admin"), ARSHAD(5, "Arshad");

    private int value;
    private String repr;

    AuthLevel(int value, String repr) {
        this.value = value;
        this.repr = repr;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return repr;
    }
}
