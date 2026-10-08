import java.util.Scanner;
public class test {
    public static void main(String[] args){

        /*for(int num = 1; num <= 9; num++){
            for(int dan = 2; dan <= 9; dan++){
                System.out.print(dan + "*" + num + "=" + dan*num + "\t");
            }
            System.out.println();
        }*/
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sub = sc.nextInt();
        int mul = sc.nextInt();
        double div = sc.nextDouble();
        String opter = sc.nextLine();
        System.out.println("쓰고싶은 연산자를 입력해주세요");
        switch(opter){
            case "+":
                System.out.println("더할 숫자를 입력해주세요(-1을 입력시 종료)");
                while(true){
                    int num = sc.nextInt();
                    if(num == -1){
                        break;
                    }
                    sum += num;
                }
                System.out.println("결과값" + sum);break;
            case "-":
                System.out.println("뺄 숫자를 입력해주세요(-1을 입력시 종료)");
                while(true){
                    int num = sc.nextInt();
                    if(num == -1){
                        break;
                    }
                    sub -= num;
                }
                System.out.println("결과값" + sub);break;
            case "*":
                System.out.println("곱할 숫자를 입력해주세요(-1을 입력시 종료)");
                while(true){
                    int num = sc.nextInt();
                    if(num == -1){
                        break;
                    }
                    mul *= num;
                }
                System.out.println("결과값" + mul);break;
            case "/":
                System.out.println("나눌 숫자를 입력해주세요(-1을 입력시 종료)");
                while(true){
                    int num = sc.nextInt();
                    if(num == -1){
                        break;
                    }
                    div /= num;
                }
                System.out.println("결과값:" + div);break;
        }
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}