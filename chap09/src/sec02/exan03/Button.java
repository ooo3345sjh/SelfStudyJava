package sec02.exan03;

public class Button {
	
	//인터페이스 타입 필드
	OnClickListener listener;
	
	//매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//수현 객체의 onClick()메소드 호출
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}

}
