package view;

import controller.QuickController;

public class Principal {

	public static void main(String[] args) {
		QuickController qk = new QuickController();
		int[] vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		vt = qk.quicksort(vt, 0, vt.length-1);
		for(int valor: vt) {
			System.out.print(valor);
			System.out.print(" ");

	}

}
}