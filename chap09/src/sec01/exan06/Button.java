package sec01.exan06;

public class Button {
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		//���� ��ü�� onClick() �޼ҵ� ȣ��
		listener.onClick(); 
	}
	
	//��ø �������̽�
	static interface OnClickListener{
		void onClick();
	}

}
