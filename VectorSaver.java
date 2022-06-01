import java.io.*;
import java.util.*;

public class VectorSaver {
     void SaveVector(Vector<Integer> vec) throws Exception{
        PrintWriter save = new PrintWriter(new FileWriter("vector.txt"));
        save.println(vec);
        save.close();
    }
}
