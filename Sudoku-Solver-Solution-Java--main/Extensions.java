import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function.*
public static class Extensions{
 public static Integer[][][] resolve(Integer[][] filt){
        int var1 = filt.length;
        int var2 = filt[0].length;
        int count1;
        Integer[][][] var3 = new Integer[var1][var2][var2];
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                for(int k=0;k<var2;k++){
                    if(filt[i][j]!=0){
                    var3[i][j][0]=filt[i][j];
                    }
                    else{
                        var3[i][j][0]=0;
                    }
                }
            }
        }
        for(int i =0;i<var1;i++){
            for(int j =0;j<var2;j++){
                count1=0;
                for(int k=1;k<=var2;k++){
                    Integer[][] var4 = filter3(filt,k);
                    if(var4[i][j]==k){
                        var3[i][j][count1]=k;
                        count1++;
                    }
                }
            }
        }
        return var3;
    }
public static void guess(Integer[][] filt,int a,int b,int c){
        int var1 = filt.length;
        int var2 = filt[0].length;
        Integer[][][] var3 = resolve(filt);
        //for(int i=0;i<var1;i++){
            //for(int j=0;j<var2;j++){
                if(var3[a][b].length<=3){
                    int var4 = var3[a][b][c];
                    //var3[i][j]=new Integer[]{var3[i][j][0]};
                    filt[a][b]=var4;
                }
            //}
        //}
    }
 //public static void update(char[][] board){

    //}
}