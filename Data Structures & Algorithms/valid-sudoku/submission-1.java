class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] refArray=new boolean[10][10];

        for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
            if(board[i][j]!='.'){
                if(refArray[i][board[i][j]-'0'])
                    return false;
              refArray[i][board[i][j]-'0']=true;
             }
           }
        }

        refArray = new boolean[10][10];

        for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
            if(board[i][j]!='.'){
                if(refArray[j][board[i][j]-'0'])
                    return false;
              refArray[j][board[i][j]-'0']=true;
            }
           }
        }

        refArray = new boolean[10][10];

        for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               int index=i/3 + (j/3) * 3;
              // System.out.println(index);
                if(board[i][j]!='.'){
                if(refArray[index][board[i][j]-'0'])
                    return false;
              refArray[index][board[i][j]-'0']=true;
            }

           }
        }

        return true;
    }
}
