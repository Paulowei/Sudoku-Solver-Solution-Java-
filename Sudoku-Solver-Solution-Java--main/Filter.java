import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function*
public static class Filter{
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
	//This function helps to Eliminate all positions where the specified number(int a), cannot be found
	//It is a non-recursive function that checks the rows, columns, and boxes where the 
	//Specified digit is found, and places zeros in those positions ;
	//It is superseded by a function Filter1, and succeeded by a function 
	//Filter2 ;
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
 			surf[i][j]=a;
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
}