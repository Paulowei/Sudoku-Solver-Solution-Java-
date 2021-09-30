import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import java.awt.Robot;
import java.awt.AWTException;
import java.lang.InterruptedException;
import java.lang.Thread;
//import org.springframework.util.StringUtils;

public class SudokuGrid extends Thread implements Runnable{
    int width;
    int height;
    Integer[][] grid;
    boolean solved;
    String name;
    public static Integer count = Integer.valueOf(1);
    public SudokuGrid(String name,int width,int height){
        this.name = name;
        this.width = width;
        this.height = height;
        this.grid = new Integer[width][height];
    }
    public SudokuGrid(){
        this("Sudoku".concat(count.toString()),9,9);
    }
    public SudokuGrid(Integer[][] array1){
        for(int i = 0;i < array1.length;i++){
            for(int j = 0;j < array1[i].length;i++){
                this.grid[i][j] = array1[i][j];
            }
        }
    }
    public static SudokuGrid insert(int width,int height){
        SudokuGrid sudokuGrid = new SudokuGrid("Sudoku".concat(count.toString()),width,height);
        Random  random = new Random();
        for(int i =0;i<width;i++){
            for(int j = 0;j<height;j++){
                int var1 = random.nextInt()%10;
                int var2 = Math.abs(var1);
                sudokuGrid.grid[i][j]= var2;
            }
        }
        return sudokuGrid;
    }
    public static SudokuGrid getPuzzle(int width,int height){
        InputStreamReader var1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(var1);
        SudokuGrid sudokuGrid = new SudokuGrid("Sudoku".concat(count.toString()),width,height);
        for(int i = 0; i < width; i++){
            for(int j =0; j < height; j++){
                try{
                String var2 = br.readLine();
                int var3 = Integer.parseInt(var2);
                sudokuGrid.grid[i][j]=var3;
                }catch(IOException E){
                System.err.println(E.toString());
            }
            }
        }
        return sudokuGrid;
    }
    public void putPuzzle(){
        System.out.print("[");
        for(int i = 0;i < this.width;i++){
                System.out.print("[");
            for(int j = 0;j < this.height;j++){
                System.out.print(this.grid[i][j]);
                System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
    public void clear(){
        for(int i = 0; i< this.width;i++){
            for(int j = 0;j<this.height;j++){
                this.grid[i][j]=null;
            }
        }
    }
    public boolean validate(){
        int validator = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Boolean state = null;
        for(int i = 0;i < this.width;i++){
            for(int j = 0;j< this.height;j++){
                for(int k=0;k<this.height;k++){
                if(this.grid[i][j]==this.grid[i][k] && i!=k ){
                count1+=1;
                }    
            }
        }
        }
        if(count1>=1){
            return false;
        }
        else{
            validator+=1;
        }
        for(int i = 0;i < this.width;i++){
            for(int j = 0;j< this.height;j++){
                for(int k=0;k<this.width;k++)
                if(this.grid[i][j]==this.grid[k][j] && j!=k ){
                count2+=1;
                }    
            }
            if(count2>=1){
                return false;
            }
            else{
                validator+=1;
            }
        }
        for(int i = 0;i<this.width;i++){
            for(int j = 0;j<this.height;j++){
                if(i%3==0 && j%3==0){
                    for(int k = 1;k <= 2;k++){
                        for(int l = 1;l <=2 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==0){
                    for(int k = -1;k <= 1;k+=2){
                        for(int l = 1;l <=2 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                    count3+=1;
                            }
                        }
                    }
                }
                if(i%3==2 && j%3==0){
                    for(int k = -2;k <= -1;k++){
                        for(int l = 1;l <=2 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                    count3+=1;
                            }
                        }
                    }
                }
                if(i%3==0 && j%3==1){
                    for(int k = 1;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l+=2){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==1){
                    for(int k = -1;k <= 1 ;k+=2){
                        for(int l = -1;l <= 1 ;l+=2){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==2 && j%3==1){
                    for(int k = -2;k <= -1;k++){
                        for(int l = -1;l <= 1 ;l+=2){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==0 && j%3==2){
                    for(int k = 1;k <= 2;k++){
                        for(int l = -2;l <=-1 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
                if(i%3==1 && j%3==2){
                    for(int k = -1;k <= 1 ;k+=2){
                        for(int l = -2;l <= -1 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }                
                if(i%3==2 && j%3==2){
                    for(int k = -2;k <= -1;k++){
                        for(int l = -2;l <=-1 ;l++){
                            if(this.grid[i][j]==this.grid[i+k][j+l]){
                                count3+=1;
                            }
                        }
                    }
                }
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
    public synchronized static SudokuGrid generate(int width,int height){
        SudokuGrid sudokuGrid;
        sudokuGrid = SudokuGrid.insert(width,height);
        if(sudokuGrid.validate()==true){
                return sudokuGrid;
            }
            else{
        return generate(width,height);
        }
    } 
    public String toString(){
        String str = Arrays.deepToString(this.grid);
        return str;
        }
    public void run(){
        SudokuGrid s1 = SudokuGrid.generate(9,9);
        boolean state = s1.validate();
        System.out.println(state);
        System.out.println(s1.toString());
    }
    public static synchronized void impose(Thread T){
        try{
        Robot robot  = new Robot();
        T.start();
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        robot.delay(60000);
        T.wait();
    }catch(AWTException| InterruptedException E){
            E.printStackTrace();
        }
    }
    public SudokuGrid sortGrid(){
        SudokuGrid sudokuGrid = new SudokuGrid(this.grid);
        return sudokuGrid;
    }
    public static void main(String[] args){
        SudokuGrid var1 = SudokuGrid.insert(9,9);
        boolean state = var1.validate();
        System.out.println(state);
        System.out.println(var1.toString());
        //Thread Thread1 = new SudokuGrid();
        //Thread Thread2 = new SudokuGrid();
        //SudokuGrid.impose(Thread1);
        //SudokuGrid.impose(Thread2);
    }
}
    



