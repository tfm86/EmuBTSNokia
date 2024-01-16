import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

Scanner ReadFile;
File TextFile;

public Scanner ReadFileAll(String f){

TextFile = new File(f);

try {
	ReadFile = new Scanner(TextFile);
	
} catch (FileNotFoundException e) {
	System.out.println("Erro: File not Found!");
}

return ReadFile;
	
}



}
