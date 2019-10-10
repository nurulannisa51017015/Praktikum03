public class demobuku{
	public static void main(String args[]){
	
	buku a,b;
	a=new buku();
	b=new buku();
	a.pengarang="Felix Siauw";
	a.judul="Beyond The Inspiration";
	b.pengarang="Budi Raharjo";
	b.judul="mudah Belajar Java";
	System.out.println("Judul: "+ a.judul+" pengarang : "+ a.pengarang);
    System.out.println("Judul: "+ b.judul+" pengarang : "+ b.pengarang);	
    }
}