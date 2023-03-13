package seedu.duke.secrets;
import java.util.regex.Pattern;

/**
 * Represents the basic "Password-like" class, is supposed to be the parent class
 * of all future password classes
 *
 * For now the uid is equivalent to password name (duplicated)
 * Both will be kept in the event of an eventual shift
 */
public class Secret {
    private static final Pattern ILLEGAL_CHARS_PATTERN =
            Pattern.compile("^.*[~#@*+%{}<>\\[\\]|\"\\_].*$");
    private String uid = "";
    private String name = "";
    private String folderName = "unlinked";

    public Secret(String name, String folderName) {
        // Assumes that name is not illegal before creation
        this.name = name;
        uid = name; // current just a duplicated, can be changed later
        this.folderName = folderName;
    }
    
    public static boolean isIllegalName(String name) {
        return ILLEGAL_CHARS_PATTERN.matcher(name).matches();
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }


    public void editName(String newName) {
        name = newName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
}