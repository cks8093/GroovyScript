//클래스 생성
class Employee {
	def salary //def는 var와 같은 의미
	double calculateRaise(c) {
		return c(salary) 
		/*닷넷같은 경우는 델리게이트(Action[리턴값X], Func[리턴값O])과 같이 타입을 반드시 있어야 되는데
		 * Groovy는 이름만 넘기면 됨
		 * */
	}
}
 
//클래스 생성 부분, 닷넷같은 경우는 new Employee(){salary=1000}
Employee employee1 = new Employee(salary:1000)
//파라미터로 넘길 델리케이트 생성, 아래코드는 닷넷이랑 차이 없음
def raise1 = {z -> (z * 1.5)}
println employee1.calculateRaise(raise1) //생성된 클래스에 델리게이트 넘김
 
Employee employee2 = new Employee()
employee2.salary = "대한"; //요렇게도 해도 됨, 이번에 한번 문자열로 변환

def raise2 = {z -> (z + "민국")}
//println employee2.calculateRaise(raise2)

//닷넷의 var와 마찬가지로 값을 입력시 타입이 결정됨, 현재타입은 java.util.Map으로 변환됨
def map = ['name':'Bashar', 'age':26, skills:['Java', 'Groovy'], 'author':true]
assert map.size() == 4

map += ['city':'Tucson']
assert map == ['name':'Bashar', 'age':26, skills:['Java', 'Groovy'], 'author':true, 'city':'Tucson']
 
(1..5).each{println it}

