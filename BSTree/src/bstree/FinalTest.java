/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

public class FinalTest extends BSTree {

    public static void main(String[] args) {

        BSTree a = new BSTree();
        a.insert(25);
        a.insert(20);
        a.insert(36);
        a.insert(10);
        a.insert(30);
        a.insert(40);
        a.insert(5);
        a.insert(12);
        a.insert(28);
        a.insert(48);
        a.insert(1);
        a.insert(8);
        a.insert(15);// answer for Q1
        System.out.println("print all tree values level order: ");
        a.method1();// answer for Q2.B
        System.out.println("print all descendants of 10 *since its descendants means including itself* ");
        a.method2(10);// answer for Q3.B

        //**** Complete this method to answer Question 1, Question 2.B, and Question 3.B
    }

}
