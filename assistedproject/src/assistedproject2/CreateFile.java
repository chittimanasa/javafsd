package assistedproject2;

import java.io.File;  
import java.io.IOException;   
public class CreateFile {  
            public static void main(String args[]) {  
            try {  
                
                    File f0 = new File("C:FileOperationCreate.txt");   
                    if (f0.createNewFile()) {  
                               System.out.println("File " + f0.getName() + " is created successfully.");  
                    } else {  
                               System.out.println("File is already exist in the directory.");  
                    }  
                  } catch (IOException exception) {  
                           System.out.println("An unexpected error is occurred.");  
                           exception.printStackTrace();  
               }   
     }  
}  