package P344LOTS_OF.HeshSET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class P345 {
    public static void main(String[] args) throws IOException {
        Set<String[]> words = new TreeSet<>();
        File file = new File("C:\\Users\\Artem\\Documents\\Java\\EKKEL\\src\\P325Container\\SetOp.java");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = null;
        System.out.println(bufferedReader.read());
        List<String[]> rows = new ArrayList<>();
        while ((line = bufferedReader.readLine())!= null){
            String[]row = line.split("\t");
            rows.add(row);
        }
        System.out.println(rows.toString());



    }
}
