package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {         //�Ű����� Member Ÿ������ Ȯ��
			Member member = (Member) obj;   //MemberŸ������ ���� Ÿ�� ��ȯ�ϰ�
			if(id.equals(member.id)) {      //id�ʵ尪�� �������� �˻��� ��, �����ϴٸ� true�� ����
				return true;
			}
		}
		return false;                       // �Ű����� memberŸ���� �ƴϰų� 
	}                                       // id�ʵ尪�� �ٸ� ��� false�� ����

}
