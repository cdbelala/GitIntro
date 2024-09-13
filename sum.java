public class sum{
    public static void main(String[] args){
        sum addNums = new sum();
        int a = 79;
        int b = 21;
        System.out.println(addNums.add(a, b));
    }

    int add(int a, int b){
        return a + b;
    }
}