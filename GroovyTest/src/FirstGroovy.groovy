//Ŭ���� ����
class Employee {
	def salary //def�� var�� ���� �ǹ�
	double calculateRaise(c) {
		return c(salary) 
		/*��ݰ��� ���� ��������Ʈ(Action[���ϰ�X], Func[���ϰ�O])�� ���� Ÿ���� �ݵ�� �־�� �Ǵµ�
		 * Groovy�� �̸��� �ѱ�� ��
		 * */
	}
}
 
//Ŭ���� ���� �κ�, ��ݰ��� ���� new Employee(){salary=1000}
Employee employee1 = new Employee(salary:1000)
//�Ķ���ͷ� �ѱ� ��������Ʈ ����, �Ʒ��ڵ�� ����̶� ���� ����
def raise1 = {z -> (z * 1.5)}
println employee1.calculateRaise(raise1) //������ Ŭ������ ��������Ʈ �ѱ�
 
Employee employee2 = new Employee()
employee2.salary = "����"; //�䷸�Ե� �ص� ��, �̹��� �ѹ� ���ڿ��� ��ȯ

def raise2 = {z -> (z + "�α�")}
//println employee2.calculateRaise(raise2)

//����� var�� ���������� ���� �Է½� Ÿ���� ������, ����Ÿ���� java.util.Map���� ��ȯ��
def map = ['name':'Bashar', 'age':26, skills:['Java', 'Groovy'], 'author':true]
assert map.size() == 4

map += ['city':'Tucson']
assert map == ['name':'Bashar', 'age':26, skills:['Java', 'Groovy'], 'author':true, 'city':'Tucson']
 
(1..5).each{println it}
