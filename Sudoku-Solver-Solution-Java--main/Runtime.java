import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function.*
public static class Runtime{
public static boolean feasible(Integer[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        Integer[][] sheet = board;
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                for(int k=10;k<81;k++){
                
                //if(board[i][j]==board[i][k]&&j!=k){
                //    return false;
                //}
                //if(board[i][j]==board[k][j]&&i!=k){
                //    return false;
                //} 
                //if(sheet[i][j]==0){
                 //   sheet[i][j]=k;
                //}
                    /*if(((Object)board[i][j]).getClass().getName()==new String("Integer")){
                        if(!(board[i][j]>=1&&board[i][j]<=9)){
                            if(board[i][j]==0){
                        board[i][j]=k;
                            }
                        }
                    }
                    else if(!(((Object)board[i][j]).getClass().getName()==new String("Integer"))){
                        board[i][j]=k;
                    }*/
                }
            }
        }
        boolean ret = Sudoku.validate(sheet);
        return ret;
    }
   public static void impose(Integer[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        int n=0;
        int count1 = Sudoku.count(board);
        Integer[][] var3 = new Integer[var1][var2];
        while(n<=50){
        n++;
        for(int i = 0;i<var1;i++){
            for(int j =0;j<var2;j++){
                for(int k=1;k<=var2;k++){
                    //var3 = filter2(board,k);
                    Sudoku.judge(board,k,true);
                    //board[i][j]=k;
                    //if(var3[i][j]!=0){
                    //board[i][j]=var3[i][j];
                    }
                }
            }   
        }
}
public static void judge(Integer[][] filt,int a,boolean state){
        int var1 = filt.length;
        int var2 = filt[0].length;
        int count1 = 0;
        Integer x = 0;
        Integer y = 0;
        Integer[][] var3 = filter3(filt,a);
        //System.out.println(Arrays.deepToString(var3));
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(filt[i][j]==0&&var3[i][j]!=0&&singleCell(var3,i,j)){
                    count1++;
                    x=i;
                    y=j;
                    filt[i][j]=a;
                    //return true;
            }
        }
        }
        var3 = filter3(filt,a);
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(filt[i][j]==0&&var3[i][j]!=0&&singleCell(var3,i,j)){
                    count1++;
                    x=i;
                    y=j;
                    filt[i][j]=a;
                    //return true;
            }
        }
    }
    var3 = filter3(filt,a);
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(filt[i][j]==0&&var3[i][j]!=0&&singleCell(var3,i,j)){
                    count1++;
                    x=i;
                    y=j;
                    filt[i][j]=a;
                    //return true;
            }
        }
    }
    var3 = filter3(filt,a);
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(filt[i][j]==0&&var3[i][j]!=0&&singleCell(var3,i,j)){
                    count1++;
                    x=i;
                    y=j;
                    filt[i][j]=a;
                    //return true;
            }
        }
    }
        /*if(count1==1){
            //return true;
            if(state==true){
            filt[x][y]=a;
            }
            return true;
        }
        else{
            return false;
            }*/
    //        while(count1<2){
    //Sudoku.judge(filt,a,true);
    //        }
    }
public static void evaluate(Integer[][] board,int a,int b,int c){
        int var1 = board.length;
        int var2 = board[0].length;
        //for(int i = 0;i<var1;i++){
          //  for(int j =0;j<var2;j++){
               //for(int k=0;k<var2;k++){
                //Integer[][] var3 = filter2(board,k);
               // if(judge(var3,k)==true){
                 //   board[i][j]=k;
                //}
                //else{
                    Integer[][] sheet = board;
                    //Integer[][][] remainder = resolve(board);
                    Sudoku.impose(sheet);
                    if(Sudoku.feasible(sheet)){
                        for(int i=0;i<var1;i++){
                            for(int j=0;j<var2;j++){
                                board[i][j]=sheet[i][j];
                            }
                        }
                      }
                    Sudoku.guess(sheet,a,b,c);
                    int n = 0;
                    if(Sudoku.feasible(sheet)){
                        for(int i=0;i<var1;i++){
                            for(int j=0;j<var2;j++){
                                board[i][j]=sheet[i][j];
                            }
                        }
                      }
                    while(n<=8){
                        Sudoku.impose(sheet);
                        n++;
                    }
                    if(Sudoku.feasible(sheet)){
                        for(int i=0;i<var1;i++){
                            for(int j=0;j<var2;j++){
                                board[i][j]=sheet[i][j];
                            }
                        }
                      }
                    //update(board);
                    //guess(board,a,b,1);
                    //update(board);
                    //guess(board,a,b,2);a
                    //guess(board,2)
                
        }