import java.util.Scanner;

public class Homework221 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

//����һ�� ��������
class Fraction {
	//�������
	int  fz;
	//�����ĸ
	int  fm;

	//���캯��
//	Fraction(){
//		toReduction(new Fraction());
//	}
	Fraction(int a, int b){
		this.fz = a;
		this.fm = b;
//		Fraction m1 = new Fraction();
//		this.fz =m1.fz;
//		this.fm =m1.fm;
	}
	//������ת��ΪС��
	double toDouble() {
        double fz = this.fz;
        double fm = this.fm;
        return fz/fm;
	}
	//������r���Լ���Ӳ�����
	Fraction plus(Fraction r) {
		int fz = (int)this.fz * r.fm + r.fz * this.fm;
		int fm = (int)this.fm * r.fm;
        Fraction m1 = new Fraction(fz,fm);
        return toReduction(m1);
	}
	//������r���Լ���˲�����
	Fraction multiply(Fraction r) {
		int fz = this.fz * r.fz;
		int fm = this.fm * r.fm;
		Fraction m1 = new Fraction(fz,fm);
		return toReduction(m1);
	}
	//��ӡ�Լ��ķ�����ʽ
	void print() {
		Fraction m1 = toReduction(this);
        if (m1.fm == m1.fz){
           System.out.println(m1.fm);
        }
        else{
           System.out.println(m1.fz+"/"+m1.fm);
        }
	}
	//Լ�ַ����ķ���
	Fraction toReduction (Fraction r){
        int fz = r.fz;
        int fm = r.fm;
//		if (fm != fz){  
          for (int i = 2; (i<=fm&&i<=fz); i++){
        		if ((fm%i == 0)&&(fz%i == 0)){
        			fm = fm/i;
        			fz = fz/i;
        		}
        	}
//        }
        return new Fraction(fz,fm);
	}
}