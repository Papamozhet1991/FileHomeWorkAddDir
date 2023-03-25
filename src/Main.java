import java.io.FileWriter;
public class Main {
    public static void main(String[] args) throws Exception {

        StringBuilder temp = new StringBuilder();
        Installation installation = new Installation();

        installation.installationDir("C://Games", temp);
        installation.installationDir("C://Games/src", temp);
        installation.installationDir("C://Games/res", temp);
        installation.installationDir("C://Games/savegames", temp);
        installation.installationDir("C://Games/temp", temp);
        installation.installationDir("C://Games/src/main", temp);
        installation.installationDir("C://Games/src/test", temp);
        installation.installationDir("C://Games/res/drawables", temp);
        installation.installationDir("C://Games/res/vectors", temp);
        installation.installationDir("C://Games/res/icons", temp);

        installation.createFile("C://Games/temp/", "temp.txt", temp);
        installation.createFile("C://Games/src/main", "Main.java", temp);
        installation.createFile("C://Games/src/main", "Utils.java", temp);

        try (FileWriter file = new FileWriter("C://Games/temp/temp.txt")) {
            file.append(temp);
        }
    }
}