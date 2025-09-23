/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q1 - Given a number n, print the following pattern without using any loop. n,
 * n-5, n-10, …, 0, 5, 10, …, n-5, n Input1: n = 16 Output1: 16, 11, 6, 1, -4,
 * 1, 6, 11, 16.
 *
 * @author c068
 */
public class PWAssignmentQ1 {

    static void printPattern(int n, int m, boolean flag) {
        System.out.println(m);
        if (flag == false && n == m) {
            return;
        }
        if (flag) {
            if (m - 5 > 0) {
                printPattern(n, m - 5, true);
            } else {
                printPattern(n, m - 5, false);
            }
        } else {
            printPattern(n, m + 5, false);
        }

    }

    public static void main(String[] args) {
        printPattern(16, 16, true);
    }
}
