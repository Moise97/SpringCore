package com.springexample.SpringCore.POJOs.shop;

import java.io.*;
import java.util.Date;

public class Cashier {

    private String fileName;
    private String path;
    private BufferedWriter writter;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void openFile() throws IOException {
        File targetDir = new File(path);
        if(!targetDir.exists()) {
            targetDir.mkdir();
        }
        File checkoutFile = new File(path, fileName + ".txt");
        if(!checkoutFile.exists()) {
            checkoutFile.createNewFile();
        }
        writter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(checkoutFile, true)));
    }

    public void checkout( ShoppingCart cart) throws IOException {
        writter.write(new Date() + "\t" +cart.getItems() + "\r\t");
        writter.flush();
    }

    public void closeFile() throws IOException {
        writter.close();
    }

}
