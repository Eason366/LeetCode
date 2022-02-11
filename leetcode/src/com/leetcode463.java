package com;

public class leetcode463 {

    public static void main(String[] args) {
        int[][] grid = new int[][] {{1}};
        int n = islandPerimeter(grid);
        System.out.println(n);

    }

    private static int islandPerimeter(int[][] grid) {

        int count = 0;
        int side = 0;

        for (int i=0; i< grid.length;i++){

            for (int j=0; j< grid[i].length;j++){

                if (grid[i][j] == 1) {
                    count++;
                    if (i+1< grid.length && j+1<grid[i].length){
                        if (grid[i+1][j] == 1) side += 2;
                        if (grid[i][j+1] == 1) side += 2;
                    }
                    if (i+1 == grid.length&&j+1<grid[i].length){
                        if (grid[i][j+1] == 1) side += 2;
                    }
                    if (j+1==grid[i].length&&i+1< grid.length){
                        if (grid[i+1][j] == 1) side += 2;
                    }

                }
            }
        }
        return count*4-side;
    }


}
