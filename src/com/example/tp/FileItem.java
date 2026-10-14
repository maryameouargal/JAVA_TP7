package com.example.tp;

public class FileItem extends FsItem {

    private long size;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY

	public FileItem(String name, long size) {
		super(name);
		this.size = size;
	}
	
    @Override
    public long getSize() {
        return size;
    }

}
