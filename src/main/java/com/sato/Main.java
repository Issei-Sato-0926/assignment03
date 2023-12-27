package com.sato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("佐藤");
        names.add("鈴木");
        names.add("田中");
        names.add("高橋");
        names.add("山田");

        System.out.println("要素の数は" + names.size() + "です");
        System.out.println("0番目の要素を表示：" + names.get(0));
        System.out.println("1番目の要素を表示：" + names.get(1));
        System.out.println("2番目の要素を表示：" + names.get(2));
        System.out.println("3番目の要素を表示：" + names.get(3));
        System.out.println("4番目の要素を表示：" + names.get(4));

        try {
            System.out.println("4番目の要素を表示：" + names.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("要素が存在しません");
        }
    }
}