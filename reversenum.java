package Sophmore;

public class reversenum {
    public void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
        System.out.println(isSameAfterReversals(1800));
        System.out.println(isSameAfterReversals(0));
    }

    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}

