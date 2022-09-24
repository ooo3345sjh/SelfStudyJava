package sec01.exan06;

public class Button {
	//인터페이스 타입 필드
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		//구현 객체의 onClick() 메소드 호출
		listener.onClick(); 
	}
	
	//중첩 인터페이스
	static interface OnClickListener{
		void onClick();
	}

}
