package lx.pubmaven.lib1;

import lx.com.androiddepends.AndroidDepends;

/**
 * @author xinlei
 */

public class AndroidLib1Test {

    public void androidTest1() {
        System.out.println("============= test1 =============");

        // 测试依赖打包
        new AndroidDepends().testDeoends();
    }
}
