import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> numgroup = new ArrayList<>();
        numgroup.add(1);
        numgroup.add(2);
        numgroup.add(3);
        numgroup.add(4);
        numgroup.add(5);
        numgroup.add(6);
        numgroup.add(7);
        numgroup.add(8);
        numgroup.add(9);
        numgroup.add(0);
        int hund = numgroup.remove(rand.nextInt(9));
        int ten = numgroup.remove(rand.nextInt(numgroup.size()));
        int one = numgroup.remove(rand.nextInt(numgroup.size()));
        String randnum = Integer.toString(hund *100+ten*10+one);
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        int n = 1;
        while(true){
            System.out.print(n+"번째 시도 : ");
            int inputnum = a.nextInt();
            String inputstring = Integer.toString(inputnum);
            int s = 0;
            int b = 0;
            for (int i = 0;i<3;i++){
                if (inputstring.charAt(i)==randnum.charAt(i)){
                    s++;
                }
                else if (randnum.contains(Character.toString(inputstring.charAt(i)))){
                    b++;
                }
            }
            if (b==3)
                System.out.println(b+"B");
            else if (s==3){
                System.out.println(s+"S");
                break;
            }
            else
                System.out.println(b+"B"+s+"S");
            n++;
        }
        System.out.println(n+"번만에 맞히셨습니다.\n게임을 종료합니다.");
    }
}