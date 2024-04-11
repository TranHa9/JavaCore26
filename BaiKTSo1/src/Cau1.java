public class Cau1 {
    public static void main(String[] args) {
        System.out.println("Hình vuông:");
        insertSquare();
        System.out.println("Hình tam giác:");
        insertTriangle();
    }
    public static void insertSquare(){
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
    public static void insertTriangle(){
        int row = 4;
        int col = 4;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++ ){
            for(int j = 0; j < col; j++){
                if(i==j||i>j){
                    System.out.print("*" + "\t");
                }else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
}
