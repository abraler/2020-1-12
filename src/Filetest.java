import java.io.File;
public class Filetest {
    public static void main(String[] args) {
        File file=new File("D:\\");
        Find(file);
    }
    public static void Find( File file){
            System.out.println(file.getPath());
                if(file.isDirectory()) {
                    if(file.listFiles()==null){
                        System.out.println(file.getName());
                    }
                    else {
                        for (File f : file.listFiles()) {
                            if (f.isDirectory()) {
                                Find(f);
                            } else {
                                System.out.println(f.getName());
                            }
                        }
                    }
        }
    }
}
