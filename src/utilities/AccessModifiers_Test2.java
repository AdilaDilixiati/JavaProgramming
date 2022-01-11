package utilities;

import day34_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData);  =>default is not visible outside the package.
        //System.out.println(AccessModifiers.privateData);  =>private is not visible outside the class.

        AccessModifiers.method1();
        //AccessModifiers.method2(); => default cannot be called outside the package.
        //AccessModifiers.method3(); => private cannot be called outside the class.
    }
}
