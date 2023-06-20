
public class GajunTv implements GajunOnOff, GajunVolume{
	public void operation1() {
		System.out.println("Tv.operation1()");
	}
	
	public void operation2() {
		System.out.println("Tv.operation2()");
	}
	
	
	
	@Override
	public void up() {
		System.out.println("TV.up()");
	}

	@Override
	public void down() {
		System.out.println("TV.down()");		
	}

	@Override
	public void on() {
		System.out.println("TV.on()");
	}
	
	@Override
	public void off() {
		System.out.println("TV.off()");		
	}
	
	
}
