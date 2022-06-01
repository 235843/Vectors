import java.io.*;
import java.util.*;

public class VectorClass {
    public Scanner scan = new Scanner(System.in);
    public Vector <Integer> vec1 = new Vector<>();
    public Vector <Integer> vec2 = new Vector<>();
    public Vector <Integer> resVec = new Vector<>();


    void addVectors(){
        for(int i=0;i<vec1.size();i++)
            resVec.add(vec1.get(i) + vec2.get(i));
    }

    int readVector(){

        String t = scan.nextLine();
        String[] tab = t.split(" ");
        for(int i=0;i<tab.length;i++)
        {
            try{
                int temp = Integer.parseInt(tab[i]);
                resVec.add(temp);
            }
            catch (Exception e) {
                resVec.clear();
                System.out.println("Podano bledny wektor, sprobuj jeszcze raz");
                return 1;
            }
        }
        return 0;
    }

    void readTwoVectors(){
        while(true)
        {
            if(readVector()==1)
                continue;
            vec1.addAll(resVec);
            resVec.clear();
            break;
        }
        while(true)
        {
            if(readVector()==1)
                continue;
            vec2.addAll(resVec);
            resVec.clear();
            break;
        }
    }


}
