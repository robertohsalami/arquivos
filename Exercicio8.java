public class Exercicio8 {

	public static void main(String[] args) {
		Integer a = 17;
		Integer b = 23;
		
		Integer c = Exercicio8.criarInteiroC(a, b);
		System.out.println(c.toString());
		
	}
	
	static Integer criarInteiroC(Integer a, Integer b) {
		String valueOf = String.valueOf(a);
		String valueOf2 = String.valueOf(b);
		
		StringBuilder c = new StringBuilder();
		
		int it = 0;
				
		for(int i = 0; i < valueOf.length(); i++) {
			c.append(valueOf.charAt(i));
			for(int it2 = it; it2 < valueOf2.length();) {
				c.append(valueOf2.charAt(it));
				it++;
				break;
			}
		}		
		
		return Integer.valueOf(c.toString());
		
	}

}