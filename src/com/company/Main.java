package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(new FileReader("named names.txt"));
        List<FileObject1> al = new ArrayList<FileObject1>();
        while(s.hasNextLine()){
            String line = s.nextLine();
            al.add(new FileObject1().createFileObject(line));
        }
        Collections.sort(al, new FileObjectComparator());
        for(FileObject1 i: al)
            System.out.println(i);
    }
}

class FileObject1{
    private int sn;
    private String name;
    private double avgtotalgrade;
    private int frqq1, frqq2;

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
        return 5;
    }
}
