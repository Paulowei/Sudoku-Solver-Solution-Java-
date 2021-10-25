import java.lang.Integer;
//import java.lang.Char;
import java.lang.String;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.zip.*;
public class Sudoku{
    public static char[][] solution = new char[9][9];
    public static void solveSudoku(String[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        System.out.println(Arrays.deepToString(board));
        Integer[][] sheet=filter1(board);
        System.out.println(Arrays.deepToString(sheet));
        while(!Sudoku.validate(sheet)){
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                if(sheet[i][j]==0){
                /*System.out.println(Arrays.deepToString(sheet));
                Sudoku.evaluate(sheet,i,j,0);
                System.out.println(Arrays.deepToString(sheet));
                Sudoku.evaluate(sheet,i,j,1);
                System.out.println(Arrays.deepToString(sheet));
                Sudoku.evaluate(sheet,i,j,2);
                System.out.println(Arrays.deepToString(sheet));*/
                Sudoku.impose(sheet);
                System.out.println(Arrays.deepToString(sheet));
                System.out.println(Arrays.deepToString(sheet));
                System.out.println(Sudoku.validate(sheet));
                //if(){
                //    if(sheet[i][j]==0||sheet[i][j]==null){
                //        Sudoku.guess(i,j,0);
                //        Sudoku.guess(i,j,1);
                //        Sudoku.guess(i,j,2);
                //    }
                //}
                //if(Sudoku.validate(sheet)){
                //    break;
                //}
                }
            }
        }
    } 
        /*for(int i = 0;i<var1;i++){
            for(int j =0;j<var2;j++){
                for(int k=0;k<var2;k++){
                Integer[][] var3 = filter2(board,k);
                if(judge(var3,k)==true){
                    solution[i][j]=k;
                }
                else{
                    Integer[][][] remainder = resolve(board);
                    guess(board,0);
                    update(board);
                    guess(board,1);
                    update(board);
                    guess(board,2);
                    guess(board,2)
                }
                }
            }
        }*/
        int[][] ret1 = new int[sheet.length][sheet[0].length];
        for(int i=0;i<sheet.length;i++){
            for(int j=0;j<sheet[0].length;j++){
                ret1[i][j]=sheet[i][j];
                solution[i][j]=(char)(ret1[i][j]+48);
                board[i][j]=(sheet[i][j]).toString();
            }
        }
        //solution = (char[][])ret1;

    }
    /*public static int determine(Integer[][] filt){
        int var1 = filt.length;
        int var2 = filt[0].length;
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                if(filt[i][j]==0||filt[i][j]==null){
                    return filt[i][j];
                }
            }
        }
    }*/
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
                    //guess(board,a,b,2);
                    //guess(board,2)
                
        }
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
    public static int count(Integer[][] board){
        int var1 = board.length;
        int var2 = board[0].length;  
        Integer[][] sheet = filter1(board);
        int count1 =0;
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                if(sheet[i][j]==0
                ){
                    count1++;
                }
            }
        }
        return count1;
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
    
        //for(int i=0;i<var1;i++){
        //    for(int j=0;j<var2;j++){

        //}
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
    public static Integer[][] filter1(String[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        int[][] sheet = new int[var1][var2];
        Integer[][] filt = new Integer[var1][var2];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
               //Char[][] sheet = (Char[][])board;
                //sheet[i][j]=(int)board[i][j];
                //filt[i][j]=sheet[i][j];
                if(board[i][j]!="."){
                filt[i][j]=Integer.parseInt(board[i][j]);
                }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=="."){
                    filt[i][j] = 0;
                }
            }
        }
        return filt;
    }
    public static Integer[][] filter1(Integer[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        Integer[][] filt = new Integer[var1][var2];
        //Char[][] sheet = new Char[][]{(Char[][])board};
        int[][] sheet = new int[var1][var2];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==0){
                    filt[i][j]=0;
                }else{
                filt[i][j]=board[i][j];
                }
            }
        }
        /*for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==0){
                    filt[i][j] = 0
                    ;
                }
            }
        }*/
        return filt;
    }
    public static Integer[][] filter2(Integer[][] board,int a){
        int var1 = board.length;
        int var2 = board[0].length;
        Integer[][] surf = filter1(board);
        Integer[][] filt = filter1(board);
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(surf[i][j]==0){
                surf[i][j]=a;
                }
            }
        }
        for(int i =0 ;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(board[i][j]==a){
                    for(int l = 0;l<var1;l++){
                        surf[l][j]=0;
                        //surf[i][j]=board[i][j];
                    }
                    for(int k = 0;k < var2; k++){
                        surf[i][k]=0;
                        surf[i][j]=a;
                    }
                
                if(i%3==0 && j%3==0){
                    for(int k = 0;k <= 2;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                            surf[i+k][j+l]=0;
                            }
                            surf[i][j]=a;
                               
                        }
                    }
                }
                if(i%3==1 && j%3==0){
                    for(int k = -1;k <= 1;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                           surf[i][j]=a;
                        }
                    }
                }
                if(i%3==2 && j%3==0){
                    for(int k = -2;k <= 0;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }
                if(i%3==0 && j%3==1){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }
                if(i%3==1 && j%3==1){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }
                if(i%3==2 && j%3==1){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }
                if(i%3==0 && j%3==2){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }
                if(i%3==1 && j%3==2){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -2;l <= 0 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a;
                        }
                    }
                }                
                if(i%3==2 && j%3==2){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            surf[i][j]=a; 
                        }
                    }
                }
            }
        }
        }
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                if(filt[i][j]!=0){
                    surf[i][j]=filt[i][j];
                }
            }
        }
        return surf;
    }
    public static Integer[][] filter3(Integer[][] board,int a){
        int var1 = board.length;
        int var2 = board[0].length;
        Integer[][] surf = filter2(board,a);
        Integer[][] filt = filter2(board,a);
        //Integer[][] ret = filter2(board,a);
        for(int i =0 ;i<var1;i++){
            for(int j = 0;j<var2;j++){
                if(board[i][j]==a){
                if(i%3==0 && j%3==0){
                    int count1 = 0;
                    int count2 = 0;
                    for(int k = 0;k <= 2;k++){
                        for(int l = 1;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                            //surf[i+k][j+l]=0;
                                if(surf[i+k][j+l]!=a){
                                count1++;
                            }
                            }
                            //surf[i][j]=a;
                        }
                    }
                    for(int q = 1;q <= 2;q++){
                        for(int r = 0;r <=2 ;r++){
                            if(((q+r)+(q*r))!=0){
                            //surf[i+k][j+l]=0;
                                if(surf[i+q][j+r]!=a){
                                count2++;
                            }
                            }
                            //surf[i][j]=a;
                        }
                    }
                    if(count1>=6&&(surf[i+1][j]==a||surf[i+2][j]==a)){
                        for(int m=0;m<var2;m++){
                            surf[m][j]=0;
                        }
                    surf[i][j]=a;
                    surf[i+1][j]=a;
                    surf[i+2][j]=a;
                    }
                    if(count2>=6&&(surf[i][j+1]==a||surf[i][j+2]==a)){
                        for(int m=0;m<var2;m++){
                            surf[i][m]=0;
                        }
                    surf[i][j]=a;
                    surf[i][j+1]=a;
                    surf[i][j+2]=a;
                    }
                }
                if(i%3==1 && j%3==0){
                    int count1 = 0;
                    for(int k = -1;k <= 1;k+=2){
                        for(int l = 0;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                                if(surf[i+k][j+l]!=a){
                                    count1++; 
                                //surf[i+k][j+l]=0;
                                }
                            }
                           //surf[i][j]=a;
                        }
                    }
                    if(count1>=6&&(surf[i][j+1]==a||surf[i][j+2]==a)){
                        for(int m=0;m<var2;m++){
                            surf[i][m]=0;
                        }
                    
                    surf[i][j]=a;
                    surf[i][j+1]=a;
                    surf[i][j+2]=a;
                    }
                }
                if(i%3==2 && j%3==0){
                    int count1 = 0;
                    for(int k = -2;k <= -1;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(((k+l)+(k*l))!=0){
                                //surf[i+k][j+l]=0;
                                if(surf[i+k][j+l]!=a){
                                    count1++; 
                                //surf[i+k][j+l]=0;
                                }

                                }
                            //surf[i][j]=a;
                        }
                    }
                    if(count1>=6&&(surf[i][j+1]==a||surf[i][j+2]==a)){
                        for(int m=0;m<var2;m++){
                            surf[i][m]=0;
                        }
                        surf[i][j]=a;
                        surf[i][j+1]=a;
                        surf[i][j+2]=a;
                    }
                }
                if(i%3==0 && j%3==1){
                    int count1 = 0;
                    for(int k = 0;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l+=2){
                            if(((k+l)+(k*l))!=0){
                                //surf[i+k][j+l]=0;
                                if(surf[i+k][j+l]!=a){
                                    count1++;
                                }
                            }
                            //surf[i][j]=a;
                        }
                    }
                    if(count1==6&&(surf[i+1][j]==a||surf[i+2][j]==a)){
                        for(int m=0;m<var2;m++){
                            surf[m][j]=0;
                        }
                        surf[i][j]=a;
                        surf[i+1][j]=a;
                        surf[i+2][j]=a;
                    }
                }
                if(i%3==1 && j%3==1){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            //surf[i][j]=a;
                        }
                    }
                }
                if(i%3==2 && j%3==1){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            //surf[i][j]=a;
                        }
                    }
                }
                if(i%3==0 && j%3==2){
                    int count1=0;
                    for(int k = 0;k <= 2;k++){
                        for(int l = -2;l <=-1 ;l++){
                            if(((k+l)+(k*l))!=0){
                                //surf[i+k][j+l]=0;
                                if(surf[i+k][j+l]!=a){
                                    count1++;
                                }
                                }
                            //surf[i][j]=a;
                        }
                    }
                    if(count1==6&&(surf[i+1][j]==a||surf[i+2][j]==a)){
                        for(int m=0;m<var2;m++){
                            surf[m][j]=0;
                            
                        }
                    surf[i][j]=a;
                    surf[i+1][j]=a;
                    surf[i+2][j]=a;
                    }
                }
                if(i%3==1 && j%3==2){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -2;l <= 0 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            //surf[i][j]=a;
                        }
                    }
                }                
                if(i%3==2 && j%3==2){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(((k+l)+(k*l))!=0){
                                surf[i+k][j+l]=0;
                                }
                            //surf[i][j]=a; 
                        }
                    }
                }
            }
        }
        }
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                if(filt[i][j]!=0){
                    surf[i][j]=filt[i][j];
                }
            }
        }
        return surf;
    }
    public static boolean singleCell(Integer[][] filt,int a, int b){
        int var1 = filt.length;
        int var2 = filt[0].length;
        int count1=0;
        int count2=0;
        int count3=0;
        int var3 = 0;
        Boolean state = null;
        for(int f=0;f<var1;f++){
            //for(int j=0;j<var2;j++){f
                if(filt[a][b]==filt[a][f]&&b!=f){
                    count1++;
                    //continue;
                    //return false;
                }
            }
            for(int g=0;g<var1;g++){
            if(filt[a][b]==filt[g][b]&&a!=g){
                    count2++;
                    //continue;
                    //return false;
                }
                
           // }
        }
        if(count1<1){
            return true;
        }
        if(count2<1){
            return true;
        }
        
                if(a%3==0 && b%3==0){
                    for(int k = 0;k <= 2;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }      
                        }
                    }
                }
                if(a%3==1 && b%3==0){
                    for(int k = -1;k <= 1;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==2 && b%3==0){
                    for(int k = -2;k <= 0;k++){
                        for(int l = 0;l <=2 ;l++){
                           if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                               var3=1;
                           }
                        }
                    }
                }
                if(a%3==0 && b%3==1){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==1 && b%3==1){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                 var3=1;
                            }
                        }
                    }
                }
                if(a%3==2 && b%3==1){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==0 && b%3==2){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==1 && b%3==2){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -2;l <= 0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                             var3=1;
                            }
                        }
                    }
                }                
                if(a%3==2 && b%3==2){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                        }
                    }
        count3+=var3;
        if(count3<1){
            return true;
        } 
        //if(count1==0||count2==0||count3==0){
        //    return true;
        //}
        //else{
        //    return false;
        //}
        //return true;
            return false;}
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
                    Integer[][] var4 = filter2(filt,k);
                    if(var4[i][j]==k){
                        var3[i][j][count1]=k;
                        count1++;
                    }
                }
            }
        }
        return var3;
    }
    //public static void update(char[][] board){

    //}
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
    public static void unguess(Integer[][] filt,int a,int b){
        filt[a][b]=0;
    }
    //public static boolean solved(Integer[][] filt){
    //}
    public static boolean validate(Integer[][] board){
        int var1 = board.length;
        int var2 = board[0].length;
        int validator = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Boolean state = null;
        for(int i = 0;i < var1;i++){
            for(int j = 0;j< var2;j++){
                //if(board[i][j]!=0){
                for(int k=0;k<var2;k++){
                if(board[i][j]==board[i][k] && k!=j ){
                count1+=1;
                }    
            }
            //}
        }
        }
        if(count1>=1){
            return false;
        }
        else{
            validator+=1;
        }
        for(int i = 0;i < var1;i++){
            for(int j = 0;j< var2;j++){
                //if(board[i][j]!=0){
                for(int k=0;k<var2;k++){
                if(board[i][j]==board[k][j] && i!=k ){
                count2+=1;
                }    
            }
        //}
        }
            if(count2>=1){
                return false;
            }
            else{
                validator+=1;
            }
        }
        for(int i = 0;i<var1;i++){
            for(int j = 0;j<var2;j++){
                //if(board[i][j]!=0){
                if(i%3==0 && j%3==0){
                    for(int k = 0;k <= 2;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==0){
                    for(int k = -1;k <= 1;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                    count3+=1;
                            }
                        }
                    }
                }
                if(i%3==2 && j%3==0){
                    for(int k = -2;k <= 0;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                    count3+=1;
                            }
                        }
                    }
                }
                if(i%3==0 && j%3==1){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==1){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==2 && j%3==1){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==0 && j%3==2){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==2){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -2;l <= 0 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }                
                if(i%3==2 && j%3==2){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(board[i][j]==board[i+k][j+l]&&((k+l)*(k*l))!=0){
                                count3+=1;
                            }
                        }
                    }
                }
            //}
        }
        }
        if(count3>=1){
         return  false;
        }
        else{
            validator+=1;
        }
        if(validator>=3){
            state = true;

        }
        return state;
    }
    public static void main(String[] args){
        //Sudoku sol = new Sudoku();
        String[][] char3 = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},
        {".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},
        {"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},
        {".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},
        {".",".",".",".","8",".",".","7","9"}};
        String[][] char1 = {{".",".","9","7","4","8",".",".","."},{"7",".",".",".",".",".",".",".","."},{".","2",".","1",".","9",".",".","."},
        {".",".","7",".",".",".","2","4","."},{".","6","4",".","1",".","5","9","."},{".","9","8",".",".",".","3",".","."},
        {".",".",".","8",".","3",".","2","."},{".",".",".",".",".",".",".",".","6"},{".",".",".","2","7","5","9",".","."}};
        //Sudoku.solveSudoku(char1);
        char[][] char2 = {{5,6},{7,8}};
        //System.out.println(Arrays.deepToString(solution));
        //System.out.println(Arrays.deepToString(filter1(char1)));
        Integer[][] var1 = Sudoku.filter1(char1);
        Integer[][] var2 = Sudoku.filter2(var1,4);
        //System.out.println(Sudoku.singleCell(var2,4,2));
        System.out.println(Arrays.deepToString(var2));
        Sudoku.judge(var1,4,true);
        System.out.println(Arrays.deepToString(var1));
        //    System.out.println(Arrays.deepToString(var1));
        //System.out.println(Sudoku.singleCell(var1,4,2));
        Sudoku.solveSudoku(char1);
        System.out.println("Testing");
        System.out.println(Arrays.deepToString(solution));
        //for(int i=0;i<200;i++){
        //    System.out.print(i+":"+(char)i+" ");
        //}
        //System.out.println(Sudoku.singleCell(var2,2,3));
        //System.out.println(Sudoku.singleCell(var2,2,4));
        //System.out.println(var2[2][3]==var2[2][4]);
        //System.out.println(var2[2][3]);
        //System.out.println(var2[2][4]); 
        //System.out.println(char1.length);
        //System.out.println(char1[0].length);
        // new char[2][2];
        //char2 = {{5,6},{7,8}};
        //System.out.println((int)("5"));
        //[[0, 0, 9, 7, 4, 8, 0, 0, 2], [7, 0, 0, 6, 0, 2, 0, 0, 9], [0, 2, 0, 1, 0, 9, 0, 0, 0],
        // [0, 0, 7, 9, 8, 6, 2, 4, 1], [2, 6, 4, 3, 1, 7, 5, 9, 8], [1, 9, 8, 5,2, 4, 3, 6, 7], 
        //[9, 0, 0, 8, 6, 3, 0, 2, 0], [0, 0, 2, 4, 9, 1, 0, 0, 6], [0, 0, 0, 2, 7, 5, 9, 0, 0]]
        
        //[[0, 0, 9, 7, 4, 8, 0, 0, 2], [7, 0, 0, 6, 0, 2, 0, 0, 9], [0, 2, 0, 1, 0, 9, 0, 0, 0],
        // [0, 0, 7, 9, 8, 6, 2, 4, 1], [2, 6, 4, 3, 1, 7, 5, 9, 8], [1, 9, 8, 5, 2, 4, 3, 6, 7], 
        //[9, 0, 0, 8, 6, 3, 0, 2, 0], [0, 0, 2, 4, 9, 1, 0, 0, 6], [0, 0, 0, 2, 7, 5, 9, 0, 0]]

    }
}