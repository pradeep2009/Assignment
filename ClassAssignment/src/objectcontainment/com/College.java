package objectcontainment.com;

public class College {

	public static void main(String[] args) {
		Question q=new Question();
		q.setQ_id(101);
		q.setQ_name("pradeep");
		
		Subtopic s=new Subtopic();
		s.setS_id(222);
		s.setS_name("sin cos");
		s.setObj(q);
		//System.out.println(s.getObj());
		
		Topic t=new Topic();
		t.setT_id(666);
		t.setT_name("trignometry");
		t.setObj(s);
		//System.out.println(t.getObj());
		
		Subject s1=new Subject();
		s1.setS_id(201);
		s1.setS_name("Math");
		s1.setObj(t);
		//System.out.println(s1.getObj());
		
		Branch b=new Branch();
		b.setB_id(444);
		b.setB_name("computer");
		b.setObj(s1);
		//System.out.println(b.getObj());
		
		
		Institute i=new Institute();
		i.setI_id(8545);
		i.setI_name("vishwakarma");
		i.setObj(b);
		System.out.println("Institute id: "+i.getI_id());
		System.out.println("Institute name: "+i.getI_name());
		System.out.println(i.getObj());
		
		
		

	}

}
