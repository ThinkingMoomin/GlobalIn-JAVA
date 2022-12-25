package Chapter19;

import java.util.Arrays;

public class INum {
    private int num;

    public INum(int num) {

        this.num = num;
    }
    @Override
    public boolean equals(Object obj) {

        if(this.num == ((INum)obj).num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[1] = new INum(2);
        ar1[2] = new INum(3); ar2[2] = new INum(3);

        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if(num1.equals(num2))
            System.out.println("num1, num2 내용 동일하다.");
        else
            System.out.println("num1, num2 내용 다르다.");

        if(num1.equals(num3))
            System.out.println("num1, num3 내용 동일하다.");
        else
            System.out.println("num1, num3 내용 다르다.");

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

