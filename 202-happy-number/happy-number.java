class Solution {
    public int getNext(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n , fast = n;

        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }while(slow != fast);

        if (slow == 1)  return true;
         else return false;
    }
}