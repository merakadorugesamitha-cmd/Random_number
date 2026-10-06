import java.util.Random;
public class Num_random {
    public static void main(String[] args){
        Random random=new Random();
        int first_number;
        int Secend_number;
        first_number= random.nextInt(1, 10);
        Secend_number= random.nextInt(-10,100);
        System.out.println(first_number);
        System.out.println(Secend_number);
    }
}
