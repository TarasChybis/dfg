package chybis;

import java.util.Scanner; //����������� ������, (���������� ������)

public class TotalSumPetrolKyivOdesaInteractiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // �������������� ������. ���������� ��� ���������� "Scanner", ���������
												// ������� ������ ������ ������ (System.in - � ����������)
		System.out.println("������� ��������� 1� ������� (UAH):"); // ���� �����, ����� ������������ ���� ��������� �
																	// ����������
		double fuilPrice = sc.nextDouble();
		double fuilR = 8;
		System.out.println("������� ���������� ������� (��):"); // ���� �����, ����� ������������ ���� ��������� �
																// ����������
		int distance = sc.nextInt(); // ������ �������� ���������� ��������� ������. ��� ������� ������� �� ����
										// ����������
		double totalSum;

		totalSum = fuilR / 100 * fuilPrice * distance * 2;

		System.out.println("����� ������� " + totalSum + " UAH");

	}

}
