package sells.ssp;







public class TawdiVaiClass {

String name;	
int age;	
String education;
String phonenumber;
int SSN;



public void getSumanaInfo() {
name = "sumana";
age =30;
education ="Degree";
phonenumber ="(646)-312-9667";
SSN = 20136789;

System.out.println(name + age + education + phonenumber + SSN );

}
public void getSagorInfo() {
name = "Sagor";
phonenumber = "(646)-335-4352";
age = 30;

System.out.println(name + phonenumber + age);
}
public void getTawhidInfo() {
	age = 45;
	String Address = "2312 12th";
	
	System.out.println("my age" + age + "my address" + Address);
}
 
public static void getBrianaInfo() {
String name = "Briana";
int ID = 23456;
System.out.println(name + ID);  
}






	public static void main(String[] args) {
		TawdiVaiClass obj = new TawdiVaiClass();
		obj.getSumanaInfo();
		obj.getSagorInfo();
		obj.getTawhidInfo();

		TawdiVaiClass.getBrianaInfo();
		// TODO Auto-generated method stub

	}

}







