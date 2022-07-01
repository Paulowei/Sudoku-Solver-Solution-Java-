import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function.*

public static class Validator{

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
}