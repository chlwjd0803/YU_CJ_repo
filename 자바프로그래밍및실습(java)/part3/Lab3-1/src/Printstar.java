import java.util.Scanner;

//별 개수를 1개씩 줄여나가며 출력해주는 프로그램
public class Printstar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        var n = sc.nextInt();

        for(int i=n; i>0; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        sc.close(); //스캐너 종료
    }
}