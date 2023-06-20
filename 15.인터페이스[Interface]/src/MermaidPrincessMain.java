
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("-----------MermaidPrincess------------");
		MermaidPrincess mp = new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.liveSea();
		mp.fastswin();
		
		System.out.println("-----------Mermaid------------");
		Mermaid m = mp;
		m.liveSea();
		m.fastswin();
		
		System.out.println("-----------Princess------------");
		Princess p= mp;
		p.speak();
		p.think();
		
		System.out.println("-----------Mermaid <---> Princess------------");
		Mermaid m2 = new MermaidPrincess();
		m2.fastswin();
		m2.liveSea();
		Princess p2 = (Princess)m2;
		p2.speak();
		p2.think();
		
		System.out.println("-----------Object------------");
	}

}
