package com.example.tp;

public class Directory  extends FsItem {

	private FsItem[] children;
	private int count;

//	THE CONSTRUCTEUR USING SOURCE ONLY

	public Directory (String name) {
		super(name);
		this.children = new FsItem[4];
		this.count = 0;
	}

//   ADD A CHILD 
	public void add(FsItem item) {
		if (count == children.length) {
			FsItem[] bigger = new FsItem[children.length * 2];
			System.arraycopy(children, 0, bigger, 0, children.length);
			children = bigger;
		}
		children[count] = item;
		count++;
	}

	// Taille
	@Override
	public long getSize() {
		long total = 0;
		for (int i = 0; i < count; i++) {
			total += children[i].getSize();
		}
		return total;
	}

	// Affichage
	public void list(int indent) {
		System.out.println("   ".repeat(indent) + this);
		for (int i = 0; i < count; i++) {
			FsItem child = children[i];
			if (child instanceof Directory) {
				((Directory) child).list(indent + 1);
			} else {
				System.out.println("   ".repeat(indent + 1) + child);
			}
		}
	}
}
