package day17;

public class Wrapperclass {
	public static void main(String[] args) {
		//autoboxing
		int num=10;
		Integer wrapInt=num;
		System.out.println(wrapInt);
		byte num1=20;
		Byte wrapByte=num1;
		System.out.println(wrapByte);
		long num2=10000;
		Long wrapLong=num2;
		System.out.println(wrapLong);
		short num3=45;
		Short wrapShort=num3;
		System.out.println(wrapShort);
		double num8=12.678;
		Double wrapDouble=num8;
		System.out.println(wrapDouble);
		float num10=17.676f;
		Float wrapFloat=num10;
		System.out.println(wrapFloat);
		//unboxing
		int num4=wrapInt;
		System.out.println(num4);
		byte num5=wrapByte;
		System.out.println(num5);
		long num6=wrapLong;
		System.out.println(num6);
		short num7=wrapShort;
		System.out.println(num7);
		double num9=wrapDouble;
		System.out.println(num9);
		float num11=wrapFloat;
		System.out.println(num11);
		
		
		
	}

}
