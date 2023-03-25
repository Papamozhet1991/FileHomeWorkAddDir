import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        StringBuilder temp = new StringBuilder();

        File dirGames = new File("C://Games");
        if (dirGames.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirSrc = new File("C://Games/src");
        if (dirSrc.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
    }
        else {
        System.out.println("Возникли проблемы");
        temp.append("Возникли проблемы c созданием директории\n");
    }

        File dirRes = new File("C://Games/res");
        if (dirRes.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirSavegames = new File("C://Games/savegames");
        if (dirSavegames.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirTemp = new File("C://Games/temp");
        if (dirTemp.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirSrcMain = new File("C://Games/src/main");
        if (dirSrcMain.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirSrcTest = new File("C://Games/src/test");
        if (dirSrcTest.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirResDrawables = new File("C://Games/res/drawables");
        if (dirResDrawables.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirResVectors = new File("C://Games/res/vectors");
        if (dirResVectors.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File dirResIcons = new File("C://Games/res/icons");
        if (dirResIcons.mkdir()){
            System.out.println("Успешно");
            temp.append("Директория успешно создана\n");
        }
        else {
            System.out.println("Возникли проблемы");
            temp.append("Возникли проблемы c созданием директории\n");
        }

        File fileTempTemp = new File("C://Games/temp/", "temp.txt");
        try {
            if (fileTempTemp.createNewFile()){
                System.out.println("Файл был создан");
                temp.append("Файл был успешно создан\n");
            } else {
                temp.append("Возникли проблемы с созданием файла\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileSrcMainMain = new File("C://Games/src/main", "Main.java");
        try {
            if (fileSrcMainMain.createNewFile()){
                System.out.println("Файл был создан");
                temp.append("Файл был успешно создан\n");
            } else {
                temp.append("Возникли проблемы с созданием файла\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileSrcMainUtils = new File("C://Games/src/main", "Utils.java");
        try {
            if (fileSrcMainUtils.createNewFile()){
                System.out.println("Файл был создан");
                temp.append("Файл был успешно создан\n");
            } else {
                temp.append("Возникли проблемы с созданием файла\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter file = new FileWriter(fileTempTemp)) {
            file.append(temp);
        }
    }
}