// rima ananda & 13020210238

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0238 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0238 obj = new Central0238();
        System.out.println("main");
        obj.aaa();
    }
}