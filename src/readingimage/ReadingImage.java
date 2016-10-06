package readingimage;
//importing java packages
import java.io.*;
import com.asprise.ocr.Ocr;
import java.util.Scanner;
public class ReadingImage {

    public static void main(String[] args) {
        Ocr.setUp();
Ocr ocr = new Ocr(); 
ocr.startEngine("eng",Ocr.SPEED_FAST);
String a,b,c; 
Scanner ui=new Scanner(System.in);
System.out.println("Enter Name of 1st File with its Extension");
a = ui.next();
System.out.println("Enter Name of 2nd File with its Extension");
b = ui.next();
System.out.println("Enter Name of 3rd File with its Extension");
c = ui.next();

String s1 = ocr.recognize(new File[] {new File("tested/"+a)}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT,"PROP_PAGE_TYPE=single_char|PROP_IMG_PREPROCESS_TYPE=custom|PROP_IMG_PREPROCESS_TYPE_CUSTOM_CMDS=scale(0.25)|PROP_LIMIT_TO_CHARSET=ABCDEFGHIJKLMNOPQRSTUVWXYZ");
String s2 = ocr.recognize(new File[] {new File("tested/"+b)}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT,"PROP_PAGE_TYPE=single_char|PROP_IMG_PREPROCESS_TYPE=custom|PROP_IMG_PREPROCESS_TYPE_CUSTOM_CMDS=scale(0.25)|PROP_LIMIT_TO_CHARSET=ABCDEFGHIJKLMNOPQRSTUVWXYZ");
String s3 = ocr.recognize(new File[] {new File("tested/"+c)}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT,"PROP_PAGE_TYPE=single_char|PROP_IMG_PREPROCESS_TYPE=custom|PROP_IMG_PREPROCESS_TYPE_CUSTOM_CMDS=scale(0.25)|PROP_LIMIT_TO_CHARSET=ABCDEFGHIJKLMNOPQRSTUVWXYZ");

System.out.println("Character of 1st File \n"+ s1);
System.out.println("Character of 2nd File \n" + s2);
System.out.println("Character of 3rd File \n" + s3);

ocr.stopEngine();
    }
    
}
