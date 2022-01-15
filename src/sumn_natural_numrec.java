import java.util.Scanner;
public class sumn_natural_numrec {
    //int first_natural_num(n)=1;
    // sum till the last input natural num (num)
    // sum for calculating sum
    void natsum(int n,int num,int sum)
    {
        if(n==num)
        {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;
        natsum(n+1,num,sum);

    }
    public static void main(String[] args) {
        sumn_natural_numrec obj=new sumn_natural_numrec();
        obj.natsum(1,3,0);
    }
}
