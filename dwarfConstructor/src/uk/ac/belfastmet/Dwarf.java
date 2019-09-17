package uk.ac.belfastmet;

public class Dwarf {
 private String name;
 private String author;
 
 Dwarf(String nName, String nAuthor)
 {
	 name = nName;
	 author = nAuthor;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
 
 
 
}
