class TestEmployee{
	public static void main(String[]args) {
		Worker ht = new Worker("ht " , 12000);
		Manager facai = new Manager("facai" , 20000 ,1000);
		TestEmployee a  = new TestEmployee();
		a.showEmpAnnual(facai);
		a.showEmpAnnual(ht);
		a.testWork(facai);
		a.testWork(ht);
		
	}
	
	public void showEmpAnnual(Employee e ) {
		System.out.println(e.getAnnual());
	}
	public void testWork(Employee e ) {
		if (e instanceof Worker) {
			((Worker) e).work(); //向下转型
		}else if(e instanceof Manager) {
			((Manager) e).manage(); //向下转型
			
		}else {
			System.out.println("不做任何操作");
		}
	}
}