package com.linable.helloworld.algorithm.eightQueens;

/**
 * @author HangYang.Lin
 *         on 2018-02-08.
 */
public class Queen {

    private static Integer num = 0;

    private static Integer count = 0;

    private static final int MAXQUEEN = 10;//皇后个数，同时也是棋盘行列总数

    private int[][] arr = new int[MAXQUEEN][MAXQUEEN]; //定义cols数组，表示8列棋子摆放情况


    public Queen() {
        initArr();
        putQueenAtRow(arr, 0);
        System.out.println(count);
    }

    private void initArr() {
        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public void putQueenAtRow(int chess[][], int row) {
        /**
         * 递归终止判断：如果row==N，则说明已经成功摆放了8个皇后
         * 输出结果，终止递归
         */
        if (row == MAXQUEEN) {
            num++;
            System.out.println("第 " + num + " 种解：");
            for (int i = 0; i < MAXQUEEN; i++) {
                for (int j = 0; j < MAXQUEEN; j++) {
                    System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
        int[][] chessTemp = chess.clone();
        /**
         * 向这一行的每一个位置尝试排放皇后
         * 然后检测状态，如果安全则继续执行递归函数摆放下一行皇后
         */
        for (int i = 0; i < MAXQUEEN; i++) {
            //摆放这一行的皇后，之前要清掉所有这一行摆放的记录，防止污染棋盘
            for (int j = 0; j < MAXQUEEN; j++) {
                chessTemp[row][j] = 0;
            }
            chessTemp[row][i] = 1;
            count++;
            if (isSafety(chessTemp, row, i)) {
                putQueenAtRow(chessTemp, row + 1);
            }
        }

    }

    private static boolean isSafety(int[][] chess, int row, int col) {
        //判断中上、左上、右上是否安全
        int step = 1;
        while (row - step >= 0) {
            if (chess[row - step][col] == 1) {              //中上
                return false;
            }
            if (col - step >= 0 && chess[row - step][col - step] == 1) {      //左上
                return false;
            }
            if (col + step < MAXQUEEN && chess[row - step][col + step] == 1) {       //右上
                return false;
            }
            step++;
        }
        return true;
    }
}