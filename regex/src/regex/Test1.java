package regex;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = ":[0-9]";
		String str = "您办理的产品[国际漫游]与现有的产品[商户管家（单机版）20元套餐:20]互斥，不能办理";
		System.out.println(str.replaceAll(regex, str));
	}

}
