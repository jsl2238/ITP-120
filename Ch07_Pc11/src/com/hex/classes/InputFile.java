package com.hex.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFile
{
    final String path;
    final File file;

    public InputFile(String path)
    {
        this.path = path;
        this.file = new File(path);
    }

    public ArrayList<Double> convertToDoubleList()
    {
        ArrayList<Double> dbl = new ArrayList<Double>();

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine())
            {
                String data = scan.nextLine();

                dbl.add(Double.parseDouble(data));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return dbl;
    }

}
