package sec01.exam04;

public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;

	//turnOn()�߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}
	//turnOff()�߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	//setVolume()�߻� �޼ҵ��� ��ü �޼ҵ� - �������̽� ����� �̿��ؼ� volume�ʵ��� ���� ����
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}
	
	

}
