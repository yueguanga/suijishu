/*
* 三次值大于15，则手气不错
* 三次值在10-15区间，则手气还行
* 三次值在10以下，则一般
* */
public class TestIf01 {
    public static void main(String[] args) {
        int i =(int)(Math.random()*6+1);
        int j =(int)(Math.random()*6+1);
        int k =(int)(Math.random()*6+1);
        System.out.println("你掷出的骰子总数是"+(i+j+k));
        int count=i+j+k;
        if(count>15){
            System.out.println("手气不错");
        }
        if(count>10&&count<15||count==15||count==10){
            System.out.println("手气还行");
        }
        if(count<10){
            System.out.println("你真的拉");
        }
    }
}
