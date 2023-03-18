package basics;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.stream.Collectors;

public class FileFilterDemo {
    public static void main(String[] args) throws InterruptedException {

        FileFilter filter= new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        File f= new File("/Users/priyanshuparate/projects/java/fundametals/java_practice/src/main/java/basics");
//        File[] files=f.listFiles(filter);
//
//      for(File fr:files) {
//          System.out.println(fr);
//      }
//        Arrays.stream(f.listFiles(rf -> rf.getName().endsWith(".java"))).collect(Collectors.toList()).forEach(x-> System.out.println(x));

//        Runnable r= ()-> {
//                for (int i =0;i<10;i++){
//                    System.out.println("hello thread"+  Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//            }
//
//        };
//        Thread t= new Thread(r);
//        t.start();
//        t.join();
//        System.out.println("hellow form thread "+ Thread.currentThread().getName());


        Comparator<String> comp= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  Integer.compare(o2.length(),o1.length());
            }
        };

        List<String> arb= Arrays.asList("***","**","****","*");
        Collections.sort(arb,comp);
        for(String s:arb){
            System.out.println(s);
        }

    }
}
