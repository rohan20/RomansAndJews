package com.rohantaneja;

import java.util.Scanner;

public class RomansAndJews {

    private static Node head = null;
    private static Node last = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int deleteAtCount = scanner.nextInt();

        //create linked list
        for (int i = 0; i < N; i++) {
            Node newNode = new Node();
            newNode.data = i;

            if (i == 0) {
                head = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }

        //convert to circular linked list
        last.next = head;

        deleteAtCountAndPrint(deleteAtCount);
    }

    private static void deleteAtCountAndPrint(int position) {

        if (position == 1) {
            printList();
            return;
        }

        Node temp = head;

        //delete every node at position 'deleteAtCount'
        while (temp != temp.next) {

            if (temp == head) {
                //if you're at head, move 'position - 1' nodes ahead
                for (int i = 1; i < position - 1; i++)
                    temp = temp.next;

                head = null;
            } else {
                //if you're not at head, move 'position' nodes ahead
                for (int i = 1; i < position; i++)
                    temp = temp.next;
            }

            System.out.print(temp.next.data + " ");
            temp.next = temp.next.next;
        }

        System.out.print(temp.data);
    }

    private static void printList() {

        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }
}
