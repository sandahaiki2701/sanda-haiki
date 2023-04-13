public class Meja{
	public int kaki_Meja(){
		return 70;
	}
	public int alas_Meja(){
		return 120;
	}
public static void main (String[]args){
	Meja nana=new Meja();
	int kaki=nana.kaki_Meja();
	int alas=nana.alas_Meja();
	System.out.println(kaki*alas);

}
}
