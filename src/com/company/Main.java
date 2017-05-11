package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        /*Scanner s = new Scanner(new FileReader("named names.txt"));
        List<FileObject1> al = new ArrayList<FileObject1>();
        while(s.hasNextLine()){
            String line = s.nextLine();
            al.add(new FileObject1().createFileObject(line));
        }
        Collections.sort(al, new FileObjectComparator());
        for(FileObject1 i: al)
            System.out.println(i);
*/
        Scanner h = new Scanner(new FileReader("rawDataU6.txt"));
        List<FileObject2> a2 = new ArrayList<FileObject2>();
        while(h.hasNextLine()) {
            String line2 = h.nextLine();
            a2.add(new FileObject2().createFileObject2(line2));
        }
    }
}
class FileObject2{
    private int avgtotalscore;
    private int frq1, frq2;

    public FileObject2 createFileObject2(String line2)
    {
        if(line2 != null && !line2.isEmpty())
        {
            for(String num : line2.split(".")){
                num = num.trim();
                if(num.matches("([\\d]*)")){
                    avgtotalscore = frq1+frq2/2;
                }else{
                    frq1 = Integer.valueOf(num);
                    frq2 = Integer.valueOf(num);
                }
            }
        }
        return this;
    }
}
class FileObject1{
    private int sn;
    private String name;

    public FileObject1 createFileObject(String line)
    {
        if(line != null && !line.isEmpty())
        {
            for(String str : line.split(","))
            {
                str = str.trim();
                if(str.matches("([\\d]*)"))
                {
                    sn = Integer.valueOf(str);
                }else{
                    name = str;
                }
            }
        }
        return this;
    }
    @Override
    public String toString(){
        return "[Secret Number] "+sn+ " [Name] "+name;
    }
}

class FileObjectComparator implements Comparator<FileObject1>{
    @Override
    public int compare(FileObject1 o1, FileObject1 o2){
        return 0;
    }
}
