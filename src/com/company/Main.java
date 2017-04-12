package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(new FileReader("named names.txt"));
        List<FileObject> al = new ArrayList<FileObject>();
        while(s.hasNextLine()){
            String line = s.nextLine();
            al.add(new FileObject().createFileObject(line));
        }
        Collections.sort(al, new FileObjectComparator());
        for(FileObject i: al)
            System.out.println(i);
    }
}

class FileObject{
    private int sn;
    private String name;
    private double avgtotalgrade;
    private int frqq1, frqq2;

    public FileObject createFileObject(String line)
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

class FileObjectComparator implements Comparator<FileObject>{
    @Override
    public int compare(FileObject o1, FileObject o2){
        return o2.get
    }
}
