package com.example.tp;

public class NewMain {
public static void main(String[] args) {
	FileSystem fs = new FileSystem();

    // fichiers
    FileItem cours = new FileItem("cours.pdf", 250000);
    FileItem photo = new FileItem("photo.jpg", 1800000);
    FileItem musique = new FileItem("song.mp3", 4200000);

    // Repertoire "travail" 
    Directory travail = new Directory("travail");
    travail.add(cours);
    travail.add(photo);

    // Repertoire "media" 
    Directory media = new Directory("media");
    media.add(musique);

    // Repertoire "perso" 
    Directory perso = new Directory("perso");
    perso.add(travail);
    perso.add(media);

    // On ajoute tout ca au systeme
    fs.addRoot(perso);
    fs.addRoot(new FileItem("todo.txt", 500));

    // Affichage
    fs.listAll();
    System.out.println();
    System.out.println("Taille totale = " + fs.totalSize() + " octets");
 }
}

