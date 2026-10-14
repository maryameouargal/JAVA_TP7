package com.example.tp;

public class FileSystem {
	   private FsItem[] items;
	   private int count;
//		THE CONSTRUCTEUR USING SOURCE ONLY
	   public FileSystem() {
		    this.items = new FsItem[4];
		    this.count = 0;
		}
//     ADD AN ELEMNENT 
	    public void addRoot(FsItem item) {
	        if (count == items.length) {
	            FsItem[] bigger = new FsItem[items.length * 2];
	            System.arraycopy(items, 0, bigger, 0, items.length);
	            items = bigger;
	        }
	        items[count] = item;
	        count++;
	    }

 //  Affichage 
	    public void listAll() {
	        for (int i = 0; i < count; i++) {
	            FsItem f = items[i];
	            if (f instanceof Directory) {
	                ((Directory) f).list(0);
	            } else {
	                System.out.println(f);
	            }
	        }
	    }

// Taille totale 
	    public long totalSize() {
	        long total = 0;
	        for (int i = 0; i < count; i++) {
	            total += items[i].getSize();
	        }
	        return total;
	    }	   
}
