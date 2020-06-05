package com.ascending.training.algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoAlgo{
    public static void main(String[] args){
        int[][] grid = {
                {1,0,0,1},
                {1,1,0,1},
                {0,0,0,0},
                {1,0,0,1}
        };

        DemoAlgo a = new DemoAlgo();
        System.out.println(a.countIsland(grid));

    }

    public int countIsland(int[][] grid){
        int res = 0;
        for (int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    res++;
                    flipIsland(grid, i, j);
                }
            }
        }
        return res;
    }

    // Whenever we go through an island, we flip the island to sea.
    boolean flipIsland(int[][] grid, int m, int n){
        if (m < 0 | m >= grid.length | n < 0 | n >=  grid[0].length){
            return false;
        }
        else {
            if(grid[m][n] == 0){
                return false;
            }
            grid[m][n] = 0;
            flipIsland(grid, m-1, n);
            flipIsland(grid, m+1, n);
            flipIsland(grid, m, n-1);
            flipIsland(grid, m, n+1);
            return true;
        }
    }
}
