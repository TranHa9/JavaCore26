public class HomeWork2 {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        int[][] A = new int[row][col];

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i==0 || i == row-1 || j==0 || j== col-1){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }

            }
            System.out.println();
        }

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i==j|| i+j ==row-1){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }

            }
            System.out.println();
        }

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i >= j){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }

            }
            System.out.println();
        }
    }
}
