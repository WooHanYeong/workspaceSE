public abstract class Employee {  //컨트롤+1
    private int no;
    private String name;
    private int pay;
    
    public final static double INCETIVE_RATE =0.1;
    
    
    public Employee() {
    	
    }
    
    public Employee( int no,String name) {
		super();
		this.no = no;
		this.name = name;
		
	}
    
    /*
     * 급여계산
     * -실제구현작업 불가능
     * -자식클래스에서 반드시 재정의해야하는 메쏘드
     * -재정의강제(규칙,specfication)
     */
	public abstract void calculatePay();
	
	/*
	 * 인센티브계산(급여가 200만원이 넘으면 10% 인센티브지급)
	 * 	-모든 사원들의 인센티브계산방법 동일함
	 * 	-재정의금지()
	 */
	public final double calculateIncentive() {
		double incentive = 0.0;
		if(this.pay>2000000) {
			incentive = this.pay*INCETIVE_RATE;
		}
		return incentive;
	}
	
	
	public void print() {
		System.out.println(this.no+"\t"+this.name +"\t"+this.pay + "\t");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
    

	
	
}
