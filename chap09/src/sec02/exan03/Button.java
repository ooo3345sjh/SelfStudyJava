package sec02.exan03;

public class Button {
	
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	//�Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//���� ��ü�� onClick()�޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}

}
