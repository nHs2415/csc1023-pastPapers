import java.io.IOException;
import java.io.File;

class Main{
    public static void main(String[] args) {
        try {
            File f = new File("maFile.txt");

            if (f.exists()){
                System.out.println("File exists..");
                System.out.println(f.getPath());
            }else {
                System.out.println("File not exists..");
            }

            if (f.createNewFile()){
                System.out.println("File created : "+f.getPath());
            }else {
                System.out.println("File already exists..");
            }
        }
        catch (IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}