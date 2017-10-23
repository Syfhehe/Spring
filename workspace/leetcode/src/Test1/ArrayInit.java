package Test1;

public class ArrayInit {

	// 第一种：特殊初始化，不用new关键字完成，在数组声明的同时完成初始化操作，也被称其为静态初始化。主要原因是因为采用这种初始化的方式，数组的存储空间的分配是由编译器完成的。
	int[] a = { 1, 2, 3 };
	Integer[] b = { new Integer(1), 2, 3 };

	// 第二种：使用new关键字创建数组，同时为数组中的元素赋值，完成出事化操作。
	int[] c = new int[] { 1, 2, 3 }; //使用new关键字创建数组，同时为数组中的元素赋值，完成出事化操作。
	int[] d = new int[] { new Integer(1), new Integer(2), 3 };
	
	int[] e = new int[2];

}
