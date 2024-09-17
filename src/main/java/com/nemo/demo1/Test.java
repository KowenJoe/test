package com.nemo.demo1;

import com.google.crypto.tink.proto.Keyset;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        int size = 0;
        for (int i = 0; i < 100; i++) {
            list.add(i);
            if(getCapacity(list)>size) {
                System.out.println("capacity:"+getCapacity(list) + ",size:"+list.size());
                size = getCapacity(list);
            }
        }*/
        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("a",17);
        map.put("b",18);
        map.put("c",19);
        map.put("b",20);
        Set<String> keySet = map.keySet();
        ArrayList<String> list = new ArrayList<>(keySet);
        for (int i = 0; i < map.size(); i++) {
            String key = list.get(i);
            String value = String.valueOf(map.get(key));
            System.out.println("Key = " + key + ", Value = " + value);

        }*/
        Integer a[] = {1, 3, 6, 7, 8, 3, 15, 9, 3};
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3) {
                k++;
                switch (k) {
                    case 1:
                        a[i] = 111;
                        break;
                    case 2:
                        a[i] = 222;
                        break;
                    case 3:
                        a[i] = 333;
                        break;
                    default:
                }
            }
        }
        Integer b[] = a.clone();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

    public static Integer getCapacity(ArrayList list) {
        Integer length = null;
        Class clazz = list.getClass();
        Field field;
        try {
            field = clazz.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] object = (Object[]) field.get(list);
            length = object.length;
            return length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }

}
