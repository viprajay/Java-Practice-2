class ThisKeyword {

    ThisKeyword() {
        this(10);
        System.out.println("hii");
    }

    ThisKeyword(int x) {
        System.out.println(x);

    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
    }
}