package basics;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctions {
    public static void main(String[] args) throws IOException {
        String s1= "apple, apple  and orange please";
//        String[] parts= s1.split("\\b");
//        for(String part:parts){
//            if(part.matches("\\w+")){
//                System.out.println(part);
//            }
//        }
//        Pattern p= Pattern.compile("\\w+");
//        Matcher m=p.matcher(s1);
//        while (m.find()){
//            System.out.println(m.group()+" :"+m.groupCount());
//        }
        try(Writer w= Files.newBufferedWriter(Paths.get("test.properties"))){
            System.getProperties().store(w,"this is test properites file");
        }
    }
}
