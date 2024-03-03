
public class operator5 {

	public static void main(String[] args) {
		// 四則演算、剰余
		//割り算の注意点
		//割り算「/」で小数点以下を求めたい場合、浮動小数点型を使用します。
		//代入先の型に浮動小数点型を指定していても、計算式自体が整数の場合は小数点以下を求めることはできません。 
		//計算式の前に(float)など型を指定することによって、小数点以下を求めることができるようになります。
		
		//整数型に代入
		float a1 = 5 / 2;
		System.out.println(a1 + "\n");
		
		//浮動小数点型に代入
		float  a2 = (float)5 / 2;
		System.out.println(a2);
		
	}

}
