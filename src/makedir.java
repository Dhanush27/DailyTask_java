import java.io.File;

public class makedir {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\training02\\Desktop\\Dire1");
        if (!file.exists()) 
        if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
            else {
            	file.delete();
            	System.out.println("Directory is deleted");
            }
            }
    }

       
  