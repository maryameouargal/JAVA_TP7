package com.example.tp;

public abstract class FsItem {
	 protected String name;

	 
//		THE CONSTRUCTEUR USING SOURCE ONLY
	 
	 public FsItem(String name) {
		this.name = name;
	 }

	 
//	 the getters using source 
	 

	 public String getName() {
		 return name;
	 }
	 public abstract long getSize();

//		TOSTRING USING SOURCE ONLY
	 @Override
	 public String toString() {
		return "FsItem [name=" + name + ", getSize()=" + getSize() + "]";
	 }
	 
	 
}
