package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		Data data2 = new Data(23, "janeiro", 2022);
		
		
		System.out.println(data1.retornaData());
		System.out.println(data2.retornaData());
	}
}
