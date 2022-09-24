package sec01.exam06;

public class sportsCar extends Car{
	@Override
	public void speedUp() { speed += 10; }
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/ //재정의할 수 없음
}
