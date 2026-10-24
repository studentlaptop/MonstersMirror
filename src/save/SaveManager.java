package save;

public class SaveManager {
    private static boolean newSave = true;

    public static boolean isNewSave() {
        return newSave;
    }

    public static void setNewSave(boolean newSave) {
        SaveManager.newSave = newSave;
    }
}
